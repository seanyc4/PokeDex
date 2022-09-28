package com.seancoyle.pokedex.framework.datasource.network.launch

import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkMapper
import com.seancoyle.launch_models.model.launch.LaunchModel
import com.seancoyle.launch_models.model.launch.LaunchOptions
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FakePokemonNetworkDataSourceImpl
    @Inject
    constructor(
        private val fakeApi: FakePokemonApi,
        private val networkMapper: PokemonNetworkMapper
    ) : PokemonNetworkDataSource {

        override suspend fun getPokemonList(launchOptions: LaunchOptions): List<LaunchModel> {
            return networkMapper.mapListDtoToDomain(
                fakeApi.getLaunchList(options = launchOptions)
            )
        }

    }