package com.example.marvelchampionstracker.database.game

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GameEntity(
    @PrimaryKey val timeStamp: Long,
    val playersSet: MutableSet<Player> = mutableSetOf(),
    var isCampaign: Boolean = false
) {
    data class Player(
        val name: String,
        var heroName: String = String(),
        var isHeroKO: Boolean = false,
        val aspectsSet: MutableSet<String> = mutableSetOf(),
        var deckType: String = String()
    )
}