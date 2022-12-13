package com.example.marvelchampionstracker.domain.usecase

interface AddHeroKOToGameUseCase {
    suspend operator fun invoke(isKO: Boolean)
}