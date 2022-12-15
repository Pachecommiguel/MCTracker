package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.CreateNewGameUseCase
import javax.inject.Inject

class CreateNewGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : CreateNewGameUseCase {

    override suspend fun invoke(timeStamp: Long) {
        repository.createNewGame(timeStamp)
    }
}