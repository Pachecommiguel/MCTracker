package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddVillainToCurrentGameUseCase
import javax.inject.Inject

class AddVillainToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddVillainToCurrentGameUseCase {

    override fun invoke(name: String) {
        repository.addVillainToCurrentGame(name)
    }
}