package com.seancoyle.launch_datasource.di.cache

import com.seancoyle.database.daos.PokeInfoDao
import com.seancoyle.launch_datasource.cache.pokeinfo.PokemonInfoCacheDataSource
import com.seancoyle.launch_datasource.cache.pokeinfo.PokemonInfoCacheDataSourceImpl
import com.seancoyle.launch_datasource.cache.pokemon.PokemonEntityMapper
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
        dao: PokeInfoDao,
        pokemonEntityMapper: PokemonEntityMapper
    ): PokemonInfoCacheDataSource {
        return PokemonInfoCacheDataSourceImpl(
            dao = dao,
            entityMapper = pokemonEntityMapper
        )
    }
}