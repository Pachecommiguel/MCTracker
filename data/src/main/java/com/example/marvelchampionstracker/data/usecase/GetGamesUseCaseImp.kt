package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.GetGamesUseCase
import javax.inject.Inject

class GetGamesUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : GetGamesUseCase {

    override suspend fun invoke(limit: Int) = repository.getAll(limit)
}