package com.example.marvelchampionstracker.domain.repository

import com.example.marvelchampionstracker.domain.model.HeroesModel

interface CardsRepository {
    suspend fun getHeroes(packCode: String): HeroesModel
}