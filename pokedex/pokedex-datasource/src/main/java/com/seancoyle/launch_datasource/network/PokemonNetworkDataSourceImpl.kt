package com.seancoyle.launch_datasource.network

import com.seancoyle.launch_datasource.network.api.PokemonApi
import com.seancoyle.launch_models.model.PokemonList
import com.seancoyle.poke_domain.model.PokeInfo
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PokemonNetworkDataSourceImpl
@Inject
constructor(
    private val api: PokemonApi,
    private val networkMapper: PokemonNetworkMapper
) : PokemonNetworkDataSource {

    override suspend fun getPokemon(name: String): PokeInfo {
        return networkMapper.mapToDomain(
            api.getPokemon(name = name)
        )
    }

    override suspend fun getPokemonList(limit: Int, offset: Int): PokemonList {
        return networkMapper.mapListToDomain(
            api.getPokemonList(
                limit = limit,
                offset = offset
            )
        )
    }

}





























