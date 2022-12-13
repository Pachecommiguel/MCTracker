package com.example.marvelchampionstracker.ui.home

import com.example.marvelchampionstracker.domain.model.GamesModel

data class HomeState(
    val games: GamesModel? = null,
    val availablePacks: Int? = null
)