package com.example.marvelchampionstracker.domain.usecase

interface AddHeroKOToGameUseCase {
    operator fun invoke(isKO: Boolean)
}