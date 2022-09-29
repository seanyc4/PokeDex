package com.seancoyle.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.seancoyle.database.daos.PokeInfoDao
import com.seancoyle.database.entities.PokemonInfoEntity
import com.seancoyle.database.typeconverters.LocalDateTimeTypeConverter

@Database(
    entities =
    [
        PokemonInfoEntity::class
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    LocalDateTimeTypeConverter::class
)
abstract class Database : RoomDatabase() {

    abstract fun pokemonDao(): PokeInfoDao

    companion object {
        const val DATABASE_NAME: String = "pokedex_db"
    }

}