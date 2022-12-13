package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.GetGamesUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetGamesUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : GetGamesUseCase<Flow<@JvmSuppressWildcards GamesModel>> {

    override suspend fun invoke(limit: Int) = repository.getAll(limit)
}