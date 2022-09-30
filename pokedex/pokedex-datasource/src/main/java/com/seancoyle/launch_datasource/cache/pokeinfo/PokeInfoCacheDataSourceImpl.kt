package com.seancoyle.launch_datasource.cache.pokeinfo

import com.seancoyle.database.daos.PokeInfoDao
import com.seancoyle.poke_domain.model.PokeInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokeInfoCacheDataSourceImpl
@Inject
constructor(
    private val dao: PokeInfoDao,
    private val entityMapper: PokeInfoEntityMapper
) : PokeInfoCacheDataSource {

    override suspend fun insert(pokeInfo: PokeInfo): Long {
        return dao.insert(
            entityMapper.mapFromDomain(
                entity = pokeInfo
            )
        )
    }

    override suspend fun insertList(pokeInfos: List<PokeInfo>): LongArray {
        return dao.insertList(
            entityMapper.domainListToEntityList(
                domainList = pokeInfos
            )
        )
    }

    override suspend fun getById(id: Int): PokeInfo? {
        return dao.getById(id = id)?.let {
            entityMapper.mapToDomain(it)
        }
    }

    override suspend fun getAll(): List<PokeInfo>? {
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
    ): List<PokeInfo>? {

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





















