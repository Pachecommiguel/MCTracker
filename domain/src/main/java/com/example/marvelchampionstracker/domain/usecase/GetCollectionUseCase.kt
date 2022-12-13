package com.example.marvelchampionstracker.domain.usecase

interface GetCollectionUseCase<T> {
    suspend operator fun invoke(): T
}