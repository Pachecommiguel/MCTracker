package com.example.marvelchampionstracker.domain.usecase

import com.example.marvelchampionstracker.domain.model.CollectionModel
import kotlinx.coroutines.flow.Flow

interface GetCollectionUseCase {
    suspend operator fun invoke(): Flow<CollectionModel>
}