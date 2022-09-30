package com.seancoyle.database.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seancoyle.database.entities.TypeEntity

class TypeTypeConverter {

    @TypeConverter
    fun stringToList(data: String?): List<TypeEntity> {
        if (data.isNullOrEmpty()) {
            return emptyList()
        }

        val typeToken = object : TypeToken<List<TypeEntity>>() {}.type

        return Gson().fromJson(data, typeToken)
    }

    @TypeConverter
    fun listToString(list: List<TypeEntity>): String {
        return Gson().toJson(list)
    }
}