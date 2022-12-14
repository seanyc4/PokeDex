package com.seancoyle.pokedex.framework.datasource.network.company

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource
import com.seancoyle.launch_models.model.company.CompanyInfoFactory
import com.seancoyle.launch_datasource.network.mappers.company.CompanyInfoNetworkMapper
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import javax.inject.Inject

@ExperimentalCoroutinesApi
@FlowPreview
@RunWith(AndroidJUnit4ClassRunner::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@HiltAndroidTest
class CompanyInfoApiServiceTests {

    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    // system in test
    private lateinit var apiService: CompanyInfoNetworkDataSource

    @Inject
    lateinit var fakeApi: FakeCompanyInfoApi

    @Inject
    lateinit var networkMapper: CompanyInfoNetworkMapper

    @Inject
    lateinit var dataFactory: CompanyInfoFactory

    @Before
    fun init() {
        hiltRule.inject()
        apiService = FakeCompanyInfoNetworkDataSourceImpl(
                fakeApi = fakeApi,
                networkMapper = networkMapper
            )
    }

    @Test
    fun getCompanyInfoFromNetwork_confirmExpectedResult() = runBlocking {

        val expectedResult = dataFactory.createCompanyInfo(
            id = "",
            employees = "7،000",
            founded = 2002,
            founder = "Elon Musk",
            launchSites = 3,
            name = "SpaceX",
            valuation = "27،500،000،000"
        )

        val result = apiService.getCompanyInfo()

        assert(result == expectedResult)
    }

}