package com.seancoyle.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.seancoyle.database.daos.PokemonDao
import com.seancoyle.database.entities.PokemonEntity
import com.seancoyle.database.typeconverters.LocalDateTimeTypeConverter

@Database(
    entities =
    [
        PokemonEntity::class
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    LocalDateTimeTypeConverter::class
)
abstract class Database : RoomDatabase() {

    abstract fun pokemonDao(): PokemonDao

    companion object {
        const val DATABASE_NAME: String = "pokedex_db"
    }

}