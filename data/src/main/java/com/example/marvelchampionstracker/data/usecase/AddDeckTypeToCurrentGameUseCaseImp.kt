package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddDeckTypeToCurrentGameUseCase
import javax.inject.Inject

class AddDeckTypeToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddDeckTypeToCurrentGameUseCase {

    override fun invoke(type: String) {
        repository.addDeckTypeToCurrentGame(type)
    }
}