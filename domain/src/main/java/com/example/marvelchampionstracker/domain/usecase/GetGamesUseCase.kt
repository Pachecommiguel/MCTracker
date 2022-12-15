package com.example.marvelchampionstracker.domain.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import kotlinx.coroutines.flow.Flow

interface GetGamesUseCase {
    suspend operator fun invoke(limit: Int = -1): Flow<GamesModel>
}