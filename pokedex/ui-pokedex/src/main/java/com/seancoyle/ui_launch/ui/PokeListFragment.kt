package com.seancoyle.ui_launch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.callbacks.onDismiss
import com.afollestad.materialdialogs.customview.customView
import com.afollestad.materialdialogs.customview.getCustomView
import com.google.android.material.switchmaterial.SwitchMaterial
import com.seancoyle.constants.LaunchDaoConstants.LAUNCH_ORDER_ASC
import com.seancoyle.constants.LaunchDaoConstants.LAUNCH_ORDER_DESC
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_ALL
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_FAILED
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_SUCCESS
import com.seancoyle.constants.LaunchNetworkConstants.LAUNCH_UNKNOWN
import com.seancoyle.core.presentation.BaseFragment
import com.seancoyle.core.state.*
import com.seancoyle.core.testing.AndroidTestUtils
import com.seancoyle.core.util.printLogDebug
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_usecases.pokelist.FilterPokemonItemsInCacheUseCase
import com.seancoyle.launch_usecases.pokelist.GetAllPokemonFromCacheUseCase
import com.seancoyle.launch_usecases.pokelist.GetPokemonListFromNetworkAndInsertToCacheUseCase
import com.seancoyle.launch_viewstate.PokemonStateEvent
import com.seancoyle.launch_viewstate.PokemonViewState
import com.seancoyle.ui_launch.R
import com.seancoyle.ui_launch.databinding.FragmentPokeListBinding
import com.seancoyle.ui_launch.ui.adapter.PokeListAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import javax.inject.Inject

const val POKELIST_STATE_BUNDLE_KEY = "com.seancoyle.ui_pokelist.state"

@FlowPreview
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class PokeListFragment : BaseFragment(R.layout.fragment_poke_list),
    PokeListAdapter.Interaction {

    @Inject
    lateinit var androidTestUtils: AndroidTestUtils

    private var _binding: FragmentPokeListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: PokeListViewModel by viewModels()
    private var listAdapter: PokeListAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPokeListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListeners()
        setupRecyclerView()
        setupSwipeRefresh()
        subscribeObservers()
        restoreInstanceState(savedInstanceState)
    }

    override fun onPause() {
        super.onPause()
        saveLayoutManagerState()
        viewModel.clearAllStateMessages()
    }

    private fun restoreInstanceState(savedInstanceState: Bundle?) {
        savedInstanceState?.let { inState ->
            (inState[POKELIST_STATE_BUNDLE_KEY] as PokemonViewState?)?.let { viewState ->
                viewModel.setViewState(viewState)
            }
        }
    }

    override fun restoreListPosition() {
        viewModel.getLayoutManagerState()?.let { lmState ->
            view?.findViewById<RecyclerView>(R.id.rv_poke_list)?.layoutManager?.onRestoreInstanceState(
                lmState
            )
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        val viewState = viewModel.viewState.value

        //clear the list. Don't save a large list to bundle.
        //    viewState?.pokemonList = ArrayList()

        outState.putParcelable(
            POKELIST_STATE_BUNDLE_KEY,
            viewState
        )
        super.onSaveInstanceState(outState)
    }

    override fun onResume() {
        super.onResume()
        if (viewModel.getPokeList() != null) {
            getTotalNumEntriesInLaunchCacheEvent()
            viewModel.refreshSearchQuery()
        }
        if (viewModel.getIsDialogFilterDisplayed() == true) {
            displayFilterDialog()
        }
    }

    private fun saveLayoutManagerState() {
        binding.rvPokeList.layoutManager?.onSaveInstanceState()?.let { lmState ->
            viewModel.setLayoutManagerState(lmState)
        }
    }

    private fun setupRecyclerView() {
        with(binding) {
            rvPokeList.apply {

                listAdapter = PokeListAdapter(
                    interaction = this@PokeListFragment,
                )
                addOnScrollListener(object : RecyclerView.OnScrollListener() {
                    override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                        super.onScrollStateChanged(recyclerView, newState)
                        val layoutManager = recyclerView.layoutManager as LinearLayoutManager
                        val lastPosition = layoutManager.findLastVisibleItemPosition()
                        if (listAdapter?.itemCount!! > 0) {
                            if (lastPosition == listAdapter?.itemCount?.minus(1)) {
                                viewModel.nextPage()
                            }
                        }
                    }
                })

                adapter = listAdapter
                listAdapter?.stateRestorationPolicy =
                    RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
            }
        }
    }

    private fun subscribeObservers() {

        viewModel.shouldDisplayProgressBar.observe(viewLifecycleOwner) {
            uiController.displayProgressBar(it)
        }

        viewModel.stateMessage.observe(viewLifecycleOwner) { stateMessage ->
            stateMessage?.response?.let { response ->
                when (response.message) {

                    GetPokemonListFromNetworkAndInsertToCacheUseCase.LAUNCH_INSERT_SUCCESS -> {
                        viewModel.clearStateMessage()
                        viewModel.setStateEvent(PokemonStateEvent.GetAllPokemonItemsFromCacheEvent)
                       /* filterLaunchItemsInCacheEvent()
                        getTotalNumEntriesInLaunchCacheEvent()*/
                    }
                    GetAllPokemonFromCacheUseCase.GET_ALL_LAUNCH_ITEMS_SUCCESS ->{
                        submitList()
                    }

                    FilterPokemonItemsInCacheUseCase.SEARCH_LAUNCH_SUCCESS -> {
                        viewModel.clearStateMessage()
                        submitList()
                    }

                    GetAllPokemonFromCacheUseCase.GET_ALL_LAUNCH_ITEMS_SUCCESS -> {
                        viewModel.clearStateMessage()
                        submitList()
                    }

                    else -> {
                        uiController.onResponseReceived(
                            response = stateMessage.response,
                            stateMessageCallback = object : StateMessageCallback {
                                override fun removeMessageFromStack() {
                                    viewModel.clearStateMessage()
                                }
                            }
                        )

                        when (response.message) {
                            // Check cache for data if net connection fails
                            GetPokemonListFromNetworkAndInsertToCacheUseCase.LAUNCH_INSERT_FAILED -> {
                                getTotalNumEntriesInLaunchCacheEvent()
                                filterLaunchItemsInCacheEvent()
                            }

                            GetPokemonListFromNetworkAndInsertToCacheUseCase.LAUNCH_ERROR -> {
                                getTotalNumEntriesInLaunchCacheEvent()
                                filterLaunchItemsInCacheEvent()
                            }
                        }
                    }
                }
            }
        }

        // Update UI when list size changes
        viewModel.viewState.observe(viewLifecycleOwner) { viewState ->

            if (viewState != null) {
                viewState.pokemonList?.let { _ ->
                    if (viewModel.isPaginationExhausted() && !viewModel.isQueryExhausted()) {
                        viewModel.setQueryExhausted(true)
                    }
                    submitList()
                }
            }
        }
    }

    private fun filterLaunchItemsInCacheEvent() {
        viewModel.setStateEvent(
            PokemonStateEvent.FilterPokemonItemsInCacheEvent()
        )
    }

    private fun getTotalNumEntriesInLaunchCacheEvent() {
        viewModel.retrieveNumLaunchItemsInCache()
    }

    private fun submitList() {
        listAdapter?.submitList(viewModel.getPokeCacheList() ?: emptyList())
    }

    private fun setListeners() {
        with(binding) {
            toolbar.filterBtn.setOnClickListener {
                viewModel.setIsDialogFilterDisplayed(true)
                displayFilterDialog()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        listAdapter = null // can leak memory
        _binding = null
    }

    private fun setupSwipeRefresh() {
        with(binding) {
            swipeRefresh.setOnRefreshListener {
                swipeRefresh.isRefreshing = false
                viewModel.clearQueryParameters()
            }
        }
    }

    override fun onItemSelected(pokemon: Pokemon) {
        viewModel.setSelectedPokemon(pokemon = pokemon)

        /**
         * Navigate to Pokeinfo page
         */
    }

    private fun displayFilterDialog() {

        activity?.let {
            val dialog = MaterialDialog(it)
                .noAutoDismiss()
                .onDismiss { viewModel.setIsDialogFilterDisplayed(false) }
                .customView(R.layout.dialog_filter)
                .cornerRadius(res = R.dimen.default_corner_radius)

            val view = dialog.getCustomView()
            val order = viewModel.getOrder()
            val filter = viewModel.getFilter()
            var newOrder: String? = null

            view.findViewById<RadioGroup>(R.id.filter_group).apply {
                when (filter) {
                    null -> check(R.id.filter_all)
                    LAUNCH_SUCCESS -> check(R.id.filter_success)
                    LAUNCH_FAILED -> check(R.id.filter_failure)
                    LAUNCH_UNKNOWN -> check(R.id.filter_unknown)
                }
            }

            // set switch to on/off based on state
            val orderSwitch = view.findViewById<SwitchMaterial>(R.id.order_switch).apply {
                when (order) {
                    LAUNCH_ORDER_ASC -> isChecked = false
                    LAUNCH_ORDER_DESC -> isChecked = true
                }
            }

            orderSwitch.setOnCheckedChangeListener { _, isChecked ->
                newOrder = if (isChecked) {
                    LAUNCH_ORDER_DESC
                } else {
                    LAUNCH_ORDER_ASC
                }
            }

            view.findViewById<TextView>(R.id.apply_btn).setOnClickListener {

                val newFilter =
                    when (view.findViewById<RadioGroup>(R.id.filter_group).checkedRadioButtonId) {
                        R.id.filter_success -> LAUNCH_SUCCESS
                        R.id.filter_failure -> LAUNCH_FAILED
                        R.id.filter_unknown -> LAUNCH_UNKNOWN
                        R.id.filter_all -> LAUNCH_ALL
                        else -> null
                    }

                val yearQuery = view.findViewById<EditText>(R.id.year_query).text.toString()

                // Save data to view model
                viewModel.apply {
                    newOrder?.let { order ->
                        setLaunchOrder(order)
                    }
                    newFilter?.let { filter ->
                        setLaunchFilter(filter)
                    }
                    setQuery(yearQuery)
                }

                startNewSearch()
                dialog.dismiss()
            }

            view.findViewById<TextView>(R.id.cancel_btn).setOnClickListener {
                dialog.dismiss()
            }

            dialog.show()
        }
    }

    private fun startNewSearch() {
        printLogDebug("DCM", "start new search")
        viewModel.clearList()
        viewModel.loadFirstPage()
    }

    private fun displayErrorDialogNoLinks() {
        viewModel.setStateEvent(
            stateEvent = PokemonStateEvent.CreateStateMessageEvent(
                StateMessage(
                    response = Response(
                        messageType = MessageType.Info,
                        message = getString(R.string.no_links),
                        uiComponentType = UIComponentType.Dialog
                    )
                )
            )
        )
    }

    private fun displayErrorDialogUnableToLoadLink() {
        viewModel.setStateEvent(
            stateEvent = PokemonStateEvent.CreateStateMessageEvent(
                StateMessage(
                    response = Response(
                        messageType = MessageType.Error,
                        message = getString(R.string.error_links),
                        uiComponentType = UIComponentType.Dialog
                    )
                )
            )
        )
    }

}










































