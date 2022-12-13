package com.example.marvelchampionstracker.domain.usecase

interface AddDeckTypeToCurrentGameUseCase {
    operator fun invoke(type: String)
}