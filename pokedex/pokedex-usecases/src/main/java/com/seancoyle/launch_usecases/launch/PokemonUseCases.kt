package com.seancoyle.launch_usecases.launch

class PokemonUseCases(
    val getAllLaunchItemsFromCacheUseCase: GetAllLaunchItemsFromCacheUseCase,
    val getLaunchListFromNetworkAndInsertToCacheUseCase: GetLaunchListFromNetworkAndInsertToCacheUseCase,
    val getNumLaunchItemsFromCacheUseCase: GetNumLaunchItemsFromCacheUseCase,
    val filterLaunchItemsInCacheUseCase: FilterLaunchItemsInCacheUseCase
)














