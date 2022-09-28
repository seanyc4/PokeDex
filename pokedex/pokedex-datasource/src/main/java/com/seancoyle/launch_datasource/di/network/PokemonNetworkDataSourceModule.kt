package com.seancoyle.launch_datasource.di.network

import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSourceImpl
import com.seancoyle.launch_datasource.network.PokemonNetworkMapper
import com.seancoyle.launch_datasource.network.api.PokemonApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokemonNetworkDataSourceModule {

    @Singleton
    @Provides
    fun providePokemonNetworkDataSource(
        api: PokemonApi,
        networkMapper: PokemonNetworkMapper
    ): PokemonNetworkDataSource {
        return PokemonNetworkDataSourceImpl(
            api = api,
            networkMapper = networkMapper
        )
    }
}