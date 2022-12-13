package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddResultToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddResultToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddResultToGameUseCase {

    override fun invoke(result: String) {
        repository.addResultToCurrentGame(result)
    }
}