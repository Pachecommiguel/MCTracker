package com.example.marvelchampionstracker.domain.repository

interface CollectionRepository<T> {
    suspend fun getAll(): T
    suspend fun getSize(): Int
}