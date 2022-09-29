package com.seancoyle.launch_datasource.cache.pokemon

import com.seancoyle.launch_models.model.Pokemon

interface PokemonCacheDataSource {

    suspend fun insert(pokemon: Pokemon): Long

    suspend fun getById(id: Int): Pokemon?

    suspend fun getAll(): List<Pokemon>?

    suspend fun getTotalEntries(): Int

    suspend fun insertList(pokemons: List<Pokemon>): LongArray

    suspend fun filterLaunchList(
        year: String?,
        order: String,
        launchFilter: Int?,
        page: Int
    ): List<Pokemon>?
}






