package com.seancoyle.launch_datasource.di.cache

import com.seancoyle.database.daos.PokemonDao
import com.seancoyle.launch_datasource.cache.PokemonCacheDataSource
import com.seancoyle.launch_datasource.cache.PokemonCacheDataSourceImpl
import com.seancoyle.launch_datasource.cache.PokemonEntityMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokemonCacheDataSourceModule {

    @Singleton
    @Provides
    fun providePokemonCacheDataSource(
        dao: PokemonDao,
        pokemonEntityMapper: PokemonEntityMapper
    ): PokemonCacheDataSource {
        return PokemonCacheDataSourceImpl(
            dao = dao,
            entityMapper = pokemonEntityMapper
        )
    }
}