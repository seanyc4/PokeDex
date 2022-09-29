package com.seancoyle.launch_datasource.cache.pokeinfo

import com.seancoyle.database.entities.*
import com.seancoyle.launch_models.model.*

class PokemonInfoEntityMapper {

    fun entityListToDomainList(entities: List<PokemonInfoEntity>): List<PokemonInfo> {
        val list: ArrayList<PokemonInfo> = ArrayList()
        for (entity in entities) {
            list.add(mapToDomain(entity))
        }
        return list
    }

    fun domainListToEntityList(domainList: List<PokemonInfo>): List<PokemonInfoEntity> {
        val entities: ArrayList<PokemonInfoEntity> = ArrayList()
        for (item in domainList) {
            entities.add(mapFromDomain(item))
        }
        return entities
    }

    fun mapToDomain(entity: PokemonInfoEntity): PokemonInfo {
        entity.apply {
            return PokemonInfo(
                abilities = abilities.map { ability ->
                    Ability(
                        ability = AbilityX(
                            name = ability.ability.name,
                            url = ability.ability.url
                        ),
                        isHidden = ability.isHidden,
                        slot = ability.slot
                    )
                },
                baseExperience = baseExperience,
                forms = forms.map { form ->
                    Form(
                        name = form.name,
                        url = form.url
                    )
                },
                height = height,
                id = id,
                isDefault = isDefault,
                locationAreaEncounters = locationAreaEncounters,
                moves = moves.map { move ->
                    Move(
                        move = MoveX(
                            name = move.move.name,
                            url = move.move.url
                        ),
                        versionGroupDetails = move.versionGroupDetails.map { version ->
                            VersionGroupDetail(
                                levelLearnedAt = version.levelLearnedAt,
                                moveLearnMethod = MoveLearnMethod(
                                    name = version.moveLearnMethod.name,
                                    url = version.moveLearnMethod.url
                                ),
                                versionGroup = VersionGroup(
                                    name = version.versionGroup.name,
                                    url = version.versionGroup.url
                                )
                            )
                        }
                    )
                },
                name = name,
                order = order,
                species = Species(
                    name = species.name,
                    url = species.url
                ),
                sprites = Sprites(
                    backDefault = sprites.backDefault,
                    backShiny = sprites.backShiny,
                    frontDefault = sprites.frontDefault,
                    frontShiny = sprites.frontShiny,
                    other = Other(
                        dreamWorld = DreamWorld(
                            frontDefault = sprites.other.dreamWorld.frontDefault
                        ),
                        officialArtwork = OfficialArtwork(
                            frontDefault = sprites.other.officialArtwork.frontDefault
                        )
                    ),
                    versions = Versions(
                        generationI = GenerationI(
                            redBlue = RedBlue(
                                backDefault = sprites.versions.generationI.redBlue.backDefault,
                                backGray = sprites.versions.generationI.redBlue.backGray,
                                frontDefault = sprites.versions.generationI.redBlue.frontDefault,
                                frontGray = sprites.versions.generationI.redBlue.frontGray
                            ),
                            yellow = Yellow(
                                backDefault = sprites.versions.generationI.yellow.backDefault,
                                backGray = sprites.versions.generationI.yellow.backGray,
                                frontDefault = sprites.versions.generationI.yellow.frontDefault,
                                frontGray = sprites.versions.generationI.yellow.frontGray
                            )
                        ),
                        generationIi = GenerationIi(
                            crystal = Crystal(
                                backDefault = sprites.versions.generationIi.crystal.backDefault,
                                backShiny = sprites.versions.generationIi.crystal.backShiny,
                                frontDefault = sprites.versions.generationIi.crystal.frontDefault,
                                frontShiny = sprites.versions.generationIi.crystal.frontShiny
                            ),
                            gold = Gold(
                                backDefault = sprites.versions.generationIi.gold.backDefault,
                                backShiny = sprites.versions.generationIi.gold.backShiny,
                                frontDefault = sprites.versions.generationIi.gold.frontDefault,
                                frontShiny = sprites.versions.generationIi.gold.frontShiny
                            ),
                            silver = Silver(
                                backDefault = sprites.versions.generationIi.silver.backDefault,
                                backShiny = sprites.versions.generationIi.silver.backShiny,
                                frontDefault = sprites.versions.generationIi.silver.frontDefault,
                                frontShiny = sprites.versions.generationIi.silver.frontShiny
                            )
                        ),
                        generationIii = GenerationIii(
                            emerald = Emerald(
                                frontDefault = sprites.versions.generationIii.emerald.frontDefault,
                                frontShiny = sprites.versions.generationIii.emerald.frontShiny
                            ),
                            fireRedLeafGreen = FireRedLeafGreen(
                                backDefault = sprites.versions.generationIii.fireRedLeafGreen.backDefault,
                                backShiny = sprites.versions.generationIii.fireRedLeafGreen.backShiny,
                                frontDefault = sprites.versions.generationIii.fireRedLeafGreen.frontDefault,
                                frontShiny = sprites.versions.generationIii.fireRedLeafGreen.frontShiny
                            ),
                            rubySapphire = RubySapphire(
                                backDefault = sprites.versions.generationIii.rubySapphire.backDefault,
                                backShiny = sprites.versions.generationIii.rubySapphire.backShiny,
                                frontDefault = sprites.versions.generationIii.rubySapphire.frontDefault,
                                frontShiny = sprites.versions.generationIii.rubySapphire.frontShiny
                            )
                        ),
                        generationIv = GenerationIv(
                            diamondPearl = DiamondPearl(
                                backDefault = sprites.versions.generationIv.diamondPearl.backDefault,
                                backShiny = sprites.versions.generationIv.diamondPearl.backShiny,
                                frontDefault = sprites.versions.generationIv.diamondPearl.frontDefault,
                                frontShiny = sprites.versions.generationIv.diamondPearl.frontShiny
                            ),
                            heartGoldSoulSilver = HeartGoldSoulSilver(
                                backDefault = sprites.versions.generationIv.heartGoldSoulSilver.backDefault,
                                backShiny = sprites.versions.generationIv.heartGoldSoulSilver.backShiny,
                                frontDefault = sprites.versions.generationIv.heartGoldSoulSilver.frontDefault,
                                frontShiny = sprites.versions.generationIv.heartGoldSoulSilver.frontShiny
                            ),
                            platinum = Platinum(
                                backDefault = sprites.versions.generationIv.platinum.backDefault,
                                backShiny = sprites.versions.generationIv.platinum.backShiny,
                                frontDefault = sprites.versions.generationIv.platinum.frontDefault,
                                frontShiny = sprites.versions.generationIv.platinum.frontShiny
                            )
                        ),
                        generationV = GenerationV(
                            blackWhite = BlackWhite(
                                animated = Animated(
                                    backDefault = sprites.versions.generationV.blackWhite.animated.backDefault,
                                    backShiny = sprites.versions.generationV.blackWhite.animated.backShiny,
                                    frontDefault = sprites.versions.generationV.blackWhite.animated.frontDefault,
                                    frontShiny = sprites.versions.generationV.blackWhite.animated.frontShiny
                                ),
                                backDefault = sprites.versions.generationV.blackWhite.backDefault,
                                backShiny = sprites.versions.generationV.blackWhite.backShiny,
                                frontDefault = sprites.versions.generationV.blackWhite.frontDefault,
                                frontShiny = sprites.versions.generationV.blackWhite.frontShiny
                            )
                        ),
                        generationVi = GenerationVi(
                            omegaRubyAlphaSapphire = OmegaRubyAlphaSapphire(
                                frontDefault = sprites.versions.generationVi.omegaRubyAlphaSapphire.frontDefault,
                                frontShiny = sprites.versions.generationVi.omegaRubyAlphaSapphire.frontShiny
                            ),
                            xY = XY(
                                frontDefault = sprites.versions.generationVi.xY.frontDefault,
                                frontShiny = sprites.versions.generationVi.xY.frontShiny
                            )
                        ),
                        generationVii = GenerationVii(
                            icons = Icons(
                                frontDefault = sprites.versions.generationVii.icons.frontDefault
                            ),
                            ultraSunUltraMoon = UltraSunUltraMoon(
                                frontDefault = sprites.versions.generationVii.ultraSunUltraMoon.frontDefault,
                                frontShiny = sprites.versions.generationVii.ultraSunUltraMoon.frontShiny,
                            )
                        ),
                        generationViii = GenerationViii(
                            icons = IconsX(
                                frontDefault = sprites.versions.generationViii.icons.frontDefault
                            )
                        )
                    )
                ),
                stats = stats.map { stat ->
                    Stat(
                        baseStat = stat.baseStat,
                        effort = stat.effort,
                        stat = StatX(
                            name = stat.stat.name,
                            url = stat.stat.url
                        )
                    )
                },
                types = types.map { type ->
                    Type(
                        slot = type.slot,
                        type = TypeX(
                            name = type.type.name,
                            url = type.type.url
                        )
                    )
                },
                weight = weight
            )
        }
    }

    fun mapFromDomain(entity: PokemonInfo): PokemonInfoEntity {
        entity.apply {
            return PokemonInfoEntity(
                abilities = abilities.map { ability ->
                    AbilityEntity(
                        ability = AbilityXEntity(
                            name = ability.ability.name,
                            url = ability.ability.url
                        ),
                        isHidden = ability.isHidden,
                        slot = ability.slot
                    )
                },
                baseExperience = baseExperience,
                forms = forms.map { form ->
                    FormEntity(
                        name = form.name,
                        url = form.url
                    )
                },
                height = height,
                id = id,
                isDefault = isDefault,
                locationAreaEncounters = locationAreaEncounters,
                moves = moves.map { move ->
                    MoveEntity(
                        move = MoveXEntity(
                            name = move.move.name,
                            url = move.move.url
                        ),
                        versionGroupDetails = move.versionGroupDetails.map { version ->
                            VersionGroupDetailEntity(
                                levelLearnedAt = version.levelLearnedAt,
                                moveLearnMethod = MoveLearnMethodEntity(
                                    name = version.moveLearnMethod.name,
                                    url = version.moveLearnMethod.url
                                ),
                                versionGroup = VersionGroupEntity(
                                    name = version.versionGroup.name,
                                    url = version.versionGroup.url
                                )
                            )
                        }
                    )
                },
                name = name,
                order = order,
                species = SpeciesEntity(
                    name = species.name,
                    url = species.url
                ),
                sprites = SpritesEntity(
                    backDefault = sprites.backDefault,
                    backShiny = sprites.backShiny,
                    frontDefault = sprites.frontDefault,
                    frontShiny = sprites.frontShiny,
                    other = OtherEntity(
                        dreamWorld = DreamWorldEntity(
                            frontDefault = sprites.other.dreamWorld.frontDefault
                        ),
                        officialArtwork = OfficialArtworkEntity(
                            frontDefault = sprites.other.officialArtwork.frontDefault
                        )
                    ),
                    versions = VersionsEntity(
                        generationI = GenerationIEntity(
                            redBlue = RedBlueEntity(
                                backDefault = sprites.versions.generationI.redBlue.backDefault,
                                backGray = sprites.versions.generationI.redBlue.backGray,
                                frontDefault = sprites.versions.generationI.redBlue.frontDefault,
                                frontGray = sprites.versions.generationI.redBlue.frontGray
                            ),
                            yellow = YellowEntity(
                                backDefault = sprites.versions.generationI.yellow.backDefault,
                                backGray = sprites.versions.generationI.yellow.backGray,
                                frontDefault = sprites.versions.generationI.yellow.frontDefault,
                                frontGray = sprites.versions.generationI.yellow.frontGray
                            )
                        ),
                        generationIi = GenerationIiEntity(
                            crystal = CrystalEntity(
                                backDefault = sprites.versions.generationIi.crystal.backDefault,
                                backShiny = sprites.versions.generationIi.crystal.backShiny,
                                frontDefault = sprites.versions.generationIi.crystal.frontDefault,
                                frontShiny = sprites.versions.generationIi.crystal.frontShiny
                            ),
                            gold = GoldEntity(
                                backDefault = sprites.versions.generationIi.gold.backDefault,
                                backShiny = sprites.versions.generationIi.gold.backShiny,
                                frontDefault = sprites.versions.generationIi.gold.frontDefault,
                                frontShiny = sprites.versions.generationIi.gold.frontShiny
                            ),
                            silver = SilverEntity(
                                backDefault = sprites.versions.generationIi.silver.backDefault,
                                backShiny = sprites.versions.generationIi.silver.backShiny,
                                frontDefault = sprites.versions.generationIi.silver.frontDefault,
                                frontShiny = sprites.versions.generationIi.silver.frontShiny
                            )
                        ),
                        generationIii = GenerationIiiEntity(
                            emerald = EmeraldEntity(
                                frontDefault = sprites.versions.generationIii.emerald.frontDefault,
                                frontShiny = sprites.versions.generationIii.emerald.frontShiny
                            ),
                            fireRedLeafGreen = FireRedLeafGreenEntity(
                                backDefault = sprites.versions.generationIii.fireRedLeafGreen.backDefault,
                                backShiny = sprites.versions.generationIii.fireRedLeafGreen.backShiny,
                                frontDefault = sprites.versions.generationIii.fireRedLeafGreen.frontDefault,
                                frontShiny = sprites.versions.generationIii.fireRedLeafGreen.frontShiny
                            ),
                            rubySapphire = RubySapphireEntity(
                                backDefault = sprites.versions.generationIii.rubySapphire.backDefault,
                                backShiny = sprites.versions.generationIii.rubySapphire.backShiny,
                                frontDefault = sprites.versions.generationIii.rubySapphire.frontDefault,
                                frontShiny = sprites.versions.generationIii.rubySapphire.frontShiny
                            )
                        ),
                        generationIv = GenerationIvEntity(
                            diamondPearl = DiamondPearlEntity(
                                backDefault = sprites.versions.generationIv.diamondPearl.backDefault,
                                backShiny = sprites.versions.generationIv.diamondPearl.backShiny,
                                frontDefault = sprites.versions.generationIv.diamondPearl.frontDefault,
                                frontShiny = sprites.versions.generationIv.diamondPearl.frontShiny
                            ),
                            heartGoldSoulSilver = HeartGoldSoulSilverEntity(
                                backDefault = sprites.versions.generationIv.heartGoldSoulSilver.backDefault,
                                backShiny = sprites.versions.generationIv.heartGoldSoulSilver.backShiny,
                                frontDefault = sprites.versions.generationIv.heartGoldSoulSilver.frontDefault,
                                frontShiny = sprites.versions.generationIv.heartGoldSoulSilver.frontShiny
                            ),
                            platinum = PlatinumEntity(
                                backDefault = sprites.versions.generationIv.platinum.backDefault,
                                backShiny = sprites.versions.generationIv.platinum.backShiny,
                                frontDefault = sprites.versions.generationIv.platinum.frontDefault,
                                frontShiny = sprites.versions.generationIv.platinum.frontShiny
                            )
                        ),
                        generationV = GenerationVEntity(
                            blackWhite = BlackWhiteEntity(
                                animated = AnimatedEntity(
                                    backDefault = sprites.versions.generationV.blackWhite.animated.backDefault,
                                    backShiny = sprites.versions.generationV.blackWhite.animated.backShiny,
                                    frontDefault = sprites.versions.generationV.blackWhite.animated.frontDefault,
                                    frontShiny = sprites.versions.generationV.blackWhite.animated.frontShiny
                                ),
                                backDefault = sprites.versions.generationV.blackWhite.backDefault,
                                backShiny = sprites.versions.generationV.blackWhite.backShiny,
                                frontDefault = sprites.versions.generationV.blackWhite.frontDefault,
                                frontShiny = sprites.versions.generationV.blackWhite.frontShiny
                            )
                        ),
                        generationVi = GenerationViEntity(
                            omegaRubyAlphaSapphire = OmegaRubyAlphaSapphireEntity(
                                frontDefault = sprites.versions.generationVi.omegaRubyAlphaSapphire.frontDefault,
                                frontShiny = sprites.versions.generationVi.omegaRubyAlphaSapphire.frontShiny
                            ),
                            xY = XYEntity(
                                frontDefault = sprites.versions.generationVi.xY.frontDefault,
                                frontShiny = sprites.versions.generationVi.xY.frontShiny
                            )
                        ),
                        generationVii = GenerationViiEntity(
                            icons = IconsEntity(
                                frontDefault = sprites.versions.generationVii.icons.frontDefault
                            ),
                            ultraSunUltraMoon = UltraSunUltraMoonEntity(
                                frontDefault = sprites.versions.generationVii.ultraSunUltraMoon.frontDefault,
                                frontShiny = sprites.versions.generationVii.ultraSunUltraMoon.frontShiny,
                            )
                        ),
                        generationViii = GenerationViiiEntity(
                            icons = IconsXEntity(
                                frontDefault = sprites.versions.generationViii.icons.frontDefault
                            )
                        )
                    )
                ),
                stats = stats.map { stat ->
                    StatEntity(
                        baseStat = stat.baseStat,
                        effort = stat.effort,
                        stat = StatXEntity(
                            name = stat.stat.name,
                            url = stat.stat.url
                        )
                    )
                },
                types = types.map { type ->
                    TypeEntity(
                        slot = type.slot,
                        type = TypeXEntity(
                            name = type.type.name,
                            url = type.type.url
                        )
                    )
                },
                weight = weight
            )
        }
    }

}







