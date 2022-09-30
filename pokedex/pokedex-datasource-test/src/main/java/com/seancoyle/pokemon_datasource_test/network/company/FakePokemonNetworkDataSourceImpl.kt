package com.seancoyle.pokemon_datasource_test.network.company

import com.google.gson.GsonBuilder
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkMapper
import com.seancoyle.launch_datasource.network.api.PokemonApi
import com.seancoyle.launch_models.model.PokemonList
import com.seancoyle.poke_domain.model.PokeInfo
import okhttp3.HttpUrl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FakePokemonNetworkDataSourceImpl
constructor(
    private val baseUrl: HttpUrl,
    private val networkMapper: PokemonNetworkMapper
) : PokemonNetworkDataSource {

    private val pokemonApi: PokemonApi = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .build()
        .create(PokemonApi::class.java)

    override suspend fun getPokemon(name: String): PokeInfo {
        return networkMapper.mapToDomain(
            pokemonApi.getPokemon(name = name)
        )
    }

    override suspend fun getPokemonList(limit: Int, offset: Int): PokemonList {
        return networkMapper.mapListToDomain(
            pokemonApi.getPokemonList(
                limit = limit,
                offset = offset
            )
        )
    }

}
