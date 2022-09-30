package com.seancoyle.launch_datasource.cache.pokelist

import com.seancoyle.database.entities.PokeListEntity
import com.seancoyle.launch_models.model.Pokemon

class PokeListEntityMapper {

    fun entityListToDomainList(entities: List<PokeListEntity>): List<Pokemon> {
        val list: ArrayList<Pokemon> = ArrayList()
        for (entity in entities) {
            list.add(mapToDomain(entity))
        }
        return list
    }

    fun domainListToEntityList(domainList: List<Pokemon>): List<PokeListEntity> {
        val entities: ArrayList<PokeListEntity> = ArrayList()
        for (item in domainList) {
            entities.add(mapFromDomain(item))
        }
        return entities
    }

    fun mapToDomain(entity: PokeListEntity): Pokemon {
        entity.apply {
            return Pokemon(
                name = name,
                url = url,
                image = image
            )
        }
    }

    fun mapFromDomain(entity: Pokemon): PokeListEntity {
        entity.apply {
            return PokeListEntity(
                name = name,
                url = url,
                image = image
            )
        }
    }

}







