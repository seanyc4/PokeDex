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

class GetLaunchItemByIdFromCacheUseCase(
    @IODispatcher private val ioDispatcher: CoroutineDispatcher,
    private val cacheDataSource: PokemonCacheDataSource
) {

    operator fun invoke(
        id: Int,
        stateEvent: StateEvent
    ): Flow<DataState<PokemonViewState>?> = flow {

        val cacheResult = safeCacheCall(ioDispatcher) {
            cacheDataSource.getById(
                id = id
            )
        }

        val response = object : CacheResponseHandler<PokemonViewState, LaunchModel?>(
            response = cacheResult,
            stateEvent = stateEvent
        ) {
            override suspend fun handleSuccess(resultObj: LaunchModel?): DataState<PokemonViewState> {
                var message: String? =
                    GET_LAUNCH_ITEM_BY_ID_SUCCESS
                var uiComponentType: UIComponentType? = UIComponentType.None
                if (resultObj == null) {
                    message =
                        GET_LAUNCH_ITEM_BY_ID_NO_MATCHING_RESULTS
                    uiComponentType = UIComponentType.Toast
                }
                return DataState.data(
                    response = Response(
                        message = message,
                        uiComponentType = uiComponentType as UIComponentType,
                        messageType = MessageType.Success
                    ),
                    data = PokemonViewState(
                        launch = resultObj
                    ),
                    stateEvent = stateEvent
                )
            }
        }.getResult()

        emit(response)
    }

    companion object {
        const val GET_LAUNCH_ITEM_BY_ID_SUCCESS = "Successfully retrieved launch item by id"
        const val GET_LAUNCH_ITEM_BY_ID_NO_MATCHING_RESULTS =
            "There are no launch items that match that query."
    }
}







