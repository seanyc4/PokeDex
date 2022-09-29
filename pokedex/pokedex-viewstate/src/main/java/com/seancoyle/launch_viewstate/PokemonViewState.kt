package com.seancoyle.launch_viewstate

import android.os.Parcelable
import com.seancoyle.core.state.ViewState
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_models.model.PokemonInfo
import com.seancoyle.launch_models.model.PokemonList
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonViewState(

    var pokemonList: PokemonList? = null,
    var pokemonInfo: PokemonInfo? = null,
    var pokemonListCache: List<Pokemon>? = null,
    var launch: PokemonInfo? = null,
    var layoutManagerState: Parcelable? = null,
    var numPokemonInCache: Int? = null,
    var page: Int? = null,
    var isQueryExhausted: Boolean? = null,
    var isDialogFilterDisplayed: Boolean? = null,
    var launchFilter: Int? = null,
    var order: String? = null,
    var yearQuery: String? = null,

    ): Parcelable, ViewState
























