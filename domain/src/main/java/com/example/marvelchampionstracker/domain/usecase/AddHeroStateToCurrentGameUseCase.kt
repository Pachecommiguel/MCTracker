package com.example.marvelchampionstracker.domain.usecase

interface AddHeroStateToCurrentGameUseCase {
    operator fun invoke(isKO: Boolean)
}