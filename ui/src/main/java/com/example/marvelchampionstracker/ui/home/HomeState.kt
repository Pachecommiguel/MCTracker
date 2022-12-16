package com.example.marvelchampionstracker.ui.home

import com.example.marvelchampionstracker.domain.model.GamesModel

data class HomeState(
    var gamesModel: GamesModel? = null,
    var packsAvailable: Int? = null,
    var messageId: Int? = null
)
