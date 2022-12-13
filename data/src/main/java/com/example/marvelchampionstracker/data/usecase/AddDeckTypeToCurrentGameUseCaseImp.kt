package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddDeckTypeToCurrentGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddDeckTypeToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddDeckTypeToCurrentGameUseCase {

    override fun invoke(type: String) {
        repository.addDeckTypeToCurrentGame(type)
    }
}