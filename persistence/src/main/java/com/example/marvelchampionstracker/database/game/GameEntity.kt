package com.example.marvelchampionstracker.database.game

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GameEntity(
    @PrimaryKey val timeStamp: Long
)