package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddEncounterSetToCurrentGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddEncounterSetToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddEncounterSetToCurrentGameUseCase {

    override fun invoke(name: String) {
        repository.addEncounterSetToCurrentGame(name)
    }
}