package com.seancoyle.launch_usecases.launch

import com.seancoyle.core.testing.MainCoroutineRule
import com.seancoyle.launch_datasource.cache.pokeinfo.PokeInfoCacheDataSource
import com.seancoyle.launch_usecases.pokelist.GetAllPokemonFromCacheUseCase
import com.seancoyle.launch_usecases.pokelist.GetAllPokemonFromCacheUseCase.Companion.GET_ALL_LAUNCH_ITEMS_SUCCESS
import com.seancoyle.launch_viewstate.PokemonStateEvent
import com.seancoyle.poke_domain.model.launch.LaunchModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/*
Test cases:
1. getAllLaunchItemsFromCache_success_confirmCorrect()
    a) get the total number of launch in cache
    b) query the cache to return all items in the table
    c) listen for GET_ALL_LAUNCH_ITEMS_SUCCESS from flow emission
    d) compare with the total number with the results from the fake data set
*/
@OptIn(ExperimentalCoroutinesApi::class)
class GetAllPokemonFromCacheUseCaseTest {

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    // system in test
    private lateinit var getAllLaunchItems: GetAllPokemonFromCacheUseCase

    // dependencies
    private val launchDependencies: LaunchDependencies = LaunchDependencies()
    private lateinit var cacheDataSource: PokeInfoCacheDataSource

    @BeforeEach
    fun init() {
        launchDependencies.build()
        cacheDataSource = launchDependencies.pokeInfoCacheDataSource
        getAllLaunchItems = GetAllPokemonFromCacheUseCase(
            ioDispatcher = mainCoroutineRule.testDispatcher,
            cacheDataSource = cacheDataSource
        )
    }


    @Test
    fun `Get All Launch Items From Cache - success - confirm correct`() = runBlocking {

        val numTotal = cacheDataSource.getTotalEntries()
        var results = emptyList<LaunchModel>()

        getAllLaunchItems(
            stateEvent = PokemonStateEvent.GetAllPokemonItemsFromCacheEvent
        ).collect { value ->
            assertEquals(
                value?.stateMessage?.response?.message,
                GET_ALL_LAUNCH_ITEMS_SUCCESS
            )

            value?.data?.pokemonList?.let { list ->
                results = list
            }
        }

        // confirm launch items were retrieved
        assertTrue { results.isNotEmpty() }

        // confirm launch items retrieved matches total number
        assertTrue { results.size == numTotal }
    }

    @Test
    fun `Check All Launch Items Have A Valid Patch Image URL`() = runBlocking {

        val launchList = cacheDataSource.getAll()
        assertTrue { !launchList.isNullOrEmpty() }
        assertTrue(launchList?.all { it.links.missionImage.isNotEmpty() } == true )
    }

}
















