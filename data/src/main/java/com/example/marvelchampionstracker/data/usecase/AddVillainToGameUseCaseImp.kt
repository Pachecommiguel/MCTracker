package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddVillainToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddVillainToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddVillainToGameUseCase {

    override fun invoke(name: String) {
        repository.addVillain(name)
    }
}