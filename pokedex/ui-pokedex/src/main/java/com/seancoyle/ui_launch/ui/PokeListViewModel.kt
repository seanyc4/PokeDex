package com.seancoyle.ui_launch.ui

import android.os.Parcelable
import androidx.lifecycle.viewModelScope
import com.seancoyle.constants.LaunchDaoConstants.LAUNCH_ORDER_DESC
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_ALL
import com.seancoyle.core.di.IODispatcher
import com.seancoyle.core.presentation.BaseViewModel
import com.seancoyle.core.state.DataState
import com.seancoyle.core.state.StateEvent
import com.seancoyle.core.util.printLogDebug
import com.seancoyle.core_datastore.AppDataStore
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_models.model.PokemonList
import com.seancoyle.launch_usecases.pokelist.PokeListUseCases
import com.seancoyle.launch_viewstate.PokemonStateEvent.*
import com.seancoyle.launch_viewstate.PokemonViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
@FlowPreview
@HiltViewModel
class PokeListViewModel
@Inject
constructor(
    @IODispatcher private val ioDispatcher: CoroutineDispatcher,
    private val pokeListUseCases: PokeListUseCases,
    private val appDataStoreManager: AppDataStore,
) : BaseViewModel<PokemonViewState>(ioDispatcher = ioDispatcher) {

    init {
        setStateEvent(
            GetPokeListFromNetworkAndInsertToCacheEvent(
                offset = 60,
                limit = 60
            )
        )

        // Get filter and order from datastore if available
        // And update state accordingly
        viewModelScope.launch(ioDispatcher) {
            setLaunchOrder(
                appDataStoreManager.readStringValue(LAUNCH_ORDER)
            )
            setLaunchFilter(
                appDataStoreManager.readIntValue(LAUNCH_FILTER)
            )
        }
    }

    override fun handleNewData(data: PokemonViewState) {

        data.let { viewState ->
            viewState.pokemonList?.let { list ->
                setPokeList(list)
            }

            viewState.pokeInfo?.let { list ->
             //   setPokeList(list)
            }

            viewState.selectedPokemon?.let { list ->
                setSelectedPokemon(list)
            }

            viewState.numPokemonInCache?.let { numItems ->
                setNumLaunchItemsInCache(numItems)
            }
        }
    }

    override fun setStateEvent(stateEvent: StateEvent) {

        val job: Flow<DataState<PokemonViewState>?> = when (stateEvent) {

            is GetPokeListFromNetworkAndInsertToCacheEvent -> {
                pokeListUseCases.getPokeListFromNetworkAndInsertToCacheUseCase.invoke(
                    limit = stateEvent.limit,
                    offset = stateEvent.offset,
                    stateEvent = stateEvent
                )
            }

            is GetAllPokemonItemsFromCacheEvent -> {
                pokeListUseCases.getAllPokemonFromCacheUseCase.invoke(
                    stateEvent = stateEvent
                )
            }

          /*  is FilterPokemonItemsInCacheEvent -> {
                if (stateEvent.clearLayoutManagerState) {
                    clearLayoutManagerState()
                }
                pokeListUseCases.filterPokemonItemsInCacheUseCase.invoke(
                    year = getSearchQuery(),
                    order = getOrder(),
                    launchFilter = getFilter(),
                    page = getPage(),
                    stateEvent = stateEvent
                )
            }*/

            is GetNumPokemonItemsInCacheEvent -> {
                pokeListUseCases.getNumPokeListFromCacheUseCase.invoke(
                    stateEvent = stateEvent
                )
            }

            is CreateStateMessageEvent -> {
                emitStateMessageEvent(
                    stateMessage = stateEvent.stateMessage,
                    stateEvent = stateEvent
                )
            }

            else -> {
                emitInvalidStateEvent(stateEvent)
            }
        }
        launchJob(stateEvent, job)
    }

    override fun initNewViewState(): PokemonViewState {
        return PokemonViewState()
    }

    private fun setPokeList(pokeList: PokemonList) {
        val update = getCurrentViewStateOrNew()
        update.pokemonList = pokeList
        setViewState(update)
    }

    fun getPokeList() = getCurrentViewStateOrNew().pokemonList

    fun setSelectedPokemon(pokemon: Pokemon) {
        val update = getCurrentViewStateOrNew()
        update.selectedPokemon = pokemon
        setViewState(update)
    }

    fun getSelectedPokemon() = getCurrentViewStateOrNew().selectedPokemon

    private fun setNumLaunchItemsInCache(numItems: Int) {
        val update = getCurrentViewStateOrNew()
        update.numPokemonInCache = numItems
        setViewState(update)
    }

    private fun getLaunchListSize() = getCurrentViewStateOrNew().pokemonList?.results?.size ?: 0

    private fun getNumLunchItemsInCache() = getCurrentViewStateOrNew().numPokemonInCache ?: 0

    fun isPaginationExhausted(): Boolean {
        printLogDebug(
            "PokeListViewModel",
            "isPaginationExhausted: ${getLaunchListSize()}, ${getNumLunchItemsInCache()}"
        )
        return getLaunchListSize() >= getNumLunchItemsInCache()
    }

    private fun resetPage() {
        val update = getCurrentViewStateOrNew()
        update.page = 1
        setViewState(update)
    }

    fun isQueryExhausted(): Boolean {
        printLogDebug(
            "PokeListViewModel",
            "isQueryExhausted: ${getCurrentViewStateOrNew().isQueryExhausted}"
        )
        return getCurrentViewStateOrNew().isQueryExhausted ?: false
    }

    fun clearList() {
        val update = getCurrentViewStateOrNew()
        // update.pokemonList = ArrayList()
        setViewState(update)
    }

    fun loadFirstPage() {
        setQueryExhausted(false)
        resetPage()
        setStateEvent(FilterPokemonItemsInCacheEvent())
        printLogDebug(
            "PokeListViewModel",
            "loadFirstPage: ${getCurrentViewStateOrNew().yearQuery}"
        )
    }

    fun nextPage() {
        if (!isQueryExhausted()) {
            printLogDebug("PokeListViewModel", "attempting to load next page...")
            clearLayoutManagerState()
            incrementPageNumber()
            setStateEvent(FilterPokemonItemsInCacheEvent())
        }
    }

    fun refreshSearchQuery() {
        setQueryExhausted(false)
        setStateEvent(FilterPokemonItemsInCacheEvent(false))
    }

    private fun incrementPageNumber() {
        val update = getCurrentViewStateOrNew()
        val page = update.copy().page ?: 1
        update.page = page.plus(1)
        setViewState(update)
    }

    fun retrieveNumLaunchItemsInCache() {
        setStateEvent(GetNumPokemonItemsInCacheEvent)
    }

    fun getLayoutManagerState(): Parcelable? {
        return getCurrentViewStateOrNew().layoutManagerState
    }

    fun setLayoutManagerState(layoutManagerState: Parcelable) {
        val update = getCurrentViewStateOrNew()
        update.layoutManagerState = layoutManagerState
        setViewState(update)
    }

    private fun clearLayoutManagerState() {
        val update = getCurrentViewStateOrNew()
        update.layoutManagerState = null
        setViewState(update)
    }

    private fun getSearchQuery() = getCurrentViewStateOrNew().yearQuery ?: ""
    private fun getPage() = getCurrentViewStateOrNew().page ?: 1
    fun getOrder() = getCurrentViewStateOrNew().order ?: LAUNCH_ORDER_DESC

    fun getFilter(): Int? {
        return if (getCurrentViewStateOrNew().launchFilter == LAUNCH_ALL) {
            setLaunchFilter(null)
            getCurrentViewStateOrNew().launchFilter
        } else {
            getCurrentViewStateOrNew().launchFilter
        }
    }

    fun clearQueryParameters() {
        clearList()
        setQuery(null)
        setLaunchFilter(null)
        setQueryExhausted(false)
        resetPage()
    }

    fun setQueryExhausted(isExhausted: Boolean) {
        val update = getCurrentViewStateOrNew()
        update.isQueryExhausted = isExhausted
        setViewState(update)
    }

    fun setQuery(query: String?) {
        val update = getCurrentViewStateOrNew()
        update.yearQuery = query
        setViewState(update)
    }

    fun setLaunchOrder(order: String?) {
        val update = getCurrentViewStateOrNew()
        update.order = order
        setViewState(update)
        saveOrder(order ?: LAUNCH_ORDER_DESC)
    }

    fun setLaunchFilter(filter: Int?) {
        val update = getCurrentViewStateOrNew()
        update.launchFilter = filter
        setViewState(update)
        saveFilter(filter ?: LAUNCH_ALL)
    }

    fun setIsDialogFilterDisplayed(isDisplayed: Boolean?) {
        val update = getCurrentViewStateOrNew()
        update.isDialogFilterDisplayed = isDisplayed
        setViewState(update)
    }

    fun getIsDialogFilterDisplayed() = getCurrentViewStateOrNew().isDialogFilterDisplayed

    private fun saveOrder(order: String) {
        viewModelScope.launch(ioDispatcher) {
            appDataStoreManager.setStringValue(LAUNCH_ORDER, order)
        }
    }

    private fun saveFilter(filter: Int) {
        viewModelScope.launch(ioDispatcher) {
            appDataStoreManager.setIntValue(LAUNCH_FILTER, filter)
        }
    }

    companion object {

        // Shared Preference Files:
        private const val LAUNCH_PREFERENCES: String = "com.seancoyle.spacex"

        // Shared Preference Keys
        const val LAUNCH_ORDER: String = "$LAUNCH_PREFERENCES.LAUNCH_ORDER"
        const val LAUNCH_FILTER: String = "$LAUNCH_PREFERENCES.LAUNCH_FILTER"

    }

}













































