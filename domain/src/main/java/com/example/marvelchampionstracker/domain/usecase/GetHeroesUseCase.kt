package com.example.marvelchampionstracker.domain.usecase

import com.example.marvelchampionstracker.domain.model.HeroesModel

interface GetHeroesUseCase {
    suspend operator fun invoke(packCode: String): HeroesModel
}