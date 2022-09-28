package com.seancoyle.launch_datasource.network

import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_models.model.PokemonList

interface PokemonNetworkDataSource {

    suspend fun getPokemon(name: String): Pokemon

    suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): List<PokemonList>

}
