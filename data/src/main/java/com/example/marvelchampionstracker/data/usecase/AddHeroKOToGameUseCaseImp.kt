package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddHeroKOToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddHeroKOToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddHeroKOToGameUseCase {

    override fun invoke(isKO: Boolean) {
        repository.addHeroStateToCurrentGame(isKO)
    }
}