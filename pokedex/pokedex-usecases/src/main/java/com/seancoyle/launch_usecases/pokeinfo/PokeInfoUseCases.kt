package com.seancoyle.launch_usecases.pokeinfo

class PokeInfoUseCases(
    getPokemonByIdFromCacheUseCase: GetPokemonByIdFromCacheUseCase,
    getPokemonFromNetworkAndInsertToCacheUseCase: GetPokemonFromNetworkAndInsertToCacheUseCase
)