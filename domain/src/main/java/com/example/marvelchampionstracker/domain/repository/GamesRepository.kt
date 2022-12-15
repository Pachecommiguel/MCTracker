package com.example.marvelchampionstracker.domain.repository

import com.example.marvelchampionstracker.domain.model.GamesModel
import kotlinx.coroutines.flow.Flow

interface GamesRepository {
    suspend fun getAll(limit: Int): Flow<GamesModel>
    suspend fun remove(timeStamp: Long)
    suspend fun saveCurrentGame()
    fun addPlayerToCurrentGame(player: String)
    fun createNewGame(timeStamp: Long)
    fun addHeroToCurrentGame(hero: String)
    fun addHeroStateToCurrentGame(isKO: Boolean)
    fun addAspectToCurrentGame(aspect: String)
    fun addDeckTypeToCurrentGame(type: String)
    fun addCampaignModeToCurrentGame(isCampaign: Boolean)
    fun addVillainToCurrentGame(villain: String)
    fun addEncounterSetToCurrentGame(set: String)
    fun addDifficultyToCurrentGame(difficulty: String)
    fun addResultToCurrentGame(result: String)
}