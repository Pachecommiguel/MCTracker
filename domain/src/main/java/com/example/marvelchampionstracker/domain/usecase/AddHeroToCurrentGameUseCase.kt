package com.example.marvelchampionstracker.domain.usecase

interface AddHeroToCurrentGameUseCase {
    operator fun invoke(name: String)
}