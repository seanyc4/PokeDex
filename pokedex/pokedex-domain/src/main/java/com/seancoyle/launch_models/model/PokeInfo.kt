package com.seancoyle.poke_domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokeInfo(
    val abilities: List<Ability>,
    val baseExperience: Int,
    val forms: List<Form>,
    val height: Int,
    val id: Int,
    val isDefault: Boolean,
    val locationAreaEncounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Int,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Int
) : Parcelable

@Parcelize
data class Ability(
    val ability: AbilityX,
    val isHidden: Boolean,
    val slot: Int
) : Parcelable

@Parcelize
data class AbilityX(
    val name: String,
    val url: String
) : Parcelable

@Parcelize
data class Animated(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class BlackWhite(
    val animated: Animated,
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class Crystal(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class DiamondPearl(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class DreamWorld(
    val frontDefault: String
) : Parcelable

@Parcelize
data class Emerald(
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class FireRedLeafGreen(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class Form(
    val name: String,
    val url: String
) : Parcelable

@Parcelize
data class GenerationI(
    val redBlue: RedBlue,
    val yellow: Yellow
) : Parcelable

@Parcelize
data class GenerationIi(
    val crystal: Crystal,
    val gold: Gold,
    val silver: Silver
) : Parcelable

@Parcelize
data class GenerationIii(
    val emerald: Emerald,
    val fireRedLeafGreen: FireRedLeafGreen,
    val rubySapphire: RubySapphire
) : Parcelable

@Parcelize
data class GenerationIv(
    val diamondPearl: DiamondPearl,
    val heartGoldSoulSilver: HeartGoldSoulSilver,
    val platinum: Platinum
) : Parcelable

@Parcelize
data class GenerationV(
    val blackWhite: BlackWhite
) : Parcelable

@Parcelize
data class GenerationVi(
    val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphire,
    val xY: XY
) : Parcelable

@Parcelize
data class GenerationVii(
    val icons: Icons,
    val ultraSunUltraMoon: UltraSunUltraMoon
) : Parcelable

@Parcelize
data class GenerationViii(
    val icons: IconsX
) : Parcelable

@Parcelize
data class Gold(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class HeartGoldSoulSilver(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String,
) : Parcelable

@Parcelize
data class Icons(
    val frontDefault: String
) : Parcelable

@Parcelize
data class IconsX(
    val frontDefault: String
) : Parcelable

@Parcelize
data class Move(
    val move: MoveX,
    val versionGroupDetails: List<VersionGroupDetail>
) : Parcelable

@Parcelize
data class MoveLearnMethod(
    val name: String,
    val url: String
) : Parcelable

@Parcelize
data class MoveX(
    val name: String,
    val url: String
) : Parcelable

@Parcelize
data class OfficialArtwork(
    val frontDefault: String
) : Parcelable

@Parcelize
data class OmegaRubyAlphaSapphire(
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class Other(
    val dreamWorld: DreamWorld,
    val officialArtwork: OfficialArtwork
) : Parcelable

@Parcelize
data class Platinum(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class RedBlue(
    val backDefault: String,
    val backGray: String,
    val frontDefault: String,
    val frontGray: String
) : Parcelable

@Parcelize
data class Result(
    val name: String,
    val url: String,
    val image: String
) : Parcelable

@Parcelize
data class RubySapphire(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class Silver(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class Species(
    val name: String,
    val url: String
) : Parcelable

@Parcelize
data class Sprites(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String,
    val other: Other,
    val versions: Versions
) : Parcelable

@Parcelize
data class Stat(
    val baseStat: Int,
    val effort: Int,
    val stat: StatX
) : Parcelable

@Parcelize
data class StatX(
    val name: String,
    val url: String
) : Parcelable

@Parcelize
data class Type(
    val slot: Int,
    val type: TypeX
) : Parcelable

@Parcelize
data class TypeX(
    val name: String,
    val url: String
) : Parcelable

@Parcelize
data class UltraSunUltraMoon(
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class Versions(
    val generationI: GenerationI,
    val generationIi: GenerationIi,
    val generationIii: GenerationIii,
    val generationIv: GenerationIv,
    val generationV: GenerationV,
    val generationVi: GenerationVi,
    val generationVii: GenerationVii,
    val generationViii: GenerationViii
) : Parcelable

@Parcelize
data class VersionGroupDetail(
    val levelLearnedAt: Int,
    val moveLearnMethod: MoveLearnMethod,
    val versionGroup: VersionGroup
) : Parcelable

@Parcelize
data class VersionGroup(
    val name: String,
    val url: String
) : Parcelable

@Parcelize
data class XY(
    val frontDefault: String,
    val frontShiny: String
) : Parcelable

@Parcelize
data class Yellow(
    val backDefault: String,
    val backGray: String,
    val frontDefault: String,
    val frontGray: String
) : Parcelable