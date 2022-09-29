package com.seancoyle.launch_usecases.di

import com.seancoyle.core.di.IODispatcher
import com.seancoyle.launch_datasource.cache.pokeinfo.PokemonInfoCacheDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_usecases.pokelist.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.CoroutineDispatcher

@Module
@InstallIn(ViewModelComponent::class)
object PokemonUseCaseModule {

    @ViewModelScoped
    @Provides
    fun provideLaunchUseCases(
        @IODispatcher ioDispatcher: CoroutineDispatcher,
        pokemonInfoCacheDataSource: PokemonInfoCacheDataSource,
        pokemonNetworkDataSource: PokemonNetworkDataSource
    ): PokeListUseCases {
        return PokeListUseCases(
            getAllPokemonFromCacheUseCase = GetAllPokemonFromCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokemonInfoCacheDataSource
            ),
            getPokemonListFromNetworkAndInsertToCacheUseCase = GetPokemonListFromNetworkAndInsertToCacheUseCase(
                ioDispatcher = ioDispatcher,
                pokemonNetworkDataSource = pokemonNetworkDataSource,
                cacheDataSource = pokemonInfoCacheDataSource
            ),
            getNumPokeListFromCacheUseCase = GetNumPokeListFromCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokemonInfoCacheDataSource
            ),
            filterPokemonItemsInCacheUseCase = FilterPokemonItemsInCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokemonInfoCacheDataSource
            )
        )
    }

}