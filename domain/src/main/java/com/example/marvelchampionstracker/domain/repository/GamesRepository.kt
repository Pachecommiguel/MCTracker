package com.example.marvelchampionstracker.domain.repository

import com.example.marvelchampionstracker.domain.model.GamesModel
import kotlinx.coroutines.flow.Flow

interface GamesRepository {
    suspend fun getAll(limit: Int): Flow<GamesModel>
}