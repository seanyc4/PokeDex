package com.seancoyle.launch_datasource.cache.pokeinfo

import com.seancoyle.launch_models.model.PokemonInfo

interface PokemonInfoCacheDataSource {

    suspend fun insert(pokemonInfo: PokemonInfo): Long

    suspend fun getById(id: Int): PokemonInfo?

    suspend fun getAll(): List<PokemonInfo>?

    suspend fun getTotalEntries(): Int

    suspend fun insertList(pokemons: List<PokemonInfo>): LongArray

    suspend fun filterLaunchList(
        year: String?,
        order: String,
        launchFilter: Int?,
        page: Int
    ): List<PokemonInfo>?
}






