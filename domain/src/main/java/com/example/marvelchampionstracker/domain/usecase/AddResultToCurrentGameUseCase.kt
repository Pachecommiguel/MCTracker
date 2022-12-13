package com.example.marvelchampionstracker.domain.usecase

interface AddResultToCurrentGameUseCase {
    operator fun invoke(result: String)
}