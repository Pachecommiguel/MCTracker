package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.RemoveGameUseCase
import javax.inject.Inject

class RemoveGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : RemoveGameUseCase {

    override suspend fun invoke(timeStamp: Long) {
        repository.remove(timeStamp)
    }
}