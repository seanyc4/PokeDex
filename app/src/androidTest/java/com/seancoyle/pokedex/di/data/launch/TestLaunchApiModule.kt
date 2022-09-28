package com.seancoyle.pokedex.di.data.launch

import com.seancoyle.core.testing.JsonFileReader
import com.seancoyle.launch_datasource.di.network.PokemonApiModule
import com.seancoyle.pokedex.framework.datasource.network.launch.FakePokemonApi
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton


@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [PokemonApiModule::class]
)
object TestLaunchApiModule {

    @Singleton
    @Provides
    fun provideLaunchApiService(
        jsonFileReader: JsonFileReader
    ): FakePokemonApi {
        return FakePokemonApi(
            jsonFileReader = jsonFileReader
        )
    }

}