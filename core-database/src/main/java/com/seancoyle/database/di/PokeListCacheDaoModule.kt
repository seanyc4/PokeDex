package com.seancoyle.database.di

import com.seancoyle.database.Database
import com.seancoyle.database.daos.PokeListDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokeListCacheDaoModule {

    @Singleton
    @Provides
    fun providePokeListDao(database: Database): PokeListDao {
        return database.pokeListDao()
    }
}