package com.seancoyle.pokedex.framework.datasource.network.launch

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seancoyle.core.testing.JsonFileReader
import com.seancoyle.launch_datasource.network.api.PokemonApi
import com.seancoyle.launch_datasource.network.model.launch.LaunchDto
import com.seancoyle.poke_domain.model.launch.LaunchOptions
import javax.inject.Singleton

const val LAUNCH_LIST_RAW_JSON_FILE_NAME = "launch_list_raw.json"

@Singleton
class FakePokemonApi(
    private val jsonFileReader: JsonFileReader
) : PokemonApi {

    override suspend fun getLaunchList(options: LaunchOptions): LaunchDto {
        return Gson()
            .fromJson(
                jsonFileReader.readJSONFromAsset(LAUNCH_LIST_RAW_JSON_FILE_NAME),
                object : TypeToken<LaunchDto>() {}.type
            )
    }
}