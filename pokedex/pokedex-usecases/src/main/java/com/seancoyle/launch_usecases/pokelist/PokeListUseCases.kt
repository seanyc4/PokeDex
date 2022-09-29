package com.seancoyle.launch_usecases.pokelist

class PokeListUseCases(
    val getAllPokemonFromCacheUseCase: GetAllPokemonFromCacheUseCase,
    val getPokemonListFromNetworkAndInsertToCacheUseCase: GetPokemonListFromNetworkAndInsertToCacheUseCase,
    val getNumPokeListFromCacheUseCase: GetNumPokeListFromCacheUseCase,
    val filterPokemonItemsInCacheUseCase: FilterPokemonItemsInCacheUseCase
)














