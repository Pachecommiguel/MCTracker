package com.example.marvelchampionstracker.domain.usecase

interface AddAspectToCurrentGameUseCase {
    operator fun invoke(aspect: String)
}