package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddAspectToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddAspectToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddAspectToGameUseCase {

    override suspend fun invoke(aspect: String) {
        repository.addAspect(aspect)
    }
}