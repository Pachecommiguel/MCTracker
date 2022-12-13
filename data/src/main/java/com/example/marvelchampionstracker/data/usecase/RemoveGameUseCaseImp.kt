package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.RemoveGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemoveGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : RemoveGameUseCase {

    override suspend fun invoke(timeStamp: Long) {
        repository.remove(timeStamp)
    }
}