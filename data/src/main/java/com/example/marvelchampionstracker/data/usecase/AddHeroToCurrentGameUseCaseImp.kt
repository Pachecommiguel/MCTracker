package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddHeroToCurrentGameUseCase
import javax.inject.Inject

class AddHeroToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddHeroToCurrentGameUseCase {

    override fun invoke(name: String) {
        repository.addHeroToCurrentGame(name)
    }
}