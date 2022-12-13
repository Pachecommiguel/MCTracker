package com.example.marvelchampionstracker.domain.usecase

interface RemoveGameUseCase {
    suspend operator fun invoke(timeStamp: Long)
}