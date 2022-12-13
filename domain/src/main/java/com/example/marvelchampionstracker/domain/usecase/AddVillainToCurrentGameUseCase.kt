package com.example.marvelchampionstracker.domain.usecase

interface AddVillainToCurrentGameUseCase {
    operator fun invoke(name: String)
}