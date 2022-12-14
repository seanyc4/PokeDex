package com.seancoyle.pokedex.di.data.launch

import com.seancoyle.launch_datasource.di.network.launch.LaunchApiModule
import com.seancoyle.core.testing.JsonFileReader
import com.seancoyle.pokedex.framework.datasource.network.launch.FakeLaunchApi
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton


@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [LaunchApiModule::class]
)
object TestLaunchApiModule {

    @Singleton
    @Provides
    fun provideLaunchApiService(
        jsonFileReader: JsonFileReader
    ): FakeLaunchApi {
        return FakeLaunchApi(
            jsonFileReader = jsonFileReader
        )
    }

}