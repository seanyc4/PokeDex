package com.seancoyle.launch_models.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonList(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Pokemon>
) : Parcelable

@Parcelize
data class Pokemon(
    val name: String,
    val url: String,
    val image: String
) : Parcelable