package com.example.marvelchampionstracker.domain.usecase

interface AddDeckTypeToGameUseCase {
    operator fun invoke(type: String)
}