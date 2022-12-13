package com.example.marvelchampionstracker.database.game

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GameEntity(
    @PrimaryKey val timeStamp: Long,
    val playersSet: MutableSet<Player> = mutableSetOf(),
    var isCampaign: Boolean = false,
    var villain: String = String(),
    val encountersSet: MutableSet<String> = mutableSetOf(),
    var difficulty: String = String()
) {
    data class Player(
        val name: String,
        var heroName: String = String(),
        var isHeroKO: Boolean = false,
        val aspectsSet: MutableSet<String> = mutableSetOf(),
        var deckType: String = String()
    )
}