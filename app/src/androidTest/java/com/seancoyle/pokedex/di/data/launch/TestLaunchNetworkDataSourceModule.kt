package com.seancoyle.pokedex.di.data.launch

import com.seancoyle.launch_datasource.di.network.PokemonNetworkDataSourceModule
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkMapper
import com.seancoyle.pokedex.framework.datasource.network.launch.FakePokemonApi
import com.seancoyle.pokedex.framework.datasource.network.launch.FakePokemonNetworkDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton


@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [PokemonNetworkDataSourceModule::class]
)
object TestLaunchNetworkDataSourceModule {

    @Singleton
    @Provides
    fun provideLaunchNetworkDataSource(
        fakeApi: FakePokemonApi,
        networkMapper: PokemonNetworkMapper
    ): PokemonNetworkDataSource {
        return FakePokemonNetworkDataSourceImpl(
            fakeApi = fakeApi,
            networkMapper = networkMapper
        )
    }

}