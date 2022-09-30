package com.seancoyle.database.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seancoyle.database.entities.StatEntity

class StatsTypeConverter {

    @TypeConverter
    fun stringToList(data: String?): List<StatEntity> {
        if (data.isNullOrEmpty()) {
            return emptyList()
        }

        val typeToken = object : TypeToken<List<StatEntity>>() {}.type

        return Gson().fromJson(data, typeToken)
    }

    @TypeConverter
    fun listToString(list: List<StatEntity>): String {
        return Gson().toJson(list)
    }
}