package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddHeroStateToCurrentGameUseCase
import javax.inject.Inject

class AddHeroStateToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddHeroStateToCurrentGameUseCase {

    override fun invoke(isKO: Boolean) {
        repository.addHeroStateToCurrentGame(isKO)
    }
}