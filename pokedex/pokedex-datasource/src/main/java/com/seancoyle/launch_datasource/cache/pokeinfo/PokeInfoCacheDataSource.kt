package com.seancoyle.launch_datasource.cache.pokeinfo

import com.seancoyle.poke_domain.model.PokeInfo

interface PokeInfoCacheDataSource {

    suspend fun insert(pokemon: PokeInfo): Long

    suspend fun getById(name: String): PokeInfo?

}






