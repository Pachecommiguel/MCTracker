package com.example.marvelchampionstracker.domain.usecase

interface AddPackToCollectionUseCase {
    suspend operator fun invoke(code: String)
}