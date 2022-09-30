package com.seancoyle.launch_usecases.di

import com.seancoyle.core.di.IODispatcher
import com.seancoyle.launch_datasource.cache.pokelist.PokeListCacheDataSource
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
object PokeListUseCaseModule {

    @ViewModelScoped
    @Provides
    fun providePokeListUseCases(
        @IODispatcher ioDispatcher: CoroutineDispatcher,
        pokeListCacheDataSource: PokeListCacheDataSource,
        pokemonNetworkDataSource: PokemonNetworkDataSource
    ): PokeListUseCases {
        return PokeListUseCases(
            getAllPokemonFromCacheUseCase = GetAllPokemonFromCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokeListCacheDataSource
            ),
            getPokeListFromNetworkAndInsertToCacheUseCase = GetPokemonListFromNetworkAndInsertToCacheUseCase(
                ioDispatcher = ioDispatcher,
                pokemonNetworkDataSource = pokemonNetworkDataSource,
                cacheDataSource = pokeListCacheDataSource
            ),
            getNumPokeListFromCacheUseCase = GetNumPokeListFromCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokeListCacheDataSource
            ),
            filterPokemonItemsInCacheUseCase = FilterPokemonItemsInCacheUseCase(
                ioDispatcher = ioDispatcher,
                cacheDataSource = pokeListCacheDataSource
            )
        )
    }

}