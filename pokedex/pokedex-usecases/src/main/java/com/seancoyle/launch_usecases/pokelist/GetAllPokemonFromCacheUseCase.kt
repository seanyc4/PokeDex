package com.seancoyle.launch_usecases.pokelist

import com.seancoyle.core.cache.CacheResponseHandler
import com.seancoyle.core.di.IODispatcher
import com.seancoyle.core.network.safeCacheCall
import com.seancoyle.core.state.*
import com.seancoyle.launch_datasource.cache.pokelist.PokeListCacheDataSource
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_viewstate.PokemonViewState
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetAllPokemonFromCacheUseCase(
    @IODispatcher private val ioDispatcher: CoroutineDispatcher,
    private val cacheDataSource: PokeListCacheDataSource
){

    operator fun invoke(
        stateEvent: StateEvent
    ): Flow<DataState<PokemonViewState>?> = flow {

        val cacheResult = safeCacheCall(ioDispatcher){
            cacheDataSource.getAll()
        }

        val response = object: CacheResponseHandler<PokemonViewState, List<Pokemon>?>(
            response = cacheResult,
            stateEvent = stateEvent
        ){
            override suspend fun handleSuccess(resultObj: List<Pokemon>?): DataState<PokemonViewState> {
                var message: String? =
                    GET_ALL_LAUNCH_ITEMS_SUCCESS
                var uiComponentType: UIComponentType? = UIComponentType.None
                if(resultObj == null){
                    message =
                        GET_ALL_LAUNCH_ITEMS_NO_MATCHING_RESULTS
                    uiComponentType = UIComponentType.Toast
                }
                return DataState.data(
                    response = Response(
                        message = message,
                        uiComponentType = uiComponentType as UIComponentType,
                        messageType = MessageType.Success
                    ),
                    data = PokemonViewState(
                        pokemonListCache = resultObj as ArrayList<Pokemon>?
                    ),
                    stateEvent = stateEvent
                )
            }


        }.getResult()

        emit(response)
    }

    companion object{
        const val GET_ALL_LAUNCH_ITEMS_SUCCESS = "Successfully retrieved all launch items"
        const val GET_ALL_LAUNCH_ITEMS_NO_MATCHING_RESULTS = "There are no launch items that match that query."
    }
}







