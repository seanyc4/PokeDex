package com.seancoyle.launch_datasource.network

import com.seancoyle.launch_datasource.network.api.PokemonApi
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_models.model.PokemonList
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PokemonNetworkDataSourceImpl
@Inject
constructor(
    private val api: PokemonApi,
    private val networkMapper: PokemonNetworkMapper
) : PokemonNetworkDataSource {

    override suspend fun getPokemon(name: String): Pokemon {
        return networkMapper.mapToDomain(
            api.getPokemon(name = name)
        )
    }

    override suspend fun getPokemonList(limit: Int, offset: Int): List<PokemonList> {
        return networkMapper.mapListDtoToDomain(
            api.getPokemonList(
                limit = limit,
                offset = offset
            )
        )
    }

}





























