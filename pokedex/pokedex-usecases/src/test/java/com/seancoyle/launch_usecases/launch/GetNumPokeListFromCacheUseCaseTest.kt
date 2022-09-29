package com.seancoyle.launch_usecases.launch

import com.seancoyle.core.testing.MainCoroutineRule
import com.seancoyle.launch_datasource.cache.pokeinfo.PokemonInfoCacheDataSource
import com.seancoyle.launch_datasource_test.LaunchDependencies
import com.seancoyle.launch_models.model.launch.LaunchFactory
import com.seancoyle.launch_usecases.pokelist.GetNumPokeListFromCacheUseCase
import com.seancoyle.launch_usecases.pokelist.GetNumPokeListFromCacheUseCase.Companion.GET_NUM_LAUNCH_ITEMS_SUCCESS
import com.seancoyle.launch_viewstate.PokemonStateEvent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/*
Test cases:
1. getNumLaunchItems_success_confirmCorrect()
    a) get the number of launch in cache
    b) listen for GET_NUM_LAUNCH_ITEMS_SUCCESS from flow emission
    c) compare with the number of launch in the fake data set
*/
@OptIn(ExperimentalCoroutinesApi::class)
class GetNumPokeListFromCacheUseCaseTest {

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    // system in test
    private lateinit var getNumPokeListFromCacheUseCase: GetNumPokeListFromCacheUseCase

    // dependencies
    private val launchDependencies: LaunchDependencies = LaunchDependencies()
    private lateinit var cacheDataSource: PokemonInfoCacheDataSource
    private lateinit var factory: LaunchFactory

    @BeforeEach
    fun setup() {
        launchDependencies.build()
        cacheDataSource = launchDependencies.pokemonInfoCacheDataSource
        factory = launchDependencies.launchFactory
        getNumPokeListFromCacheUseCase = GetNumPokeListFromCacheUseCase(
            ioDispatcher = mainCoroutineRule.testDispatcher,
            cacheDataSource = cacheDataSource
        )
    }

    @Test
    fun getNumLaunchItems_success_confirmCorrect() = runBlocking {

        var numItems = 0
        getNumPokeListFromCacheUseCase(
            stateEvent = PokemonStateEvent.GetNumPokemonItemsInCacheEvent
        ).collect { value ->
            assertEquals(
                value?.stateMessage?.response?.message,
                GET_NUM_LAUNCH_ITEMS_SUCCESS
            )
            numItems = value?.data?.numPokemonInCache ?: 0
        }

        val actualNumItemsInCache = cacheDataSource.getTotalEntries()
        assertTrue { actualNumItemsInCache == numItems }
    }


}
















