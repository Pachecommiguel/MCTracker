package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddEncounterSetToCurrentGameUseCase
import javax.inject.Inject

class AddEncounterSetToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddEncounterSetToCurrentGameUseCase {

    override fun invoke(name: String) {
        repository.addEncounterSetToCurrentGame(name)
    }
}