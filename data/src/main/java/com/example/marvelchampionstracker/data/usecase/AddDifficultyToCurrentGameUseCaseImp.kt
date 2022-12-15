package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddDifficultyToCurrentGameUseCase
import javax.inject.Inject

class AddDifficultyToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddDifficultyToCurrentGameUseCase {

    override fun invoke(name: String) {
        repository.addDifficultyToCurrentGame(name)
    }
}