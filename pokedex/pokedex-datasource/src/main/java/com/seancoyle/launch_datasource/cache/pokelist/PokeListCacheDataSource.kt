package com.seancoyle.launch_datasource.cache.pokelist

import com.seancoyle.launch_models.model.Pokemon

interface PokeListCacheDataSource {

    suspend fun insert(pokemon: Pokemon): Long

    suspend fun getById(id: Int): Pokemon?

    suspend fun getAll(): List<Pokemon>?

    suspend fun getTotalEntries(): Int

    suspend fun insertList(pokemons: List<Pokemon>): LongArray

    suspend fun filterLaunchList(
        name: String?,
        order: String,
        numerical: Boolean?,
        typeFilter: Int?,
        page: Int
    ): List<Pokemon>?
}






