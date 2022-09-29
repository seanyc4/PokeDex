package com.seancoyle.launch_datasource.cache.pokeinfo

import com.seancoyle.database.daos.PokeInfoDao
import com.seancoyle.launch_models.model.PokemonInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonInfoCacheDataSourceImpl
@Inject
constructor(
    private val dao: PokeInfoDao,
    private val entityMapper: PokemonInfoEntityMapper
) : PokemonInfoCacheDataSource {

    override suspend fun insert(pokemonInfo: PokemonInfo): Long {
        return dao.insert(
            entityMapper.mapFromDomain(
                entity = pokemonInfo
            )
        )
    }

    override suspend fun insertList(pokemonInfos: List<PokemonInfo>): LongArray {
        return dao.insertList(
            entityMapper.domainListToEntityList(
                domainList = pokemonInfos
            )
        )
    }

    override suspend fun getById(id: Int): PokemonInfo? {
        return dao.getById(id = id)?.let {
            entityMapper.mapToDomain(it)
        }
    }

    override suspend fun getAll(): List<PokemonInfo>? {
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
    ): List<PokemonInfo>? {

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





















