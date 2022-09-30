package com.seancoyle.database.entities

import androidx.annotation.Keep
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.seancoyle.database.typeconverters.*

@Keep
@Entity(tableName = "poke_info")
data class PokeInfoEntity(

    @PrimaryKey(autoGenerate = false)
    val name: String,

    @TypeConverters(AbilityTypeConverter::class)
    val abilities: List<AbilityEntity>,

    val baseExperience: Int,

    @TypeConverters(FormTypeConverter::class)
    val forms: List<FormEntity>,
    val height: Int,
    val id: Int,
    val isDefault: Boolean,
    val locationAreaEncounters: String,

    @TypeConverters(MoveTypeConverter::class)
    val moves: List<MoveEntity>,
    val order: Int,

    @Embedded(prefix = "pokemon_info_species_")
    val species: SpeciesEntity,

    @Embedded(prefix = "pokemon_info_sprites_")
    val sprites: SpritesEntity,

    @TypeConverters(StatsTypeConverter::class)
    val stats: List<StatEntity>,

    @TypeConverters(TypeTypeConverter::class)
    val types: List<TypeEntity>,
    val weight: Int
)

@Keep
data class AbilityEntity(
    @Embedded(prefix = "ability_abilityx_")
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
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String,
)

@Keep
data class BlackWhiteEntity(
    @Embedded(prefix = "black_white_animated_")
    val animated: AnimatedEntity,
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
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
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String,
)

@Keep
data class DreamWorldEntity(
    val frontDefault: String,
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
data class GenerationIEntity(
    @Embedded(prefix = "gen_i_red_blue_")
    val redBlue: RedBlueEntity,
    @Embedded(prefix = "gen_i_yellow_")
    val yellow: YellowEntity
)

@Keep
data class GenerationIiEntity(
    @Embedded(prefix = "gen_ii_crystal_")
    val crystal: CrystalEntity,
    @Embedded(prefix = "gen_ii_gold_")
    val gold: GoldEntity,
    @Embedded(prefix = "gen_ii_silver_")
    val silver: SilverEntity
)

@Keep
data class GenerationIiiEntity(
    @Embedded(prefix = "gen_iii_emerald_")
    val emerald: EmeraldEntity,
    @Embedded(prefix = "gen_iii_fire_red_")
    val fireRedLeafGreen: FireRedLeafGreenEntity,
    @Embedded(prefix = "gen_iii_ruby_")
    val rubySapphire: RubySapphireEntity
)

@Keep
data class GenerationIvEntity(
    @Embedded(prefix = "gen_iv_diamond_")
    val diamondPearl: DiamondPearlEntity,
    @Embedded(prefix = "gen_iv_heart_")
    val heartGoldSoulSilver: HeartGoldSoulSilverEntity,
    @Embedded(prefix = "gen_iv_platinum_")
    val platinum: PlatinumEntity
)

@Keep
data class GenerationVEntity(
    @Embedded(prefix = "gen_v_black_white_")
    val blackWhite: BlackWhiteEntity
)

@Keep
data class GenerationViEntity(
    @Embedded(prefix = "omega_")
    val omegaRubyAlphaSapphire: OmegaRubyAlphaSapphireEntity,
    @Embedded(prefix = "xy_")
    val xY: XYEntity
)

@Keep
data class GenerationViiEntity(
    @Embedded(prefix = "gen_vii_icons_")
    val icons: IconsEntity,
    @Embedded(prefix = "gen_vii_ultra_")
    val ultraSunUltraMoon: UltraSunUltraMoonEntity
)

@Keep
data class GenerationViiiEntity(
    @Embedded(prefix = "gen_viii_icons_")
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
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String
)

@Keep
data class IconsEntity(
    val frontDefault: String
)

@Keep
data class IconsXEntity(
    val frontDefault: String
)

@Keep
data class MoveEntity(
    @Embedded(prefix = "move_")
    val move: MoveXEntity,
    @TypeConverters(VersionGroupDetailTypeConverter::class)
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
    val frontShiny: String
)

@Keep
data class OtherEntity(
    @Embedded(prefix = "other_dream_")
    val dreamWorld: DreamWorldEntity,
    @Embedded(prefix = "other_official_")
    val officialArtwork: OfficialArtworkEntity
)

@Keep
data class PlatinumEntity(
    val backDefault: String,
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String,
)

@Keep
data class RedBlueEntity(
    val backDefault: String,
    val backGray: String,
    val frontDefault: String,
    val frontGray: String
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
    val backShiny: String,
    val frontDefault: String,
    val frontShiny: String,
    @Embedded(prefix = "sprites_other_")
    val other: OtherEntity,
    @Embedded(prefix = "sprites_versions_")
    val versions: VersionsEntity
)

@Keep
data class StatEntity(
    val baseStat: Int,
    val effort: Int,
    @Embedded(prefix = "stat_")
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
    @Embedded(prefix = "type_")
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
    val frontShiny: String,
)

@Keep
data class VersionsEntity(
    @Embedded(prefix = "versions_gen_i_")
    val generationI: GenerationIEntity,
    @Embedded(prefix = "versions_gen_ii_")
    val generationIi: GenerationIiEntity,
    @Embedded(prefix = "versions_gen_iii_")
    val generationIii: GenerationIiiEntity,
    @Embedded(prefix = "versions_gen_iv_")
    val generationIv: GenerationIvEntity,
    @Embedded(prefix = "versions_gen_v_")
    val generationV: GenerationVEntity,
    @Embedded(prefix = "versions_gen_vi_")
    val generationVi: GenerationViEntity,
    @Embedded(prefix = "versions_gen_vii_")
    val generationVii: GenerationViiEntity,
    @Embedded(prefix = "versions_gen_viii_")
    val generationViii: GenerationViiiEntity
)

@Keep
data class VersionGroupDetailEntity(
    val levelLearnedAt: Int,
    @Embedded(prefix = "version_group_")
    val moveLearnMethod: MoveLearnMethodEntity,
    @Embedded(prefix = "version_group_")
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
    val frontShiny: String
)

@Keep
data class YellowEntity(
    val backDefault: String,
    val backGray: String,
    val frontDefault: String,
    val frontGray: String
)