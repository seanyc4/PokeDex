package com.seancoyle.pokemon_datasource_test.cache.pokeinfo

import com.seancoyle.launch_datasource.cache.pokeinfo.PokeInfoCacheDataSource
import com.seancoyle.poke_domain.model.PokeInfo

const val FORCE_INSERT_EXCEPTION = -4
const val FORCE_GENERAL_FAILURE = -5
const val INSERT_LAUNCH_LIST_FAILED = "Failed to insert new item."


class FakePokeInfoCacheDataSourceImpl
constructor(
    private val fakePokeInfoDatabase: FakePokeInfoDatabase
) : PokeInfoCacheDataSource {

    override suspend fun insert(pokemon: PokeInfo): Long {
        if (pokemon.id == FORCE_INSERT_EXCEPTION) {
            throw Exception("Something went wrong inserting company info.")
        }
        if (pokemon.id == FORCE_GENERAL_FAILURE) {
            return -1 // fail
        }
        fakePokeInfoDatabase.pokeInfo?.find { it == pokemon }
        return 1 // success
    }

    override suspend fun getById(name: String): PokeInfo? {
        return fakePokeInfoDatabase.pokeInfo?.find { it.name == name }
    }

}















