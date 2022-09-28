package com.seancoyle.database.entities

import androidx.annotation.Keep
import androidx.room.Entity

@Keep
@Entity(tableName = "pokemon")
data class PokemonEntity(
val abilities: List<AbilityEntity>,
val baseExperience: Int,
val forms: List<FormEntity>,
val gameIndices: List<GameIndiceEntity>,
val height: Int,
val heldItems: List<Any>,
val id: Int,
val isDefault: Boolean,
val locationAreaEncounters: String,
val moves: List<MoveEntity>,
val name: String,
val order: Int,
val pastTypes: List<Any>,
val species: SpeciesEntity,
val sprites: SpritesEntity,
val stats: List<StatEntity>,
val types: List<TypeEntity>,
val weight: Int
)

@Keep
data class AbilityEntity(
    val ability: AbilityXEntity,
    val isHidden: Boolean,
    val slot: Int
)

@Keep
data class AbilityXEntity(
    val name: String,
    val url: String
)

@Keep
data class AnimatedEntity(
    val backDefault: String,
    val backFemale: Any,
    val backShiny: String,
    val backShinyFemale: Any,
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any
)

@Keep
data class BlackWhiteEntity(
    val animated: AnimatedEntity,
    val backDefault: String,
    val backFemale: Any,
    val backShiny: String,
    val backShinyFemale: Any,
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any
)

@Keep
data class CrystalEntity(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
)

@Keep
data class DiamondPearlEntity(
    val backDefault: String,
    val backFemale: Any,
    val backShiny: String,
    val backShinyFemale: Any,
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any
)

@Keep
data class DreamWorldEntity(
    val frontDefault: String,
    val frontFemale: Any
)

@Keep
data class EmeraldEntity(
    val frontDefault: String,
    val frontShiny: String
)

@Keep
data class FireRedLeafGreenEntity(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
)

@Keep
data class FormEntity(
    val name: String,
    val url: String
)

@Keep
data class GameIndiceEntity(
    val gameIndex: Int,
    val version: VersionEntity
)

@Keep
data class GenerationIEntity(
    val redBlue: RedBlueEntity,
    val yellow: YellowEntity
)

@Keep
data class GenerationIiEntity(
    val crystal: CrystalEntity,
    val gold: GoldEntity,
    val silver: SilverEntity
)

@Keep
data class GenerationIiiEntity(
    val emerald: EmeraldEntity,
    val fireRedLeafGreen: FireRedLeafGreenEntity,
    val rubySapphire: RubySapphireEntity
)

@Keep
data class GenerationIvEntity(
    val diamondPearl: DiamondPearlEntity,
    val heartGoldSoulSilver: HeartGoldSoulSilverEntity,
    val platinum: PlatinumEntity
)

@Keep
data class GenerationVEntity(
    val blackWhite: BlackWhiteEntity
)

@Keep
data class GenerationViEntity(
    val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphireEntity,
    val xY: XYEntity
)

@Keep
data class GenerationViiEntity(
    val icons: IconsEntity,
    val ultraSunUltraMoon: UltraSunUltraMoonEntity
)

@Keep
data class GenerationViiiEntity(
    val icons: IconsXEntity
)

@Keep
data class GoldEntity(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
)

@Keep
data class HeartGoldSoulSilverEntity(
    val backDefault: String,
    val backFemale: Any,
    val backShiny: String,
    val backShinyFemale: Any,
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any
)

@Keep
data class IconsEntity(
    val frontDefault: String,
    val frontFemale: Any
)

@Keep
data class IconsXEntity(
    val frontDefault: String,
    val frontFemale: Any
)

@Keep
data class MoveEntity(
    val move: MoveXEntity,
    val versionGroupDetails: List<VersionGroupDetailEntity>
)

@Keep
data class MoveLearnMethodEntity(
    val name: String,
    val url: String
)

@Keep
data class MoveXEntity(
    val name: String,
    val url: String
)

@Keep
data class OfficialArtworkEntity(
    val frontDefault: String
)

@Keep
data class OmegaRubyAlphaSapphireEntity(
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any
)

@Keep
data class OtherEntity(
    val dreamWorld: DreamWorldEntity,
    val officialArtwork: OfficialArtworkEntity
)

@Keep
data class PlatinumEntity(
    val backDefault: String,
    val backFemale: Any,
    val backShiny: String,
    val backShinyFemale: Any,
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any
)

@Keep
data class PokemonListEntity(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<ResultEntity>
)

@Keep
data class RedBlueEntity(
    val backDefault: String,
    val backGray: String,
    val frontDefault: String,
    val frontGray: String
)

@Keep
data class ResultEntity(
    val name: String,
    val url: String
)

@Keep
data class RubySapphireEntity(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
)

@Keep
data class SilverEntity(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
)

@Keep
data class SpeciesEntity(
    val name: String,
    val url: String
)

@Keep
data class SpritesEntity(
    val backDefault: String,
    val backFemale: Any,
    val backShiny: String,
    val backShinyFemale: Any,
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any,
    val other: OtherEntity,
    val versions: Versions
)

@Keep
data class StatEntity(
    val baseStat: Int,
    val effort: Int,
    val stat: StatXEntity
)

@Keep
data class StatXEntity(
    val name: String,
    val url: String
)

@Keep
data class TypeEntity(
    val slot: Int,
    val type: TypeXEntity
)

@Keep
data class TypeXEntity(
    val name: String,
    val url: String
)

@Keep
data class UltraSunUltraMoonEntity(
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any
)

@Keep
data class VersionEntity(
    val name: String,
    val url: String
)

@Keep
data class Versions(
    val generationI: GenerationIEntity,
    val generationIi: GenerationIiEntity,
    val generationIii: GenerationIiiEntity,
    val generationIv: GenerationIvEntity,
    val generationV: GenerationVEntity,
    val generationVi: GenerationViEntity,
    val generationVii: GenerationViiEntity,
    val generationViii: GenerationViiiEntity
)

@Keep
data class VersionGroupDetailEntity(
    val levelLearnedAt: Int,
    val moveLearnMethod: MoveLearnMethodEntity,
    val versionGroup: VersionGroupEntity
)

@Keep
data class VersionGroupEntity(
    val name: String,
    val url: String
)

@Keep
data class XYEntity(
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any
)

@Keep
data class YellowEntity(
    val backDefault: String,
    val backGray: String,
    val frontDefault: String,
    val frontGray: String
)