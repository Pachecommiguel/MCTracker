package com.example.marvelchampionstracker.domain.usecase

interface AddPlayerToGameUseCase {
    operator fun invoke(name: String)
}