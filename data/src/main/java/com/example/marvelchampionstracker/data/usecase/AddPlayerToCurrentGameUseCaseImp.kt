package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddPlayerToCurrentGameUseCase
import javax.inject.Inject

class AddPlayerToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddPlayerToCurrentGameUseCase {

    override fun invoke(name: String) {
        repository.addPlayerToCurrentGame(name)
    }
}