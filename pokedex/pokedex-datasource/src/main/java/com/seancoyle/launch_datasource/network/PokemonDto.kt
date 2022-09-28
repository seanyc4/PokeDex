package com.seancoyle.launch_datasource.network

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class PokemonDto(
    val abilities: List<AbilityDto>,
    @SerializedName("base_experience")
    val baseExperience: Int?,
    val forms: List<FormDto?>?,
    @SerializedName("game_indices")
    val gameIndices: List<GameIndiceDto?>?,
    val height: Int?,
    @SerializedName("held_items")
    val heldItems: List<Any>,
    val id: Int?,
    @SerializedName("is_default")
    val isDefault: Boolean,
    @SerializedName("location_area_encounters")
    val locationAreaEncounters: String?,
    val moves: List<MoveDto?>?,
    val name: String?,
    val order: Int?,
    @SerializedName("past_types")
    val pastTypes: List<Any>,
    val species: SpeciesDto?,
    val sprites: SpritesDto?,
    val stats: List<StatDto?>?,
    val types: List<TypeDto?>?,
    val weight: Int?
)

@Keep
data class AbilityDto(
    val ability: AbilityXDto?,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    val slot: Int?
)

@Keep
data class AbilityXDto(
    val name: String?,
    val url: String?
)

@Keep
data class AnimatedDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

@Keep
data class BlackWhiteDto(
    val animated: AnimatedDto?,
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

@Keep
data class CrystalDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_shiny")
    val frontShiny: String?
)

@Keep
data class DiamondPearlDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

@Keep
data class DreamWorldDto(
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any
)

@Keep
data class EmeraldDto(
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_shiny")
    val frontShiny: String?
)

@Keep
data class FireRedLeafGreenDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_shiny")
    val frontShiny: String?
)

@Keep
data class FormDto(
    val name: String?,
    val url: String?
)

@Keep
data class GameIndiceDto(
    @SerializedName("game_index")
    val gameIndex: Int?,
    val version: VersionDto?
)

@Keep
data class GenerationIDto(
    @SerializedName("red-blue")
    val redBlue: RedBlueDto?,
    val yellow: YellowDto?
)

@Keep
data class GenerationIiDto(
    val crystal: CrystalDto?,
    val gold: GoldDto?,
    val silver: SilverDto?
)

@Keep
data class GenerationIiiDto(
    val emerald: EmeraldDto?,
    @SerializedName("firered-leafgreen")
    val fireRedLeafGreen: FireRedLeafGreenDto?,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphireDto?
)

@Keep
data class GenerationIvDto(
    @SerializedName("diamond-pearl")
    val diamondPearl: DiamondPearlDto?,
    @SerializedName("heartgold-soulsilver")
    val heartGoldSoulSilver: HeartGoldSoulSilverDto?,
    val platinum: PlatinumDto?
)

@Keep
data class GenerationVDto(
    @SerializedName("black-white")
    val blackWhite: BlackWhiteDto?
)

@Keep
data class GenerationViDto(
    @SerializedName("omegaruby-alphasapphire")
    val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphireDto?,
    @SerializedName("x-y")
    val xY: XYDto?
)

@Keep
data class GenerationViiDto(
    val icons: IconsDto?,
    @SerializedName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: UltraSunUltraMoonDto?
)

@Keep
data class GenerationViiiDto(
    val icons: IconsXDto?
)

@Keep
data class GoldDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_shiny")
    val frontShiny: String?
)

@Keep
data class HeartGoldSoulSilverDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

@Keep
data class IconsDto(
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any
)

@Keep
data class IconsXDto(
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any
)

@Keep
data class MoveDto(
    val move: MoveXDto?,
    @SerializedName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetailDto?>?
)

@Keep
data class MoveLearnMethodDto(
    val name: String?,
    val url: String?
)

@Keep
data class MoveXDto(
    val name: String?,
    val url: String?
)

@Keep
data class OfficialArtworkDto(
    @SerializedName("front_default")
    val frontDefault: String?
)

@Keep
data class OmegaRubyAlphaSapphireDto(
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

@Keep
data class OtherDto(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorldDto?,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtworkDto?
)

@Keep
data class PlatinumDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

@Keep
data class PokemonListDto(
    val count: Int?,
    val next: String?,
    val previous: Any,
    val results: List<ResultDto?>?
)

@Keep
data class RedBlueDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_gray")
    val backGray: String?,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_gray")
    val frontGray: String?
)

@Keep
data class ResultDto(
    val name: String?,
    val url: String?
)

@Keep
data class RubySapphireDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_shiny")
    val frontShiny: String?
)

@Keep
data class SilverDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_shiny")
    val frontShiny: String?
)

@Keep
data class SpeciesDto(
    val name: String?,
    val url: String?
)

@Keep
data class SpritesDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String?,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
    val other: OtherDto?,
    val versions: VersionsDto?
)

@Keep
data class StatDto(
    @SerializedName("base_stat")
    val baseStat: Int?,
    val effort: Int?,
    val stat: StatXDto?
)

@Keep
data class StatXDto(
    val name: String?,
    val url: String?
)

@Keep
data class TypeDto(
    val slot: Int?,
    val type: TypeXDto?
)

@Keep
data class TypeXDto(
    val name: String?,
    val url: String?
)

@Keep
data class UltraSunUltraMoonDto(
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

@Keep
data class VersionDto(
    val name: String?,
    val url: String?
)

@Keep
data class VersionsDto(
    @SerializedName("generation-i")
    val generationI: GenerationIDto?,
    @SerializedName("generation-ii")
    val generationIi: GenerationIiDto?,
    @SerializedName("generation-iii")
    val generationIii: GenerationIiiDto?,
    @SerializedName("generation-iv")
    val generationIv: GenerationIvDto?,
    @SerializedName("generation-v")
    val generationV: GenerationVDto?,
    @SerializedName("generation-vi")
    val generationVi: GenerationViDto?,
    @SerializedName("generation-vii")
    val generationVii: GenerationViiDto?,
    @SerializedName("generation-viii")
    val generationViii: GenerationViiiDto?
)

@Keep
data class VersionGroupDetailDto(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int?,
    @SerializedName("move_learn_method")
    val moveLearnMethod: MoveLearnMethodDto?,
    @SerializedName("version_group")
    val versionGroup: VersionGroupDto?
)

@Keep
data class VersionGroupDto(
    val name: String?,
    val url: String?
)

@Keep
data class XYDto(
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String?,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any
)

@Keep
data class YellowDto(
    @SerializedName("back_default")
    val backDefault: String?,
    @SerializedName("back_gray")
    val backGray: String?,
    @SerializedName("front_default")
    val frontDefault: String?,
    @SerializedName("front_gray")
    val frontGray: String?
)

