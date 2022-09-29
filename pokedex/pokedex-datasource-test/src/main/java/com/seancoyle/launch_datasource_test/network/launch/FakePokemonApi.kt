package com.seancoyle.launch_datasource_test.network.launch

import com.seancoyle.core.testing.JsonFileReader
import com.seancoyle.launch_datasource.network.PokemonInfoDto
import com.seancoyle.launch_datasource.network.PokemonListDto
import com.seancoyle.launch_datasource.network.api.PokemonApi
import javax.inject.Singleton

const val LAUNCH_LIST_RAW_JSON_FILE_NAME = "launch_list_raw.json"

@Singleton
class FakePokemonApi(
    private val jsonFileReader: JsonFileReader
) : PokemonApi {

    override suspend fun getPokemon(name: String): PokemonInfoDto {
        TODO("Not yet implemented")
        /*return Gson()
            .fromJson(
                jsonFileReader.readJSONFromAsset(LAUNCH_LIST_RAW_JSON_FILE_NAME),
                object : TypeToken<LaunchDto>() {}.type
            )*/
    }

    override suspend fun getPokemonList(limit: Int, offset: Int): PokemonListDto {
        TODO("Not yet implemented")
    }
}