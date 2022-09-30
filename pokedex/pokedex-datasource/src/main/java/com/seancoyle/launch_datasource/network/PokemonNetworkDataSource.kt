package com.seancoyle.launch_datasource.network

import com.seancoyle.launch_models.model.PokemonList
import com.seancoyle.poke_domain.model.PokeInfo

interface PokemonNetworkDataSource {

    suspend fun getPokemon(name: String): PokeInfo

    suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): PokemonList

}
