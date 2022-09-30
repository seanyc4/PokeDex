package com.seancoyle.database.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seancoyle.database.entities.VersionGroupDetailEntity

class VersionGroupDetailTypeConverter {

    @TypeConverter
    fun stringToList(data: String?): List<VersionGroupDetailEntity> {
        if (data.isNullOrEmpty()) {
            return emptyList()
        }

        val typeToken = object : TypeToken<List<VersionGroupDetailEntity>>() {}.type

        return Gson().fromJson(data, typeToken)
    }

    @TypeConverter
    fun listToString(list: List<VersionGroupDetailEntity>): String {
        return Gson().toJson(list)
    }
}