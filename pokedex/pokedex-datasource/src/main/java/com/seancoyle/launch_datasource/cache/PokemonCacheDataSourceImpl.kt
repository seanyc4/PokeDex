package com.seancoyle.launch_datasource.cache

import com.seancoyle.database.daos.PokemonDao
import com.seancoyle.launch_models.model.Pokemon
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonCacheDataSourceImpl
@Inject
constructor(
    private val dao: PokemonDao,
    private val entityMapper: PokemonEntityMapper
) : PokemonCacheDataSource {

    override suspend fun insert(pokemon: Pokemon): Long {
        return dao.insert(
            entityMapper.mapFromDomain(
                entity = pokemon
            )
        )
    }

    override suspend fun insertList(pokemons: List<Pokemon>): LongArray {
        return dao.insertList(
            entityMapper.domainListToEntityList(
                pokemons = pokemons
            )
        )
    }

    override suspend fun deleteList(pokemons: List<Pokemon>): Int {
        val ids = pokemons.mapIndexed { _, item -> item.id }
        return dao.deleteList(
            ids = ids
        )
    }

    override suspend fun deleteAll() {
        return dao.deleteAll()
    }

    override suspend fun deleteById(id: Int): Int {
        return dao.deleteById(
            id = id
        )
    }

    override suspend fun getById(id: Int): Pokemon? {
        return dao.getById(id = id)?.let {
            entityMapper.mapToDomain(it)
        }
    }

    override suspend fun getAll(): List<Pokemon>? {
        return dao.getAll()?.let {
            entityMapper.entityListToDomainList(it)
        }
    }

    override suspend fun getTotalEntries(): Int {
        return dao.getTotalEntries()
    }

    override suspend fun filterLaunchList(
        year: String?,
        order: String,
        launchFilter: Int?,
        page: Int
    ): List<Pokemon>? {

        TODO()
        /*return dao.returnOrderedQuery(
            year = year,
            launchFilter = launchFilter,
            page = page,
            order = order
        )?.let {
            entityMapper.entityListToDomainList(it)
        }*/
    }

}





















