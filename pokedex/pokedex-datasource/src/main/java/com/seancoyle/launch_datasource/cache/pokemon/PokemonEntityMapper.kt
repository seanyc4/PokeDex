package com.seancoyle.launch_datasource.cache.pokemon

import com.seancoyle.database.entities.PokemonEntity
import com.seancoyle.launch_models.model.Pokemon

class PokemonEntityMapper {

    fun entityListToDomainList(entities: List<PokemonEntity>): List<Pokemon> {
        val list: ArrayList<Pokemon> = ArrayList()
        for (entity in entities) {
            list.add(mapToDomain(entity))
        }
        return list
    }

    fun domainListToEntityList(domainList: List<Pokemon>): List<PokemonEntity> {
        val entities: ArrayList<PokemonEntity> = ArrayList()
        for (item in domainList) {
            entities.add(mapFromDomain(item))
        }
        return entities
    }

    fun mapToDomain(entity: PokemonEntity): Pokemon {
        entity.apply {
            return Pokemon(
                name = name,
                url = url,
                image = image
            )
        }
    }

    fun mapFromDomain(entity: Pokemon): PokemonEntity {
        entity.apply {
            return PokemonEntity(
                name = name,
                url = url,
                image = image
            )
        }
    }

}







