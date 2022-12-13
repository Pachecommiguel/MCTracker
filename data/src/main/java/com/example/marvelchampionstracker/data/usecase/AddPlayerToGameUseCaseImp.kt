package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddPlayerToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddPlayerToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddPlayerToGameUseCase {

    override fun invoke(name: String) {
        repository.addPlayer(name)
    }
}