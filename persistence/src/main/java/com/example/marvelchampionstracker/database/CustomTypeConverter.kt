package com.example.marvelchampionstracker.database

import androidx.room.TypeConverter
import com.example.marvelchampionstracker.database.game.GameEntity
import com.google.gson.Gson

object CustomTypeConverter {

    private val GSON = Gson()

    @TypeConverter
    fun toJsonFromSetOfPlayer(src: Set<GameEntity.Player>): String = GSON.toJson(src)

    @TypeConverter
    fun fromJsonToSetOfPlayer(src: String): Set<GameEntity.Player> = GSON.fromJson(
        src,
        mutableSetOf<GameEntity.Player>()::class.java
    )

    @TypeConverter
    fun toJsonFromSetOfString(src: Set<String>): String = GSON.toJson(src)

    @TypeConverter
    fun fromJsonToSetOfString(src: String): Set<String> = GSON.fromJson(
        src,
        mutableSetOf<String>()::class.java
    )
}