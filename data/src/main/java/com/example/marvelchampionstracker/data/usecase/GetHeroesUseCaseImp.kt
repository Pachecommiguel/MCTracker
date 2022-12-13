package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.CardsRepository
import com.example.marvelchampionstracker.domain.usecase.GetHeroesUseCase
import javax.inject.Inject

class GetHeroesUseCaseImp @Inject constructor(
    private val repository: CardsRepository
) : GetHeroesUseCase {

    override suspend fun invoke(packCode: String) = repository.getHeroes(packCode)
}