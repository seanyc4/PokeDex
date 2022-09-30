package com.seancoyle.launch_datasource.di.cache

import com.seancoyle.database.daos.PokeInfoDao
import com.seancoyle.launch_datasource.cache.pokeinfo.PokeInfoCacheDataSource
import com.seancoyle.launch_datasource.cache.pokeinfo.PokeInfoCacheDataSourceImpl
import com.seancoyle.launch_datasource.cache.pokeinfo.PokeInfoEntityMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokeInfoCacheDataSourceModule {

    @Singleton
    @Provides
    fun providePokeInfoCacheDataSource(
        dao: PokeInfoDao,
        pokeInfoMapper: PokeInfoEntityMapper
    ): PokeInfoCacheDataSource {
        return PokeInfoCacheDataSourceImpl(
            dao = dao,
            entityMapper = pokeInfoMapper
        )
    }
}