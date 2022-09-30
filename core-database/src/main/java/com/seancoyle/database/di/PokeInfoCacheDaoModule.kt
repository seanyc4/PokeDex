package com.seancoyle.database.di

import com.seancoyle.database.Database
import com.seancoyle.database.daos.PokeInfoDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokeInfoCacheDaoModule {

    @Singleton
    @Provides
    fun providePokeInfoDao(database: Database): PokeInfoDao {
        return database.pokeInfoDao()
    }
}