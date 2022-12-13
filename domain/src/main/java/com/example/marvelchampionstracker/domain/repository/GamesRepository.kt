package com.example.marvelchampionstracker.domain.repository

interface GamesRepository<T> {
    suspend fun getAll(limit: Int): T
    suspend fun remove(timeStamp: Long)
}