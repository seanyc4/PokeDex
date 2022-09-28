package com.seancoyle.launch_usecases.launch

import com.seancoyle.core.cache.CacheResponseHandler
import com.seancoyle.core.di.IODispatcher
import com.seancoyle.core.network.ApiResponseHandler
import com.seancoyle.core.network.safeApiCall
import com.seancoyle.core.network.safeCacheCall
import com.seancoyle.core.state.*
import com.seancoyle.launch_datasource.cache.PokemonCacheDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_models.model.launch.LaunchModel
import com.seancoyle.launch_models.model.launch.LaunchOptions
import com.seancoyle.launch_viewstate.PokemonViewState
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetLaunchListFromNetworkAndInsertToCacheUseCase
constructor(
    @IODispatcher private val ioDispatcher: CoroutineDispatcher,
    private val cacheDataSource: PokemonCacheDataSource,
    private val pokemonNetworkDataSource: PokemonNetworkDataSource
) {

    operator fun invoke(
        launchOptions: LaunchOptions,
        stateEvent: StateEvent
    ): Flow<DataState<PokemonViewState>?> = flow {

        val networkResult = safeApiCall(ioDispatcher) {
            pokemonNetworkDataSource.getPokemonList(launchOptions = launchOptions)
        }

        val networkResponse = object : ApiResponseHandler<PokemonViewState, List<LaunchModel>?>(
            response = networkResult,
            stateEvent = stateEvent
        ) {
            override suspend fun handleSuccess(resultObj: List<LaunchModel>?): DataState<PokemonViewState> {
                return if (resultObj != null) {
                    val viewState =
                        PokemonViewState(
                            pokemonList = resultObj
                        )
                    DataState.data(
                        response = null,
                        data = viewState,
                        stateEvent = null
                    )
                } else {
                    DataState.data(
                        response = Response(
                            message = LAUNCH_NETWORK_EMPTY,
                            uiComponentType = UIComponentType.Toast,
                            messageType = MessageType.Error
                        ),
                        data = null,
                        stateEvent = stateEvent
                    )
                }
            }

            override suspend fun handleFailure(): DataState<PokemonViewState> {
                return DataState.error(
                    response = Response(
                        message = LAUNCH_ERROR,
                        uiComponentType = UIComponentType.Toast,
                        messageType = MessageType.Error
                    ),
                    stateEvent = stateEvent
                )
            }
        }.getResult()

        if (networkResponse?.stateMessage?.response?.message == LAUNCH_ERROR) {
            emit(networkResponse)
        }

        // Insert to Cache
        if (networkResponse?.data?.pokemonList != null) {

            val launchList = networkResponse.data?.pokemonList!!

            val cacheResult = safeCacheCall(ioDispatcher) {
                cacheDataSource.insertList(launchList)
            }

            val cacheResponse = object : CacheResponseHandler<PokemonViewState, LongArray>(
                response = cacheResult,
                stateEvent = stateEvent
            ) {
                override suspend fun handleSuccess(resultObj: LongArray): DataState<PokemonViewState> {
                    return if (resultObj.isNotEmpty()) {
                        DataState.data(
                            response = Response(
                                message = LAUNCH_INSERT_SUCCESS,
                                uiComponentType = UIComponentType.None,
                                messageType = MessageType.Success
                            ),
                            data = null,
                            stateEvent = stateEvent
                        )
                    } else {
                        DataState.data(
                            response = Response(
                                message = LAUNCH_INSERT_FAILED,
                                uiComponentType = UIComponentType.None,
                                messageType = MessageType.Error
                            ),
                            data = null,
                            stateEvent = stateEvent
                        )
                    }
                }
            }.getResult()
            emit(cacheResponse)
        }
    }

    companion object {
        const val LAUNCH_NETWORK_EMPTY = "No data returned from network."
        const val LAUNCH_ERROR = "Error updating launch items from network.\n\nReason: Network error"
        const val LAUNCH_INSERT_SUCCESS = "Successfully inserted launch items from network."
        const val LAUNCH_INSERT_FAILED = "Failed to insert launch items from network."
    }
}