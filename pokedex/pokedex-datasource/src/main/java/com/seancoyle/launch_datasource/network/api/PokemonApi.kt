package com.seancoyle.launch_datasource.network.api

import com.seancoyle.launch_datasource.network.PokemonInfoDto
import com.seancoyle.launch_datasource.network.PokemonListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApi {

    @GET("api/v2/pokemon/{name}")
    suspend fun getPokemon(
        @Path(value = "name")
        name: String
    ): PokemonInfoDto

    @GET("api/v2/pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonListDto

}