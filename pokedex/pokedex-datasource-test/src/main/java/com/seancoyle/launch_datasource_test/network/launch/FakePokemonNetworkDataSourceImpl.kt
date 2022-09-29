package com.seancoyle.launch_datasource_test.network.launch

import com.google.gson.GsonBuilder
import com.seancoyle.launch_datasource.network.PokemonNetworkDataSource
import com.seancoyle.launch_datasource.network.PokemonNetworkMapper
import com.seancoyle.launch_datasource.network.api.PokemonApi
import com.seancoyle.launch_models.model.PokemonInfo
import com.seancoyle.launch_models.model.PokemonList
import okhttp3.HttpUrl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FakePokemonNetworkDataSourceImpl
constructor(
    private val baseUrl: HttpUrl,
    private val networkMapper: PokemonNetworkMapper
) : PokemonNetworkDataSource {

    private val api: PokemonApi = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .build()
        .create(PokemonApi::class.java)

    override suspend fun getPokemon(name: String): PokemonInfo {
        TODO("Not yet implemented")
    }

    override suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): List<PokemonList> {
        return networkMapper.mapListDtoToDomain(
            api.getPokemonList(
                limit = limit,
                offset = offset
            )
        )
    }

}
