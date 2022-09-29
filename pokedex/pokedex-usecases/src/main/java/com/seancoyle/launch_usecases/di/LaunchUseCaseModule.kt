package com.seancoyle.launch_usecases.di

import com.seancoyle.core.di.IODispatcher
import com.seancoyle.launch_datasource.cache.pokeinfo.PokemonInfoCacheDataSource
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
        pokemonInfoCacheDataSource: PokemonInfoCacheDataSource,
        pokemonNetworkDataSource: PokemonNetworkDataSource
    ): PokemonUseCases {
        return PokemonUseCases(
            getAllLaunchItemsFromCacheUseCase = GetAllLaunchItemsFromCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokemonInfoCacheDataSource
            ),
            getLaunchListFromNetworkAndInsertToCacheUseCase = GetLaunchListFromNetworkAndInsertToCacheUseCase(
                ioDispatcher = ioDispatcher,
                launchNetworkDataSource = pokemonNetworkDataSource,
                cacheDataSource = pokemonInfoCacheDataSource
            ),
            getNumLaunchItemsFromCacheUseCase = GetNumLaunchItemsFromCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokemonInfoCacheDataSource
            ),
            filterLaunchItemsInCacheUseCase = FilterLaunchItemsInCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokemonInfoCacheDataSource
            )
        )
    }

}