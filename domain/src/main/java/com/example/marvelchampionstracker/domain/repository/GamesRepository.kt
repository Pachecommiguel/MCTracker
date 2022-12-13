package com.example.marvelchampionstracker.domain.repository

interface GamesRepository<T> {
    suspend fun getAll(limit: Int): T
    suspend fun remove(timeStamp: Long)
    fun addPlayer(name: String)
    fun createGame(timeStamp: Long)
    fun addHero(name: String)
    fun addHeroKO(isKO: Boolean)
    fun addAspect(aspect: String)
    fun addDeckType(type: String)
    fun addCampaign(isCampaign: Boolean)
}