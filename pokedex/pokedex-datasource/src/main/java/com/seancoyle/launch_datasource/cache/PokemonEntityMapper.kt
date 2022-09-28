package com.seancoyle.launch_datasource.cache

import com.seancoyle.database.entities.PokemonEntity
import com.seancoyle.launch_models.model.Pokemon
import com.seancoyle.launch_models.model.launch.LaunchType
import com.seancoyle.launch_models.model.launch.Links
import com.seancoyle.launch_models.model.launch.Rocket

class PokemonEntityMapper {

    fun entityListToDomainList(entities: List<PokemonEntity>): List<Pokemon> {
        val list: ArrayList<Pokemon> = ArrayList()
        for (entity in entities) {
            list.add(mapToDomain(entity))
        }
        return list
    }

    fun domainListToEntityList(pokemons: List<Pokemon>): List<PokemonEntity> {
        val entities: ArrayList<PokemonEntity> = ArrayList()
        for (item in pokemons) {
            entities.add(mapFromDomain(item))
        }
        return entities
    }

    fun mapToDomain(entity: PokemonEntity): Pokemon {
        entity.apply {
            return Pokemon(
                id = id,
                launchDate = launchDate,
                launchDateLocalDateTime = launchDateLocalDateTime,
                isLaunchSuccess = isLaunchSuccess,
                launchSuccessIcon = launchSuccessIcon,
                launchYear = launchYear,
                links = Links(
                    missionImage = links.missionImage,
                    articleLink = links.articleLink,
                    videoLink = links.videoLink,
                    wikipedia = links.wikipedia
                ),
                missionName = missionName,
                rocket = Rocket(
                    rocketNameAndType = rocket.rocketNameAndType
                ),
                daysToFromTitle = daysToFromTitle,
                launchDaysDifference = launchDaysDifference,
                type = LaunchType.TYPE_LAUNCH
            )
        }
    }

    fun mapFromDomain(entity: Pokemon): PokemonEntity {
        entity.apply {
            return PokemonEntity(
                id = id,
                launchDate = launchDate,
                launchDateLocalDateTime = launchDateLocalDateTime,
                isLaunchSuccess = isLaunchSuccess,
                launchSuccessIcon = launchSuccessIcon,
                launchYear = launchYear,
                links = LinksEntity(
                    missionImage = links.missionImage,
                    articleLink = links.articleLink,
                    videoLink = links.videoLink,
                    wikipedia = links.wikipedia,
                ),
                missionName = missionName,
                rocket = RocketEntity(
                    rocketNameAndType = rocket.rocketNameAndType
                ),
                daysToFromTitle = daysToFromTitle,
                launchDaysDifference = launchDaysDifference,
            )
        }
    }

}







