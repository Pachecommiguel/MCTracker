package com.example.marvelchampionstracker.domain.repository

interface GamesRepository<T> {
    suspend fun getAll(limit: Int): T
    suspend fun remove(timeStamp: Long)
    fun addPlayer(name: String)
    fun createGame(timeStamp: Long)
    suspend fun addHeroToPlayer(name: String)
}