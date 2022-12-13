package com.example.marvelchampionstracker.domain.usecase

interface RemovePackFromCollectionUseCase {
    suspend operator fun invoke(code: String)
}