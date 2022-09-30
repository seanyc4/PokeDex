package com.seancoyle.launch_datasource.di.cache

import com.seancoyle.launch_datasource.cache.pokelist.PokeListEntityMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokeListCacheMapperModule {

    @Singleton
    @Provides
    fun providePokeListCacheMapper(): PokeListEntityMapper {
        return PokeListEntityMapper()
    }
}