package com.example.marvelchampionstracker.domain.usecase

interface AddHeroToGameUseCase {
    operator fun invoke(name: String)
}