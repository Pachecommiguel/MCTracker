package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddHeroToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddHeroToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddHeroToGameUseCase {

    override suspend fun invoke(name: String) {
        repository.addHeroToPlayer(name)
    }
}