package com.seancoyle.pokedex.di.domain

import com.seancoyle.core.testing.JsonFileReader
import com.seancoyle.poke_domain.model.di.LaunchFactoryModule
import com.seancoyle.poke_domain.model.launch.LaunchFactory
import com.seancoyle.pokedex.LaunchDataFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton


@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [LaunchFactoryModule::class]
)
object TestLaunchFactoryModule {


    @Singleton
    @Provides
    fun provideLaunchFactory(): LaunchFactory {
        return LaunchFactory()
    }

    @Singleton
    @Provides
    fun provideLaunchDataFactory(
        jsonFileReader: JsonFileReader,
        launchFactory: LaunchFactory
    ): LaunchDataFactory {
        return LaunchDataFactory(
            jsonFileReader = jsonFileReader,
            factory = launchFactory
        )
    }


}