package com.example.marvelchampionstracker.domain.usecase

interface AddHeroToGameUseCase {
    suspend operator fun invoke(name: String)
}