package com.seancoyle.launch_usecases.pokelist

class PokeListUseCases(
    val getAllPokemonFromCacheUseCase: GetAllPokemonFromCacheUseCase,
    val getPokeListFromNetworkAndInsertToCacheUseCase: GetPokemonListFromNetworkAndInsertToCacheUseCase,
    val getNumPokeListFromCacheUseCase: GetNumPokeListFromCacheUseCase,
    val filterPokemonItemsInCacheUseCase: FilterPokemonItemsInCacheUseCase
)














