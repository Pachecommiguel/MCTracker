package com.example.marvelchampionstracker.domain.usecase

interface AddAspectToGameUseCase {
    operator fun invoke(aspect: String)
}