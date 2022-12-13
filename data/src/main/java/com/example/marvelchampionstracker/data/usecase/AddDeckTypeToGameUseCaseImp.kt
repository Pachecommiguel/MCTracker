package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddDeckTypeToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddDeckTypeToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddDeckTypeToGameUseCase {

    override fun invoke(type: String) {
        repository.addDeckTypeToCurrentGame(type)
    }
}