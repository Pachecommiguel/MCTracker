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
        var heroName: String = String(),
        var isHeroKO: Boolean = false,
        val aspects: MutableSet<String> = mutableSetOf()
    )
}