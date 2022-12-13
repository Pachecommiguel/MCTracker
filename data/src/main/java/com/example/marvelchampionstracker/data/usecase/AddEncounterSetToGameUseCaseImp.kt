package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddEncounterSetToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddEncounterSetToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddEncounterSetToGameUseCase {

    override fun invoke(name: String) {
        repository.addEncounterSetToCurrentGame(name)
    }
}