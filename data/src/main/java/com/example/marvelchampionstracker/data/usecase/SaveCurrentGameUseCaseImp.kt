package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.SaveCurrentGameUseCase
import javax.inject.Inject

class SaveCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : SaveCurrentGameUseCase {

    override suspend fun invoke() {
        repository.saveCurrentGame()
    }
}