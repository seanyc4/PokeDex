package com.seancoyle.database.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.seancoyle.database.entities.FormEntity

class FormTypeConverter {

    @TypeConverter
    fun stringToList(data: String?): List<FormEntity> {
        if (data.isNullOrEmpty()) {
            return emptyList()
        }

        val typeToken = object : TypeToken<List<FormEntity>>() {}.type

        return Gson().fromJson(data, typeToken)
    }

    @TypeConverter
    fun listToString(list: List<FormEntity>): String {
        return Gson().toJson(list)
    }
}