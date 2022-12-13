package com.example.marvelchampionstracker.domain.repository

interface GamesRepository<T> {
    suspend fun getAll(limit: Int): T
    suspend fun remove(timeStamp: Long)
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