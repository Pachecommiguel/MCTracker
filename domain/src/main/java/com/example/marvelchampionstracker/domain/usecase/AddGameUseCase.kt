package com.example.marvelchampionstracker.domain.usecase

interface AddGameUseCase {
    suspend operator fun invoke(timeStamp: Long)
}