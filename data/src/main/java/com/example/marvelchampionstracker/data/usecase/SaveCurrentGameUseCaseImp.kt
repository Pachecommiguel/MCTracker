package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.SaveCurrentGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SaveCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : SaveCurrentGameUseCase {

    override suspend fun invoke() {
        repository.saveCurrentGame()
    }
}