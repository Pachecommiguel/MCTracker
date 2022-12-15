package com.example.marvelchampionstracker.domain.repository

import com.example.marvelchampionstracker.domain.model.CollectionModel
import kotlinx.coroutines.flow.Flow

interface CollectionRepository {
    suspend fun getAll(): Flow<CollectionModel>
    suspend fun getSize(): Int
    suspend fun addPack(pack: CollectionModel.Pack)
    suspend fun removePack(code: String)
}