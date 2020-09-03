package com.example.mproductv.model.Repository

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class ConverterList {
    @TypeConverter
    fun fromString(value:String?):List<String>{
        val listType: Type = object : TypeToken<List<String?>?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromList(list: List<String>?):String{
        val gson = Gson()
        return gson.toJson(list)
    }

}