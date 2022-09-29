package com.seancoyle.launch_usecases.pokelist


import com.seancoyle.core.cache.CacheResponseHandler
import com.seancoyle.core.di.IODispatcher
import com.seancoyle.core.network.safeCacheCall
import com.seancoyle.core.state.*
import com.seancoyle.launch_datasource.cache.pokeinfo.PokemonInfoCacheDataSource
import com.seancoyle.launch_viewstate.PokemonViewState
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetNumPokeListFromCacheUseCase(
    @IODispatcher private val ioDispatcher: CoroutineDispatcher,
    private val cacheDataSource: PokemonInfoCacheDataSource
) {

    operator fun invoke(
        stateEvent: StateEvent
    ): Flow<DataState<PokemonViewState>?> = flow {

        val cacheResult = safeCacheCall(ioDispatcher) {
            cacheDataSource.getTotalEntries()
        }
        val response = object : CacheResponseHandler<PokemonViewState, Int>(
            response = cacheResult,
            stateEvent = stateEvent
        ) {
            override suspend fun handleSuccess(resultObj: Int): DataState<PokemonViewState> {
                val viewState = PokemonViewState(
                    numPokemonInCache = resultObj
                )
                return DataState.data(
                    response = Response(
                        message = GET_NUM_LAUNCH_ITEMS_SUCCESS,
                        uiComponentType = UIComponentType.None,
                        messageType = MessageType.Success
                    ),
                    data = viewState,
                    stateEvent = stateEvent
                )
            }
        }.getResult()

        emit(response)
    }

    companion object {
        const val GET_NUM_LAUNCH_ITEMS_SUCCESS = "Successfully retrieved the number of launch items from the cache."
    }
}