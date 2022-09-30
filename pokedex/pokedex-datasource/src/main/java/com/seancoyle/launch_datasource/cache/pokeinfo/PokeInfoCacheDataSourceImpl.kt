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

    override suspend fun insert(pokemon: PokeInfo): Long {
        return dao.insert(
            entityMapper.mapFromDomain(
                entity = pokemon
            )
        )
    }

    override suspend fun getById(name: String): PokeInfo? {
        return dao.getById(name = name)?.let {
            entityMapper.mapToDomain(it)
        }
    }

}





















