package com.seancoyle.launch_datasource_test

import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_OPTIONS_ROCKET
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_OPTIONS_SORT
import com.seancoyle.core.util.DateFormatConstants.YYYY_MM_DD_HH_MM_SS
import com.seancoyle.core.util.isUnitTest
import com.seancoyle.launch_datasource.cache.PokemonCacheDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkMapper
import com.seancoyle.launch_datasource.network.dateformatter.DateFormatterImpl
import com.seancoyle.launch_datasource.network.datetransformer.DateTransformerImpl
import com.seancoyle.launch_datasource_test.cache.launch.FakePokemonCacheDataSourceImpl
import com.seancoyle.launch_datasource_test.network.launch.FakePokemonNetworkDataSourceImpl
import com.seancoyle.launch_models.model.launch.*
import okhttp3.HttpUrl
import okhttp3.mockwebserver.MockWebServer
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

class LaunchDependencies {

    private val dateFormat = DateTimeFormatter.ofPattern(
        YYYY_MM_DD_HH_MM_SS, Locale.ENGLISH
    ).withZone(ZoneId.systemDefault())

    private val dateFormatter = DateFormatterImpl(dateFormat)
    private val dateTransformer = DateTransformerImpl()
    lateinit var pokemonCacheDataSource: PokemonCacheDataSource
    lateinit var launchFactory: LaunchFactory
    lateinit var launchDataFactory: LaunchDataFactory
    lateinit var launchOptions: LaunchOptions
    lateinit var networkDataSource: PokemonNetworkDataSource
    lateinit var networkMapper: PokemonNetworkMapper
    lateinit var mockWebServer: MockWebServer
    private lateinit var baseUrl: HttpUrl

    init {
        isUnitTest = true // for Logger.kt
    }

    fun build() {

        this.javaClass.classLoader?.let { classLoader ->
            launchDataFactory = LaunchDataFactory(classLoader)
        }

        mockWebServer = MockWebServer()
        baseUrl = mockWebServer.url("v3/launches/")
        launchFactory = LaunchFactory()

        networkMapper = PokemonNetworkMapper(
            dateFormatter = dateFormatter,
            dateTransformer = dateTransformer
        )

        networkDataSource = FakePokemonNetworkDataSourceImpl(
            baseUrl = baseUrl,
            networkMapper = networkMapper
        )

        pokemonCacheDataSource = FakePokemonCacheDataSourceImpl(
            fakeLaunchDatabase = launchDataFactory.produceFakeAppDatabase(
                launchDataFactory.produceListOfLaunchItems()
            ),
        )

        // Launch options dependency
        launchOptions = LaunchOptions(
            options = Options(
                populate = listOf(
                    Populate(
                        path = LAUNCH_OPTIONS_ROCKET,
                        select = Select(
                            name = 1,
                            type = 2
                        )
                    )
                ),
                sort = Sort(
                    flight_number = LAUNCH_OPTIONS_SORT,
                ),
                limit = 500
            )
        )

    }

}

















