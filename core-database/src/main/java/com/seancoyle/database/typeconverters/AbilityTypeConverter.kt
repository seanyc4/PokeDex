package com.seancoyle.database.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seancoyle.database.entities.AbilityEntity

class AbilityTypeConverter {

    @TypeConverter
    fun stringToList(data: String?): List<AbilityEntity> {
        if (data.isNullOrEmpty()) {
            return emptyList()
        }

        val typeToken = object : TypeToken<List<AbilityEntity>>() {}.type

        return Gson().fromJson(data, typeToken)
    }

    @TypeConverter
    fun listToString(list: List<AbilityEntity>): String {
        return Gson().toJson(list)
    }
}