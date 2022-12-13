package com.example.marvelchampionstracker.domain.usecase

interface GetGamesUseCase<T> {
    suspend operator fun invoke(limit: Int = -1): T
}