package com.seancoyle.launch_datasource.di.network

import com.seancoyle.launch_datasource.network.PokemonNetworkMapper
import com.seancoyle.launch_datasource.network.dateformatter.DateFormatter
import com.seancoyle.launch_datasource.network.datetransformer.DateTransformer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PokemonNetworkMapperModule {

    @Singleton
    @Provides
    fun providePokemonNetworkMapper(
        dateFormatter: DateFormatter,
        dateTransformer: DateTransformer
    ): PokemonNetworkMapper {
        return PokemonNetworkMapper(
            dateFormatter = dateFormatter,
            dateTransformer = dateTransformer
        )
    }
}