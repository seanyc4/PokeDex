package com.seancoyle.launch_usecases.launch

import com.seancoyle.core.testing.MainCoroutineRule
import com.seancoyle.launch_datasource.cache.pokeinfo.PokemonInfoCacheDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_datasource_test.LaunchDependencies
import com.seancoyle.launch_datasource_test.network.MockWebServerResponseLaunchList.launchList
import com.seancoyle.launch_models.model.launch.LaunchFactory
import com.seancoyle.launch_models.model.launch.LaunchModel
import com.seancoyle.launch_usecases.pokelist.GetPokemonListFromNetworkAndInsertToCacheUseCase
import com.seancoyle.launch_usecases.pokelist.GetPokemonListFromNetworkAndInsertToCacheUseCase.Companion.LAUNCH_ERROR
import com.seancoyle.launch_usecases.pokelist.GetPokemonListFromNetworkAndInsertToCacheUseCase.Companion.LAUNCH_INSERT_SUCCESS
import com.seancoyle.launch_viewstate.PokemonStateEvent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.Rule
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.net.HttpURLConnection

@OptIn(ExperimentalCoroutinesApi::class)
class GetLaunchItemsFromNetworkInsertToCacheTest {

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    // system in test
    private lateinit var getPokemonListFromNetworkAndInsertToCacheUseCase: GetPokemonListFromNetworkAndInsertToCacheUseCase

    // dependencies
    private val dependencies: LaunchDependencies = LaunchDependencies()
    private lateinit var cacheDataSource: PokemonInfoCacheDataSource
    private lateinit var networkDataSource: PokemonNetworkDataSource
    private lateinit var factory: LaunchFactory
    private lateinit var mockWebServer: MockWebServer

    @BeforeEach
    fun setup() {
        dependencies.build()
        cacheDataSource = dependencies.pokemonInfoCacheDataSource
        networkDataSource = dependencies.networkDataSource
        factory = dependencies.launchFactory
        mockWebServer = dependencies.mockWebServer

        // instantiate the system in test
        getPokemonListFromNetworkAndInsertToCacheUseCase = GetPokemonListFromNetworkAndInsertToCacheUseCase(
            ioDispatcher = mainCoroutineRule.testDispatcher,
            cacheDataSource = cacheDataSource,
            launchNetworkDataSource = networkDataSource
        )
    }

    /**
     * 1. Are the launch retrieved from the network?
     * 2. Are the launch inserted into the cache?
     * 3. Check the list of launch items are valid LaunchModel?
     */
    @Test
    fun getLaunchItemsFromNetwork_InsertToCache_GetFromCache(): Unit = runBlocking {

        // condition the response
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(HttpURLConnection.HTTP_OK)
                .setBody(launchList)
        )

        // confirm the cache is empty to start
        cacheDataSource.deleteAll()
        assertTrue(cacheDataSource.getAll()?.isEmpty() == true)

        // execute use case
        getPokemonListFromNetworkAndInsertToCacheUseCase(
            launchOptions = dependencies.launchOptions,
            stateEvent = PokemonStateEvent.GetPokemonItemsFromNetworkAndInsertToCacheEvent(
                launchOptions = dependencies.launchOptions
            )
        ).collect { value ->
            assertEquals(
                value?.stateMessage?.response?.message,
                LAUNCH_INSERT_SUCCESS
            )
        }

        // get items inserted from network
        val results = cacheDataSource.getAll()

        // results should contain a list of launch items
        assertTrue(results?.isNotEmpty() == true)

        // confirm they are actually LaunchModel objects
        assertTrue(results?.get(index = 0) is LaunchModel)

    }

    /**
     * Simulate a bad request
     */
    @Test
    fun getLaunchListFromNetwork_emitHttpError(): Unit = runBlocking {

        // condition the response
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(HttpURLConnection.HTTP_BAD_REQUEST)
                .setBody("{}")
        )

        // execute use case
        getPokemonListFromNetworkAndInsertToCacheUseCase(
            launchOptions = dependencies.launchOptions,
            stateEvent = PokemonStateEvent.GetPokemonItemsFromNetworkAndInsertToCacheEvent(
                launchOptions = dependencies.launchOptions
            )
        ).collect { value ->
            assertEquals(
                value?.stateMessage?.response?.message,
                LAUNCH_ERROR
            )
        }
    }

    @AfterEach
    fun teardown() {
        mockWebServer.shutdown()
    }

}