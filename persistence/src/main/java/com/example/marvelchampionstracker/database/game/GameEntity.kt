package com.example.marvelchampionstracker.database.game

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GameEntity(
    @PrimaryKey val timeStamp: Long,
    val players: MutableSet<Player> = mutableSetOf()
) {
    data class Player(
        val name: String,
        val hero: Hero = Hero()
    ) {
        data class Hero(
            var name: String = String(),
            var isKO: Boolean = false
        )
    }
}