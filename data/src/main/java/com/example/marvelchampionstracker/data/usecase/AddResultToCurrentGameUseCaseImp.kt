package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddResultToCurrentGameUseCase
import javax.inject.Inject

class AddResultToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddResultToCurrentGameUseCase {

    override fun invoke(result: String) {
        repository.addResultToCurrentGame(result)
    }
}