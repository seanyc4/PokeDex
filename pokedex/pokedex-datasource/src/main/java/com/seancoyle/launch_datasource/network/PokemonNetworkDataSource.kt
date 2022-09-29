package com.seancoyle.launch_datasource.network

import com.seancoyle.launch_models.model.PokemonInfo
import com.seancoyle.launch_models.model.PokemonList

interface PokemonNetworkDataSource {

    suspend fun getPokemon(name: String): PokemonInfo

    suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): PokemonList

}
