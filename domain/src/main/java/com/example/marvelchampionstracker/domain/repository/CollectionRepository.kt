package com.example.marvelchampionstracker.domain.repository

import com.example.marvelchampionstracker.domain.model.CollectionModel

interface CollectionRepository<T> {
    suspend fun getAll(): T
    suspend fun getSize(): Int
    suspend fun addPack(pack: CollectionModel.Pack)
    suspend fun removePack(code: String)
}