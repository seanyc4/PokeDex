package com.seancoyle.launch_datasource.di.cache

import com.seancoyle.database.daos.PokeListDao
import com.seancoyle.launch_datasource.cache.pokelist.PokeListCacheDataSource
import com.seancoyle.launch_datasource.cache.pokelist.PokeListCacheDataSourceImpl
import com.seancoyle.launch_datasource.cache.pokelist.PokeListEntityMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokeListCacheDataSourceModule {

    @Singleton
    @Provides
    fun providePokeListCacheDataSource(
        dao: PokeListDao,
        pokeListMapper: PokeListEntityMapper
    ): PokeListCacheDataSource {
        return PokeListCacheDataSourceImpl(
            dao = dao,
            entityMapper = pokeListMapper
        )
    }
}