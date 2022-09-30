package com.seancoyle.launch_datasource.cache.pokelist

import com.seancoyle.database.daos.PokeListDao
import com.seancoyle.database.daos.returnOrderedQuery
import com.seancoyle.launch_models.model.Pokemon
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokeListCacheDataSourceImpl
@Inject
constructor(
    private val dao: PokeListDao,
    private val entityMapper: PokeListEntityMapper
) : PokeListCacheDataSource {

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
                domainList = pokemons
            )
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
        name: String?,
        order: String,
        numerical: Boolean?,
        typeFilter: Int?,
        page: Int
    ): List<Pokemon>? {
        return dao.returnOrderedQuery(
            name = name,
            order = order,
            numerical = numerical,
            typeFilter = typeFilter,
            page = page
        )?.let {
            entityMapper.entityListToDomainList(it)
        }
    }

}





















