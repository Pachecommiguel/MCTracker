package com.example.marvelchampionstracker.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.marvelchampionstracker.database.game.GameDao
import com.example.marvelchampionstracker.database.game.GameEntity
import com.example.marvelchampionstracker.database.pack.PackDao
import com.example.marvelchampionstracker.database.pack.PackEntity

@TypeConverters(CustomTypeConverter::class)
@Database(
    entities = [PackEntity::class, GameEntity::class],
    version = 1,
    exportSchema = false
)
abstract class Database : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "MCT"
    }

    abstract fun packDao(): PackDao
    abstract fun gameDao(): GameDao
}