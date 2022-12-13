package com.example.marvelchampionstracker.domain.usecase

interface GetAvailablePacksUseCase {
    suspend operator fun invoke(): Int
}