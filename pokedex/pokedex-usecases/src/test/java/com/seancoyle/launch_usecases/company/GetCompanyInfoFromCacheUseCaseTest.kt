package com.seancoyle.launch_usecases.company

import com.seancoyle.core.testing.MainCoroutineRule
import com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource
import com.seancoyle.launch_usecases.company.GetCompanyInfoFromCacheUseCase.Companion.GET_COMPANY_INFO_SUCCESS
import com.seancoyle.launch_viewstate.PokemonStateEvent
import com.seancoyle.poke_domain.model.company.CompanyInfoFactory
import com.seancoyle.poke_domain.model.company.CompanyInfoModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/*
Test cases:
1. getCompanyInfoFromCache_success_confirmCorrect()
    a) query the cache to return the company info from the table.
    b) listen for GET_COMPANY_INFO_SUCCESS from flow emission
    c) check the company info is not null
*/
@OptIn(ExperimentalCoroutinesApi::class)
class GetCompanyInfoFromCacheUseCaseTest {

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    // system in test
    private lateinit var getCompanyInfo: GetCompanyInfoFromCacheUseCase

    // dependencies
    private val dependencies: CompanyDependencies = CompanyDependencies()
    private lateinit var cacheDataSource: CompanyInfoCacheDataSource
    private lateinit var infoFactory: CompanyInfoFactory


    @BeforeEach
    fun setup() {
        dependencies.build()
        cacheDataSource = dependencies.companyInfoCacheDataSource
        infoFactory = dependencies.companyInfoFactory
        getCompanyInfo = GetCompanyInfoFromCacheUseCase(
            ioDispatcher = mainCoroutineRule.testDispatcher,
            cacheDataSource = cacheDataSource
        )
    }

    @Test
    fun getCompanyInfoFromCache_success_confirmCorrect() = runBlocking {

        var result: CompanyInfoModel? = null

        getCompanyInfo(
            stateEvent = PokemonStateEvent.GetCompanyInfoFromCacheEvent
        ).collect { value ->
            assertEquals(
                value?.stateMessage?.response?.message,
                GET_COMPANY_INFO_SUCCESS
            )

            value?.data?.company?.let { companyInfo ->
                result = companyInfo
            }
        }

        // confirm company info was was retrieved
        assertTrue(result != null)

    }

}
















