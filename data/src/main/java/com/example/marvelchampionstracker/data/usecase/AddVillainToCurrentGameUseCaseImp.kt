package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddVillainToCurrentGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddVillainToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddVillainToCurrentGameUseCase {

    override fun invoke(name: String) {
        repository.addVillainToCurrentGame(name)
    }
}