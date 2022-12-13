package com.example.marvelchampionstracker.domain.usecase

interface CreateNewGameUseCase {
    suspend operator fun invoke(timeStamp: Long)
}