package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddGameUseCase {

    override suspend fun invoke(timeStamp: Long) {
        repository.createNewGame(timeStamp)
    }
}