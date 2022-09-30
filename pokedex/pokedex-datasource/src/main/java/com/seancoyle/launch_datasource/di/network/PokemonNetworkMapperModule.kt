package com.seancoyle.launch_datasource.di.network

import com.seancoyle.launch_datasource.network.PokemonNetworkMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokemonNetworkMapperModule {

    @Singleton
    @Provides
    fun providePokemonNetworkMapper(): PokemonNetworkMapper {
        return PokemonNetworkMapper()
    }
}