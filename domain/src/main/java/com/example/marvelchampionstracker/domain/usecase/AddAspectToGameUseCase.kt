package com.example.marvelchampionstracker.domain.usecase

interface AddAspectToGameUseCase {
    suspend operator fun invoke(aspect: String)
}