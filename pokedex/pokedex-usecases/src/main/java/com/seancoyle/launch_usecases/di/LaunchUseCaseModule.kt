package com.seancoyle.launch_usecases.di

import com.seancoyle.core.di.IODispatcher
import com.seancoyle.launch_datasource.cache.PokemonCacheDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_usecases.launch.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.CoroutineDispatcher

@Module
@InstallIn(ViewModelComponent::class)
object LaunchUseCaseModule {

    @ViewModelScoped
    @Provides
    fun provideLaunchUseCases(
        @IODispatcher ioDispatcher: CoroutineDispatcher,
        pokemonCacheDataSource: PokemonCacheDataSource,
        pokemonNetworkDataSource: PokemonNetworkDataSource
    ): PokemonUseCases {
        return PokemonUseCases(
            getAllLaunchItemsFromCacheUseCase = GetAllLaunchItemsFromCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokemonCacheDataSource
            ),
            getLaunchListFromNetworkAndInsertToCacheUseCase = GetLaunchListFromNetworkAndInsertToCacheUseCase(
                ioDispatcher = ioDispatcher,
                launchNetworkDataSource = pokemonNetworkDataSource,
                cacheDataSource = pokemonCacheDataSource
            ),
            getNumLaunchItemsFromCacheUseCase = GetNumLaunchItemsFromCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokemonCacheDataSource
            ),
            filterLaunchItemsInCacheUseCase = FilterLaunchItemsInCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokemonCacheDataSource
            )
        )
    }

}