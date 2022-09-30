package com.seancoyle.launch_viewstate

import android.os.Parcelable
import com.seancoyle.core.state.ViewState
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_models.model.PokemonList
import com.seancoyle.poke_domain.model.PokeInfo
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonViewState(

    var pokemonList: PokemonList? = null,
    var pokeInfo: PokeInfo? = null,
    var selectedPokemon: Pokemon? = null,
    var pokemonListCache: List<Pokemon>? = null,
    var launch: PokeInfo? = null,
    var layoutManagerState: Parcelable? = null,
    var numPokemonInCache: Int? = null,
    var page: Int? = null,
    var isQueryExhausted: Boolean? = null,
    var isDialogFilterDisplayed: Boolean? = null,
    var launchFilter: Int? = null,
    var order: String? = null,
    var yearQuery: String? = null,

    ) : Parcelable, ViewState
























