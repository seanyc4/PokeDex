package com.seancoyle.pokedex.framework.presentation.launch

import android.app.Instrumentation
import android.content.Intent
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.seancoyle.constants.LaunchDaoConstants.LAUNCH_ORDER_ASC
import com.seancoyle.constants.LaunchDaoConstants.LAUNCH_ORDER_DESC
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_ALL
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_EXCEPTION
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_FAILED
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_SUCCESS
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_UNKNOWN
import com.seancoyle.pokedex.R
import com.seancoyle.launch_datasource.cache.abstraction.company.CompanyInfoCacheDataSource
import com.seancoyle.launch_datasource.cache.abstraction.launch.LaunchCacheDataSource
import com.seancoyle.core_datastore.AppDataStore
import com.seancoyle.launch_models.model.company.CompanyInfoModel
import com.seancoyle.launch_models.model.launch.LaunchModel
import com.seancoyle.launch_datasource.network.abstraction.datetransformer.DateTransformer
import com.seancoyle.launch_datasource.network.abstraction.company.CompanyInfoNetworkDataSource
import com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource
import com.seancoyle.launch_models.model.launch.LaunchOptions
import com.seancoyle.pokedex.framework.presentation.MainActivity
import com.seancoyle.pokedex.util.*
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.appTitleViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.bottomSheetCancelButtonViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterApplyButtonViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterAscDescSwitchViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterButtonViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterCancelButtonViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterDialogViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterLaunchStatusAllViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterLaunchStatusFailureViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterLaunchStatusSuccessViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterLaunchStatusUnknownViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.filterYearViewMatcher
import com.seancoyle.pokedex.util.LaunchFragmentTestHelper.Companion.recyclerViewMatcher
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.runBlocking
import org.hamcrest.CoreMatchers
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject
import kotlin.random.Random
import kotlin.test.assertTrue

const val HEADER_COUNT = 3

@ExperimentalCoroutinesApi
@FlowPreview
@HiltAndroidTest
@LargeTest
@RunWith(AndroidJUnit4ClassRunner::class)
class LaunchFragmentEndToEndTest {

    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val intentsTestRule = ActivityScenarioRule(MainActivity::class.java)

    @get: Rule(order = 2)
    val espressoIdlingResourceRule = EspressoIdlingResourceRule()

    @Inject
    lateinit var launchCacheDataSource: LaunchCacheDataSource

    @Inject
    lateinit var companyInfoCacheDataSource: CompanyInfoCacheDataSource

    @Inject
    lateinit var dateTransformer: DateTransformer

    @Inject
    lateinit var launchNetworkDataSource: LaunchNetworkDataSource

    @Inject
    lateinit var companyInfoNetworkDataSource: CompanyInfoNetworkDataSource

    @Inject
    lateinit var launchOptions: LaunchOptions

    @Inject
    lateinit var dataStore: AppDataStore

    @Inject
    lateinit var launchDataFactory: LaunchDataFactory

    private lateinit var testLaunchList: List<LaunchModel>
    private lateinit var testCompanyInfoList: CompanyInfoModel
    lateinit var validLaunchYears: List<String>

    @Before
    fun init() {
        hiltRule.inject()
        Intents.init()
        prepareDataSet()
        validLaunchYears = launchDataFactory.provideValidFilterYearDates()

    }

    private fun prepareDataSet() = runBlocking {
        // Get fake network data
        testLaunchList = launchNetworkDataSource.getLaunchList(launchOptions = launchOptions)
        testCompanyInfoList = companyInfoNetworkDataSource.getCompanyInfo()

        // clear any existing data so recyclerview isn't overwhelmed
        launchCacheDataSource.deleteAll()
        companyInfoCacheDataSource.deleteAll()

        // Insert data to fake in memory room database
        launchCacheDataSource.insertList(testLaunchList)
        companyInfoCacheDataSource.insert(testCompanyInfoList)
    }

    @Test
    fun generalEndToEndTest() {

        /** verifyTestDataIsVisible */
        launchesFragmentTestHelper {
            // Wait for LaunchFragment to come into view
            waitViewShown(recyclerViewMatcher)
            verifyCorrectTextIsDisplayed(
                appTitleViewMatcher,
                text = R.string.app_name
            )
            verifyViewIsDisplayed(filterButtonViewMatcher)
            verifyViewIsDisplayed(recyclerViewMatcher)
        }

        /** verifyFilterViewIsDisplayingWithCorrectData */
        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyAllFilterDialogsTextViewsDisplayCorrectText()
            verifyViewIsChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            performClick(filterCancelButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        /** testDaysSinceDisplaysCorrectlyOnLaunchItemsWithAPastDate */

        // Only 2022 launches have "days from now" data
        var year = "2022"
        var expectedFilterResults: List<LaunchModel>?

        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            performTypeText(filterYearViewMatcher, text = year)
            performClick(filterLaunchStatusAllViewMatcher)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                year = year,
                order = LAUNCH_ORDER_DESC
            )
        }

        assertTrue(!expectedFilterResults.isNullOrEmpty())

        launchesFragmentTestHelper {
            checkRecyclerItemsDaysSinceDisplaysCorrectly(
                expectedFilterResults = expectedFilterResults!!,
                dateTransformer = dateTransformer
            )
        }

        /** filterLaunchItemsByYearDesc_verifyResultsAndDescOrderState */
        year = validLaunchYears.get(index = Random.nextInt(validLaunchYears.size))


        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            performTypeText(filterYearViewMatcher, text = year)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                year = year,
                order = LAUNCH_ORDER_DESC
            )
        }

        assertTrue(!expectedFilterResults.isNullOrEmpty())

        // Check the date of each item on screen matches the year filter
        launchesFragmentTestHelper {
            checkRecyclerItemsDateMatchesFilteredDate(
                expectedFilterResults = expectedFilterResults!!,
                year = year,
            )

            // Check ASC/DESC is still set to DESC after the filter is completed
            // It should remember its state
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            performClick(filterCancelButtonViewMatcher)
        }

        /** filterLaunchItemsByYearAsc_verifyResultsAndAscOrderState */
        year = validLaunchYears.get(index = Random.nextInt(validLaunchYears.size))

        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            performTypeText(filterYearViewMatcher, text = year)
            performClick(filterAscDescSwitchViewMatcher)
            verifyViewIsNotChecked(filterAscDescSwitchViewMatcher)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                year = year,
                order = LAUNCH_ORDER_ASC
            )
        }

        assertTrue(!expectedFilterResults.isNullOrEmpty())

        // Check the date of each item on screen matches the year filter
        launchesFragmentTestHelper {
            checkRecyclerItemsDateMatchesFilteredDate(
                expectedFilterResults = expectedFilterResults!!,
                year = year,
            )

            // Check ASC/DESC is still set to ASC after the filter is completed
            // It should remember its state
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsNotChecked(filterAscDescSwitchViewMatcher)
            performClick(filterCancelButtonViewMatcher)
        }


        /** filterLaunchItemsByInvalidYear_verifyNoResults*/
        year = "1000"

        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsNotChecked(filterAscDescSwitchViewMatcher)
            performTypeText(filterYearViewMatcher, text = year)
            verifyViewIsNotChecked(filterAscDescSwitchViewMatcher)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                year = year,
                order = LAUNCH_ORDER_DESC
            )
        }

        assertTrue(expectedFilterResults.isNullOrEmpty())


        /** filterByLaunchStatusSuccess_verifyResultsAndDescOrderState */

        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsNotChecked(filterAscDescSwitchViewMatcher)
            performClick(filterLaunchStatusSuccessViewMatcher)
            performClick(filterAscDescSwitchViewMatcher)
            verifyViewIsChecked(filterLaunchStatusSuccessViewMatcher)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                launchFilter = LAUNCH_SUCCESS,
                order = LAUNCH_ORDER_DESC
            )
        }

        assertTrue(!expectedFilterResults.isNullOrEmpty())

        // Check the that each view holder has the R.drawable.ic_launch_success icon
        launchesFragmentTestHelper {
            checkRecyclerItemsLaunchStatusMatchesFilteredLaunchStatus(
                expectedFilterResults = expectedFilterResults!!,
                launchSuccessIcon = R.drawable.ic_launch_success,
            )

            // Check Launch Status is still set to SUCCESS after the filter is completed
            // It should remember its state
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterLaunchStatusSuccessViewMatcher)
            performClick(filterCancelButtonViewMatcher)
        }


        /** filterByLaunchStatusFailure_verifyResultsAndDescOrderState */

        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            performClick(filterLaunchStatusFailureViewMatcher)
            verifyViewIsChecked(filterLaunchStatusFailureViewMatcher)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                launchFilter = LAUNCH_FAILED,
                order = LAUNCH_ORDER_DESC
            )
        }

        assertTrue(!expectedFilterResults.isNullOrEmpty())

        // Check the that each view holder has the R.drawable.ic_launch_fail icon
        launchesFragmentTestHelper {
            checkRecyclerItemsLaunchStatusMatchesFilteredLaunchStatus(
                expectedFilterResults = expectedFilterResults!!,
                launchSuccessIcon = R.drawable.ic_launch_fail,
            )

            // Check Launch Status is still set to FAILURE after the filter is completed
            // It should remember its state
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterLaunchStatusFailureViewMatcher)
            performClick(filterCancelButtonViewMatcher)
        }


        /** filterByLaunchStatus_invalidSearch */


        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                launchFilter = LAUNCH_EXCEPTION,
                order = LAUNCH_ORDER_DESC
            )
        }

        assertTrue(expectedFilterResults.isNullOrEmpty())


        /** filterByLaunchStatusUnknown_verifyResultsAndDescOrderState */

        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            performClick(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsChecked(filterLaunchStatusUnknownViewMatcher)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                launchFilter = LAUNCH_UNKNOWN,
                order = LAUNCH_ORDER_DESC
            )
        }

        assertTrue(!expectedFilterResults.isNullOrEmpty())

        // Check the that each view holder has the R.drawable.ic_launch_unknown icon
        // R.drawable.ic_launch_unknown doesn't display any visible image
        launchesFragmentTestHelper {
            checkRecyclerItemsLaunchStatusMatchesFilteredLaunchStatus(
                expectedFilterResults = expectedFilterResults!!,
                launchSuccessIcon = R.drawable.ic_launch_unknown,
            )

            // Check Launch Status is still set to UNKNOWN after the filter is completed
            // It should remember its state
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterLaunchStatusUnknownViewMatcher)
            performClick(filterCancelButtonViewMatcher)
        }


        /** filterLaunchItemsByYear_andLaunchStatusSuccess_verifyResultsAndDescOrderState */
        // We don't use the random list here as some years don't have any successful launches
        // This will cause the test to fail
        year = "2021"

        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            performTypeText(filterYearViewMatcher, text = year)
            performClick(filterLaunchStatusSuccessViewMatcher)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                year = year,
                order = LAUNCH_ORDER_DESC,
                launchFilter = LAUNCH_SUCCESS
            )
        }

        assertTrue(!expectedFilterResults.isNullOrEmpty())

        // Check the date of each item on screen matches the year filter 2021
        launchesFragmentTestHelper {
            checkRecyclerItemsLaunchStatusMatchesFilteredLaunchStatusAndYearMatchesFilteredYear(
                expectedFilterResults = expectedFilterResults!!,
                year = year,
                launchSuccessIcon = R.drawable.ic_launch_success
            )

            // Check ASC/DESC is still set to DESC after the filter is completed
            // Check Launch Status: SUCCESS is checked
            // These views should remember their state
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            verifyViewIsChecked(filterLaunchStatusSuccessViewMatcher)
            performClick(filterCancelButtonViewMatcher)
        }

        /** filterLaunchItemsByYear_andLaunchStatusFailure_verifyResultsAndDescOrderState */
        // We don't use the random list here as some years don't have any successful launches
        // This will cause the test to fail
        year = "2006"

        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            performTypeText(filterYearViewMatcher, text = year)
            performClick(filterLaunchStatusFailureViewMatcher)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                year = year,
                order = LAUNCH_ORDER_DESC,
                launchFilter = LAUNCH_FAILED
            )
        }

        assertTrue(!expectedFilterResults.isNullOrEmpty())

        // Check the date of each item on screen matches the year filter 2006
        launchesFragmentTestHelper {
            checkRecyclerItemsLaunchStatusMatchesFilteredLaunchStatusAndYearMatchesFilteredYear(
                expectedFilterResults = expectedFilterResults!!,
                year = year,
                launchSuccessIcon = R.drawable.ic_launch_fail
            )

            // Check ASC/DESC is still set to DESC after the filter is completed
            // Check Launch Status: SUCCESS is checked
            // These views should remember their state
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            verifyViewIsChecked(filterLaunchStatusFailureViewMatcher)
            performClick(filterCancelButtonViewMatcher)
        }


        /** resetFilteredSearchResults */

        year = ""

        launchesFragmentTestHelper {
            performClick(filterButtonViewMatcher)
            verifyViewIsDisplayed(filterDialogViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusAllViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusSuccessViewMatcher)
            verifyViewIsChecked(filterLaunchStatusFailureViewMatcher)
            verifyViewIsNotChecked(filterLaunchStatusUnknownViewMatcher)
            verifyViewIsChecked(filterAscDescSwitchViewMatcher)
            performTypeText(filterYearViewMatcher, text = year)
            performClick(filterLaunchStatusAllViewMatcher)
            performClick(filterApplyButtonViewMatcher)
            verifyViewIsNotDisplayed(filterDialogViewMatcher)
        }

        runBlocking {
            expectedFilterResults = getFilteredLaunchItemsFromCache(
                year = year,
                order = LAUNCH_ORDER_DESC,
                launchFilter = LAUNCH_ALL
            )
        }


        /** recyclerViewOnClickDisplayBottomSheet_isSuccess */

        // Not all items have links, - no links will display an info dialog
        // so much hard code a position which guarantees links
        var position = 24

        launchesFragmentTestHelper {
            performRecyclerViewClick(recyclerViewMatcher, position)
            verifyViewIsDisplayed(LaunchFragmentTestHelper.bottomSheetViewMatcher)
            verifyAllBottomSheetTextViewsDisplayCorrectTitles()
            performClick(bottomSheetCancelButtonViewMatcher)
        }


        /** bottomSheetClickArticleLink_isSuccess() */

        val articleLink =
            "https://spaceflightnow.com/2022/03/19/spacex-stretches-rocket-reuse-record-with-another-starlink-launch/"

        launchesFragmentTestHelper {

            performRecyclerViewClick(recyclerViewMatcher, position)
            verifyViewIsDisplayed(LaunchFragmentTestHelper.bottomSheetViewMatcher)
            verifyAllBottomSheetTextViewsDisplayCorrectTitles()

            // Build intent to replicate the data equal to the POSITION clicked
            val expectedIntent = CoreMatchers.allOf(
                IntentMatchers.hasAction(Intent.ACTION_VIEW),
                IntentMatchers.hasData(articleLink)
            )
            Intents.intending(expectedIntent).respondWith(Instrumentation.ActivityResult(0, null))
            performClick(LaunchFragmentTestHelper.bottomSheetArticleTitleViewMatcher)
            Intents.intended(expectedIntent)

        }


        /** bottomSheetClickVideoLink_isSuccess */

        val videoLink = "https://youtu.be/0giA6VZOICs"

        launchesFragmentTestHelper {

            performRecyclerViewClick(recyclerViewMatcher, position)
            verifyViewIsDisplayed(LaunchFragmentTestHelper.bottomSheetViewMatcher)
            verifyAllBottomSheetTextViewsDisplayCorrectTitles()

            // Build intent to replicate the data equal to the POSITION clicked
            val expectedIntent = CoreMatchers.allOf(
                IntentMatchers.hasAction(Intent.ACTION_VIEW),
                IntentMatchers.hasData(videoLink)
            )
            Intents.intending(expectedIntent).respondWith(Instrumentation.ActivityResult(0, null))
            performClick(LaunchFragmentTestHelper.bottomSheetWebcastTitleViewMatcher)
            Intents.intended(expectedIntent)

        }


        /** bottomSheetClickWikiLink_isSuccess */

        val wikiLink = "https://en.wikipedia.org/wiki/Starlink"

        launchesFragmentTestHelper {

            performRecyclerViewClick(recyclerViewMatcher, position)
            verifyViewIsDisplayed(LaunchFragmentTestHelper.bottomSheetViewMatcher)
            verifyAllBottomSheetTextViewsDisplayCorrectTitles()

            // Build intent to replicate the data equal to the POSITION clicked
            val expectedIntent = CoreMatchers.allOf(
                IntentMatchers.hasAction(Intent.ACTION_VIEW),
                IntentMatchers.hasData(wikiLink)
            )
            Intents.intending(expectedIntent).respondWith(Instrumentation.ActivityResult(0, null))
            performClick(LaunchFragmentTestHelper.bottomSheetWikipediaTitleViewMatcher)
            Intents.intended(expectedIntent)

        }


        /** bottomSheetClickCancel_isSuccess */

        launchesFragmentTestHelper {

            performRecyclerViewClick(recyclerViewMatcher, position)
            verifyViewIsDisplayed(LaunchFragmentTestHelper.bottomSheetViewMatcher)
            verifyAllBottomSheetTextViewsDisplayCorrectTitles()
            performClick(bottomSheetCancelButtonViewMatcher)
            verifyViewIsNotDisplayed(LaunchFragmentTestHelper.bottomSheetViewMatcher)

        }


        /** bottomSheetNoArticleOrWikiLink_isSuccess */

        // This item has no article or wiki link in its data
        // Therefore these links should not be visible on screen
        position = 13

        launchesFragmentTestHelper {
            performRecyclerViewClick(recyclerViewMatcher, position)
            verifyViewIsDisplayed(LaunchFragmentTestHelper.bottomSheetViewMatcher)
            verifyViewIsNotVisible(LaunchFragmentTestHelper.bottomSheetArticleTitleViewMatcher)
            verifyViewIsNotVisible(LaunchFragmentTestHelper.bottomSheetWikipediaTitleViewMatcher)
            verifyViewIsDisplayed(LaunchFragmentTestHelper.bottomSheetWebcastTitleViewMatcher)
            performClick(bottomSheetCancelButtonViewMatcher)
            verifyViewIsNotDisplayed(LaunchFragmentTestHelper.bottomSheetViewMatcher)
        }


        /** recyclerViewOnClickDisplayBottomSheet_isFail_verifyDialogDisplayWithText */
        // Select an item with no media links
        // verify a dialog is displayed - also very the title and message
        // Click ok button - check dialog has dismissed
        launchesFragmentTestHelper {
            performRecyclerViewClick(recyclerViewMatcher, 5)
            verifyViewIsNotDisplayed(LaunchFragmentTestHelper.bottomSheetViewMatcher)
            verifyViewIsDisplayed(LaunchFragmentTestHelper.materialDialogViewMatcher)
            verifyCorrectTextIsDisplayed(
                LaunchFragmentTestHelper.materialDialogTitleViewMatcher,
                text = R.string.text_info
            )
            verifyCorrectTextIsDisplayed(
                LaunchFragmentTestHelper.materialDialogMessageViewMatcher,
                text = R.string.no_links
            )
            performClick(LaunchFragmentTestHelper.materialDialogPositiveBtnViewMatcher)
            verifyViewIsNotDisplayed(LaunchFragmentTestHelper.materialDialogViewMatcher)
        }

    }

    private suspend fun getFilteredLaunchItemsFromCache(
        year: String? = "",
        order: String? = LAUNCH_ORDER_DESC,
        launchFilter: Int? = null
    ): List<LaunchModel> {
        return launchCacheDataSource.filterLaunchList(
            year = year ?: "",
            order = order ?: LAUNCH_ORDER_DESC,
            launchFilter = launchFilter,
            page = 1
        ) ?: emptyList()

    }

    private fun clearDataStore() = runBlocking {
        dataStore.clearData()
    }

    @After
    fun teardown() {
        clearDataStore()
        Intents.release()
    }

}



























