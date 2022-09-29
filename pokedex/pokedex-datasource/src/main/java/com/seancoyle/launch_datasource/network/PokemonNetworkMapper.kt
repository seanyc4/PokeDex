package com.seancoyle.launch_datasource.network

import com.seancoyle.launch_models.model.*

class PokemonNetworkMapper {

    fun mapToDomain(dto: PokemonInfoDto): PokemonInfo {
        dto.apply {
            return PokemonInfo(
                abilities = abilities.map { ability ->
                    Ability(
                        ability = AbilityX(
                            name = ability.ability?.name.orEmpty(),
                            url = ability.ability?.url.orEmpty()
                        ),
                        isHidden = ability.isHidden,
                        slot = ability.slot ?: 0
                    )
                },
                baseExperience = baseExperience ?: 0,
                forms = forms?.map { form ->
                    Form(
                        name = form?.name.orEmpty(),
                        url = form?.url.orEmpty()
                    )
                } ?: emptyList(),
                height = height ?: 0,
                id = id ?: 0,
                isDefault = isDefault,
                locationAreaEncounters = locationAreaEncounters.orEmpty(),
                moves = moves?.map { move ->
                    Move(
                        move = MoveX(
                            name = move?.move?.name.orEmpty(),
                            url = move?.move?.url.orEmpty()
                        ),
                        versionGroupDetails = move?.versionGroupDetails?.map { version ->
                            VersionGroupDetail(
                                levelLearnedAt = version?.levelLearnedAt ?: 0,
                                moveLearnMethod = MoveLearnMethod(
                                    name = version?.moveLearnMethod?.name.orEmpty(),
                                    url = version?.moveLearnMethod?.url.orEmpty()
                                ),
                                versionGroup = VersionGroup(
                                    name = version?.versionGroup?.name.orEmpty(),
                                    url = version?.versionGroup?.url.orEmpty()
                                )
                            )
                        } ?: emptyList()
                    )
                } ?: emptyList(),
                name = name.orEmpty(),
                order = order ?: 0,
                species = Species(
                    name = species?.name.orEmpty(),
                    url = species?.url.orEmpty()
                ),
                sprites = Sprites(
                    backDefault = sprites?.backDefault.orEmpty(),
                    backShiny = sprites?.backShiny.orEmpty(),
                    frontDefault = sprites?.frontDefault.orEmpty(),
                    frontShiny = sprites?.frontShiny.orEmpty(),
                    other = Other(
                        dreamWorld = DreamWorld(
                            frontDefault = sprites?.other?.dreamWorld?.frontDefault.orEmpty()
                        ),
                        officialArtwork = OfficialArtwork(
                            frontDefault = sprites?.other?.officialArtwork?.frontDefault.orEmpty()
                        )
                    ),
                    versions = Versions(
                        generationI = GenerationI(
                            redBlue = RedBlue(
                                backDefault = sprites?.versions?.generationI?.redBlue?.backDefault.orEmpty(),
                                backGray = sprites?.versions?.generationI?.redBlue?.backGray.orEmpty(),
                                frontDefault = sprites?.versions?.generationI?.redBlue?.frontDefault.orEmpty(),
                                frontGray = sprites?.versions?.generationI?.redBlue?.frontGray.orEmpty()
                            ),
                            yellow = Yellow(
                                backDefault = sprites?.versions?.generationI?.yellow?.backDefault.orEmpty(),
                                backGray = sprites?.versions?.generationI?.yellow?.backGray.orEmpty(),
                                frontDefault = sprites?.versions?.generationI?.yellow?.frontDefault.orEmpty(),
                                frontGray = sprites?.versions?.generationI?.yellow?.frontGray.orEmpty()
                            )
                        ),
                        generationIi = GenerationIi(
                            crystal = Crystal(
                                backDefault = sprites?.versions?.generationIi?.crystal?.backDefault.orEmpty(),
                                backShiny = sprites?.versions?.generationIi?.crystal?.backShiny.orEmpty(),
                                frontDefault = sprites?.versions?.generationIi?.crystal?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationIi?.crystal?.frontShiny.orEmpty()
                            ),
                            gold = Gold(
                                backDefault = sprites?.versions?.generationIi?.gold?.backDefault.orEmpty(),
                                backShiny = sprites?.versions?.generationIi?.gold?.backShiny.orEmpty(),
                                frontDefault = sprites?.versions?.generationIi?.gold?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationIi?.gold?.frontShiny.orEmpty()
                            ),
                            silver = Silver(
                                backDefault = sprites?.versions?.generationIi?.silver?.backDefault.orEmpty(),
                                backShiny = sprites?.versions?.generationIi?.silver?.backShiny.orEmpty(),
                                frontDefault = sprites?.versions?.generationIi?.silver?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationIi?.silver?.frontShiny.orEmpty()
                            )
                        ),
                        generationIii = GenerationIii(
                            emerald = Emerald(
                                frontDefault = sprites?.versions?.generationIii?.emerald?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationIii?.emerald?.frontShiny.orEmpty()
                            ),
                            fireRedLeafGreen = FireRedLeafGreen(
                                backDefault = sprites?.versions?.generationIii?.fireRedLeafGreen?.backDefault.orEmpty(),
                                backShiny = sprites?.versions?.generationIii?.fireRedLeafGreen?.backShiny.orEmpty(),
                                frontDefault = sprites?.versions?.generationIii?.fireRedLeafGreen?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationIii?.fireRedLeafGreen?.frontShiny.orEmpty()
                            ),
                            rubySapphire = RubySapphire(
                                backDefault = sprites?.versions?.generationIii?.rubySapphire?.backDefault.orEmpty(),
                                backShiny = sprites?.versions?.generationIii?.rubySapphire?.backShiny.orEmpty(),
                                frontDefault = sprites?.versions?.generationIii?.rubySapphire?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationIii?.rubySapphire?.frontShiny.orEmpty()
                            )
                        ),
                        generationIv = GenerationIv(
                            diamondPearl = DiamondPearl(
                                backDefault = sprites?.versions?.generationIv?.diamondPearl?.backDefault.orEmpty(),
                                backShiny = sprites?.versions?.generationIv?.diamondPearl?.backShiny.orEmpty(),
                                frontDefault = sprites?.versions?.generationIv?.diamondPearl?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationIv?.diamondPearl?.frontShiny.orEmpty()
                            ),
                            heartGoldSoulSilver = HeartGoldSoulSilver(
                                backDefault = sprites?.versions?.generationIv?.heartGoldSoulSilver?.backDefault.orEmpty(),
                                backShiny = sprites?.versions?.generationIv?.heartGoldSoulSilver?.backShiny.orEmpty(),
                                frontDefault = sprites?.versions?.generationIv?.heartGoldSoulSilver?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationIv?.heartGoldSoulSilver?.frontShiny.orEmpty()
                            ),
                            platinum = Platinum(
                                backDefault = sprites?.versions?.generationIv?.platinum?.backDefault.orEmpty(),
                                backShiny = sprites?.versions?.generationIv?.platinum?.backShiny.orEmpty(),
                                frontDefault = sprites?.versions?.generationIv?.platinum?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationIv?.platinum?.frontShiny.orEmpty()
                            )
                        ),
                        generationV = GenerationV(
                            blackWhite = BlackWhite(
                                animated = Animated(
                                    backDefault = sprites?.versions?.generationV?.blackWhite?.animated?.backDefault.orEmpty(),
                                    backShiny = sprites?.versions?.generationV?.blackWhite?.animated?.backShiny.orEmpty(),
                                    frontDefault = sprites?.versions?.generationV?.blackWhite?.animated?.frontDefault.orEmpty(),
                                    frontShiny = sprites?.versions?.generationV?.blackWhite?.animated?.frontShiny.orEmpty()
                                ),
                                backDefault = sprites?.versions?.generationV?.blackWhite?.backDefault.orEmpty(),
                                backShiny = sprites?.versions?.generationV?.blackWhite?.backShiny.orEmpty(),
                                frontDefault = sprites?.versions?.generationV?.blackWhite?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationV?.blackWhite?.frontShiny.orEmpty()
                            )
                        ),
                        generationVi = GenerationVi(
                            omegaRubyAlphaSapphire = OmegaRubyAlphaSapphire(
                                frontDefault = sprites?.versions?.generationVi?.omegaRubyAlphaSapphire?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationVi?.omegaRubyAlphaSapphire?.frontShiny.orEmpty()
                            ),
                            xY = XY(
                                frontDefault = sprites?.versions?.generationVi?.xY?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationVi?.xY?.frontShiny.orEmpty()
                            )
                        ),
                        generationVii = GenerationVii(
                            icons = Icons(
                                frontDefault = sprites?.versions?.generationVii?.icons?.frontDefault.orEmpty()
                            ),
                            ultraSunUltraMoon = UltraSunUltraMoon(
                                frontDefault = sprites?.versions?.generationVii?.ultraSunUltraMoon?.frontDefault.orEmpty(),
                                frontShiny = sprites?.versions?.generationVii?.ultraSunUltraMoon?.frontShiny.orEmpty(),
                            )
                        ),
                        generationViii = GenerationViii(
                            icons = IconsX(
                                frontDefault = sprites?.versions?.generationViii?.icons?.frontDefault.orEmpty()
                            )
                        )
                    )
                ),
                stats = stats?.map { stat ->
                    Stat(
                        baseStat = stat?.baseStat ?: 0,
                        effort = stat?.effort ?: 0,
                        stat = StatX(
                            name = stat?.stat?.name.orEmpty(),
                            url = stat?.stat?.url.orEmpty()
                        )
                    )
                } ?: emptyList(),
                types = types?.map { type ->
                    Type(
                        slot = type?.slot ?: 0,
                        type = TypeX(
                            name = type?.type?.name.orEmpty(),
                            url = type?.type?.url.orEmpty()
                        )
                    )
                } ?: emptyList(),
                weight = weight ?: 0
            )
        }
    }

    fun mapListToDomain(listDto: PokemonListDto): PokemonList {
        listDto.apply {
            return PokemonList(
                count = count ?: 0,
                next = next.orEmpty(),
                previous = previous.orEmpty(),
                results = results?.map { result ->
                    Pokemon(
                        name = result?.name.orEmpty(),
                        url = result?.url.orEmpty(),
                        image = getImageUrl(result?.url)
                    )
                } ?: emptyList()
            )
        }
    }

    private fun getImageUrl(url:String?): String {
        val index = url?.split("/".toRegex())?.dropLast(1)?.last()
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$index.png"
    }

}







