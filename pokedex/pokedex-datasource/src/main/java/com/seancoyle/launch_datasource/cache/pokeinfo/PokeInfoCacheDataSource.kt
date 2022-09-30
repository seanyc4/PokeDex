package com.seancoyle.launch_datasource.cache.pokeinfo

import com.seancoyle.poke_domain.model.PokeInfo

interface PokeInfoCacheDataSource {

    suspend fun insert(pokeInfo: PokeInfo): Long

    suspend fun getById(id: Int): PokeInfo?

    suspend fun getAll(): List<PokeInfo>?

    suspend fun getTotalEntries(): Int

    suspend fun insertList(pokemons: List<PokeInfo>): LongArray

    suspend fun filterLaunchList(
        year: String?,
        order: String,
        launchFilter: Int?,
        page: Int
    ): List<PokeInfo>?
}






