package com.seancoyle.database.entities

import androidx.annotation.Keep
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Keep
@Entity(tableName = "poke_list")
data class PokeListEntity(
    @PrimaryKey(autoGenerate = false)
    val name: String,

    @ColumnInfo(name = "url")
    val url: String,

    @ColumnInfo(name = "image")
    val image: String,
)