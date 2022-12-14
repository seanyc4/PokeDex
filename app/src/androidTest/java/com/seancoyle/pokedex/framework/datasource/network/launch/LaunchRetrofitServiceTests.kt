package com.seancoyle.pokedex.framework.datasource.network.launch

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource
import com.seancoyle.launch_datasource.network.mappers.launch.LaunchNetworkMapper
import com.seancoyle.launch_models.model.launch.LaunchOptions
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject
import kotlin.test.assertTrue

@ExperimentalCoroutinesApi
@FlowPreview
@HiltAndroidTest
@RunWith(AndroidJUnit4ClassRunner::class)
class LaunchRetrofitServiceTests {

    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    // system in test
    private lateinit var apiService: LaunchNetworkDataSource

    @Inject
    lateinit var networkMapper: LaunchNetworkMapper

    @Inject
    lateinit var launchOptions: LaunchOptions

    @Inject
    lateinit var fakeApi: FakeLaunchApi


    @Before
    fun init() {
        hiltRule.inject()
        apiService = FakeLaunchNetworkDataSourceImpl(
            fakeApi = fakeApi,
            networkMapper = networkMapper
        )
    }

    @Test
    fun getLaunchItems_confirmExpectedResult() = runBlocking {

        val result = apiService.getLaunchList(launchOptions = launchOptions)
        assertTrue(result.isNotEmpty())

    }

}





































