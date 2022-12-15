package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddAspectToCurrentGameUseCase
import javax.inject.Inject

class AddAspectToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddAspectToCurrentGameUseCase {

    override fun invoke(aspect: String) {
        repository.addAspectToCurrentGame(aspect)
    }
}