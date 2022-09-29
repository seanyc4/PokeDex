package com.seancoyle.launch_datasource.network

import androidx.annotation.Keep
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Keep
data class PokemonListDto(

    @Expose
    @SerializedName(value = "count")
    val count: Int?,

    @Expose
    @SerializedName(value = "next")
    val next: String?,

    @Expose
    @SerializedName(value = "previous")
    val previous: String?,

    @Expose
    @SerializedName(value = "results")
    val results: List<PokemonDto?>?
)

@Keep
data class PokemonDto(

    @Expose
    @SerializedName(value = "name")
    val name: String?,

    @Expose
    @SerializedName(value = "url")
    val url: String?,

    val image: String?
)