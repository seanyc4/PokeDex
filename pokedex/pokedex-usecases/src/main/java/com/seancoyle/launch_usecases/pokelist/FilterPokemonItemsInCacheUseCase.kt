package com.seancoyle.launch_usecases.pokelist

import com.seancoyle.core.cache.CacheResponseHandler
import com.seancoyle.core.di.IODispatcher
import com.seancoyle.core.network.safeCacheCall
import com.seancoyle.core.state.*
import com.seancoyle.launch_datasource.cache.pokemon.PokeListCacheDataSource
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_viewstate.PokemonViewState
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FilterPokemonItemsInCacheUseCase(
    @IODispatcher private val ioDispatcher: CoroutineDispatcher,
    private val cacheDataSource: PokeListCacheDataSource
) {

    operator fun invoke(
        year: String,
        order: String,
        launchFilter: Int?,
        page: Int,
        stateEvent: StateEvent
    ): Flow<DataState<PokemonViewState>?> = flow {

        var updatedPage = page
        if (page <= 0) {
            updatedPage = 1
        }

        val cacheResult = safeCacheCall(ioDispatcher) {
            cacheDataSource.filterLaunchList(
                year = year,
                order = order,
                launchFilter = launchFilter,
                page = updatedPage
            )
        }

        val response = object : CacheResponseHandler<PokemonViewState, List<Pokemon>>(
            response = cacheResult,
            stateEvent = stateEvent
        ) {
            override suspend fun handleSuccess(resultObj: List<Pokemon>): DataState<PokemonViewState> {
                var message: String? = SEARCH_LAUNCH_SUCCESS
                var uiComponentType: UIComponentType? = UIComponentType.None
                if (resultObj.isEmpty()) {
                    message =
                        SEARCH_LAUNCH_NO_MATCHING_RESULTS
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

    companion object {
        const val SEARCH_LAUNCH_SUCCESS = "Successfully retrieved list of launch items."
        const val SEARCH_LAUNCH_NO_MATCHING_RESULTS =
            "There are no launch items that match that query."
    }
}






