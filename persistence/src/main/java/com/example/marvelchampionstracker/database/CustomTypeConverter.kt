package com.example.marvelchampionstracker.database

import androidx.room.TypeConverter
import com.google.gson.Gson

object CustomTypeConverter {

    private val GSON = Gson()

    @TypeConverter
    fun toJsonFromSetOfString(src: Set<String>): String = GSON.toJson(src)

    @TypeConverter
    fun fromJsonToSetOfString(src: String): Set<String> = GSON.fromJson(
        src,
        mutableSetOf<String>()::class.java
    )
}