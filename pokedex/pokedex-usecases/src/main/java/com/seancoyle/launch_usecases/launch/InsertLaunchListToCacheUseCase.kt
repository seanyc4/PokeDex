package com.seancoyle.launch_usecases.launch

import com.seancoyle.core.cache.CacheResponseHandler
import com.seancoyle.core.di.IODispatcher
import com.seancoyle.core.network.safeCacheCall
import com.seancoyle.core.state.*
import com.seancoyle.launch_datasource.cache.PokemonCacheDataSource
import com.seancoyle.launch_models.model.launch.LaunchModel
import com.seancoyle.launch_viewstate.PokemonViewState
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class InsertLaunchListToCacheUseCase(
    @IODispatcher private val ioDispatcher: CoroutineDispatcher,
    private val cacheDataSource: PokemonCacheDataSource
) {

    operator fun invoke(
        launchList: List<LaunchModel>,
        stateEvent: StateEvent
    ): Flow<DataState<PokemonViewState>?> = flow {


        val cacheResult = safeCacheCall(ioDispatcher) {
            cacheDataSource.insertList(launchList)
        }

        val cacheResponse = object : CacheResponseHandler<PokemonViewState, LongArray>(
            response = cacheResult,
            stateEvent = stateEvent
        ) {
            override suspend fun handleSuccess(resultObj: LongArray): DataState<PokemonViewState> {
                return if (resultObj.isNotEmpty()) {
                    val viewState =
                        PokemonViewState(
                            pokemonList = launchList
                        )
                    DataState.data(
                        response = Response(
                            message = INSERT_LAUNCH_LIST_SUCCESS,
                            uiComponentType = UIComponentType.Toast,
                            messageType = MessageType.Success
                        ),
                        data = viewState,
                        stateEvent = stateEvent
                    )
                } else {
                    DataState.data(
                        response = Response(
                            message = INSERT_LAUNCH_LIST_FAILED,
                            uiComponentType = UIComponentType.Toast,
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

    companion object {
        const val INSERT_LAUNCH_LIST_SUCCESS = "Successfully inserted new launch list."
        const val INSERT_LAUNCH_LIST_FAILED = "Failed to insert new launch list."
    }
}