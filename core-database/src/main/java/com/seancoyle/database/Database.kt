package com.seancoyle.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.seancoyle.database.daos.PokeInfoDao
import com.seancoyle.database.daos.PokeListDao
import com.seancoyle.database.entities.PokeInfoEntity
import com.seancoyle.database.entities.PokeListEntity
import com.seancoyle.database.typeconverters.*

@Database(
    entities =
    [
        PokeInfoEntity::class,
        PokeListEntity::class
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    LocalDateTimeTypeConverter::class,
    AbilityTypeConverter::class,
    FormTypeConverter::class,
    MoveTypeConverter::class,
    StatsTypeConverter::class,
    TypeTypeConverter::class,
    VersionGroupDetailTypeConverter::class
)
abstract class Database : RoomDatabase() {

    abstract fun pokeInfoDao(): PokeInfoDao
    abstract fun pokeListDao(): PokeListDao

    companion object {
        const val DATABASE_NAME: String = "pokedex_db"
    }

}