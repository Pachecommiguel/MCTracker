package com.example.marvelchampionstracker.data.repository

import com.example.marvelchampionstracker.data.utils.ModelMapper
import com.example.marvelchampionstracker.domain.model.HeroesModel
import com.example.marvelchampionstracker.domain.repository.CardsRepository
import com.example.marvelchampionstracker.network.card.CardService
import com.example.marvelchampionstracker.network.card.CardsResponse
import javax.inject.Inject

class CardsRepositoryImp @Inject constructor(
    private val service: CardService
) : CardsRepository {

    private lateinit var cards: Map<String, List<CardsResponse>>

    override suspend fun getHeroes(packCode: String): HeroesModel {
        if (!::cards.isInitialized) {
            val response = service.getCards(packCode)
            cards = mapOf(packCode to response)
        }

        val value = cards.getValue(packCode)
        return ModelMapper.toHeroesModel(value)
    }
}