package com.seancoyle.pokedex.di.data.launch

import com.seancoyle.launch_datasource.network.abstraction.launch.LaunchNetworkDataSource
import com.seancoyle.launch_datasource.network.mappers.launch.LaunchNetworkMapper
import com.seancoyle.launch_datasource.di.network.launch.LaunchNetworkDataSourceModule
import com.seancoyle.pokedex.framework.datasource.network.launch.FakeLaunchApi
import com.seancoyle.pokedex.framework.datasource.network.launch.FakeLaunchNetworkDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton


@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [LaunchNetworkDataSourceModule::class]
)
object TestLaunchNetworkDataSourceModule {

    @Singleton
    @Provides
    fun provideLaunchNetworkDataSource(
        fakeApi: FakeLaunchApi,
        networkMapper: LaunchNetworkMapper
    ): LaunchNetworkDataSource {
        return FakeLaunchNetworkDataSourceImpl(
            fakeApi = fakeApi,
            networkMapper = networkMapper
        )
    }

}