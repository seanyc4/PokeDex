package com.seancoyle.launch_viewstate

import android.os.Parcelable
import com.seancoyle.core.state.ViewState
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_models.model.PokemonList
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonViewState(

    var pokemonList: List<PokemonList>? = null,
    var launch: Pokemon? = null,
    var layoutManagerState: Parcelable? = null,
    var numPokemonInCache: Int? = null,
    var page: Int? = null,
    var isQueryExhausted: Boolean? = null,
    var isDialogFilterDisplayed: Boolean? = null,
    var launchFilter: Int? = null,
    var order: String? = null,
    var yearQuery: String? = null,

    ): Parcelable, ViewState
























