package com.seancoyle.database.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seancoyle.database.entities.MoveEntity

class MoveTypeConverter {

    @TypeConverter
    fun stringToList(data: String?): List<MoveEntity> {
        if (data.isNullOrEmpty()) {
            return emptyList()
        }

        val typeToken = object : TypeToken<List<MoveEntity>>() {}.type

        return Gson().fromJson(data, typeToken)
    }

    @TypeConverter
    fun listToString(list: List<MoveEntity>): String {
        return Gson().toJson(list)
    }
}