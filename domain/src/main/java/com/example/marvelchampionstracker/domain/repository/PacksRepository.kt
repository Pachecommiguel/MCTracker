package com.example.marvelchampionstracker.domain.repository

import com.example.marvelchampionstracker.domain.model.PacksModel

interface PacksRepository {
    suspend fun getAll(): PacksModel
    suspend fun getSize(): Int
}