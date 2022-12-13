package com.example.marvelchampionstracker.ui.utils

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.ui.home.HomeState

object StateMapper {

    fun toHomeState(games: GamesModel) = HomeState(games)

    fun toHomeState(availablePacks: Int) = HomeState(availablePacks = availablePacks)
}