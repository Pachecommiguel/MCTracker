package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddAspectToCurrentGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddAspectToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddAspectToCurrentGameUseCase {

    override fun invoke(aspect: String) {
        repository.addAspectToCurrentGame(aspect)
    }
}