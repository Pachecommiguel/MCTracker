package com.example.marvelchampionstracker.domain.usecase

interface AddPlayerToCurrentGameUseCase {
    operator fun invoke(name: String)
}