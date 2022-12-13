package com.example.marvelchampionstracker.domain.model

data class GamesModel(
    val list: List<Game>
) {
    data class Game(
        val timeStamp: Long
    )
}