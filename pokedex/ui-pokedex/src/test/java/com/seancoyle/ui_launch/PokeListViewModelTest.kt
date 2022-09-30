package com.seancoyle.ui_launch

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.seancoyle.core.testing.InstantExecutorExtension
import com.seancoyle.core.testing.MainCoroutineRule
import com.seancoyle.core.testing.getOrAwaitValue
import com.seancoyle.core_datastore_test.AppDataStoreManagerFake
import com.seancoyle.launch_usecases.company.CompanyInfoUseCases
import com.seancoyle.launch_usecases.pokelist.PokeListUseCases
import com.seancoyle.poke_domain.model.launch.LaunchOptions
import com.seancoyle.ui_launch.ui.PokeListViewModel
import io.mockk.mockk
import kotlinx.coroutines.*
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExperimentalCoroutinesApi
@FlowPreview
@ExtendWith(InstantExecutorExtension::class)
class PokeListViewModelTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    private lateinit var launchOptions: LaunchOptions
    private var pokeListUseCases = mockk<PokeListUseCases>(relaxed = true)
    private var companyInfoUseCases = mockk<CompanyInfoUseCases>(relaxed = true)
    private var dependencyContainer: LaunchDependencies = LaunchDependencies()
    private var companyDependencyContainer: CompanyDependencies = CompanyDependencies()
    private lateinit var dataStore: AppDataStoreManagerFake
    private lateinit var viewModel: PokeListViewModel

    @BeforeEach
    fun setup() {
        dependencyContainer.build()
        companyDependencyContainer.build()
        launchOptions = dependencyContainer.launchOptions
        dataStore = AppDataStoreManagerFake()
    }

    private fun getViewModel(): PokeListViewModel {
        return PokeListViewModel(
            ioDispatcher = mainCoroutineRule.testDispatcher,
            launchUseCases = pokeListUseCases,
            companyInfoUseCases = companyInfoUseCases,
            launchOptions = launchOptions,
            appDataStoreManager = dataStore
        )
    }

    @Test
    fun getCompanyInfoFromNetwork() = runTest {

        viewModel = getViewModel()

//advanceUntilIdle()

        val expectedLaunchList =
            companyDependencyContainer.companyInfoDataFactory.produceCompanyInfo()
        val actualLaunchList = viewModel.viewState.getOrAwaitValue(time = 10)?.company
        assertEquals(actualLaunchList, expectedLaunchList)

    }

}