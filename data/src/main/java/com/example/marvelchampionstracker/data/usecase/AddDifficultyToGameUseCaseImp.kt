package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddDifficultyToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddDifficultyToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddDifficultyToGameUseCase {

    override fun invoke(name: String) {
        repository.addDifficulty(name)
    }
}