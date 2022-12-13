package com.example.marvelchampionstracker.data.utils

import com.example.marvelchampionstracker.database.game.GameEntity
import com.example.marvelchampionstracker.database.pack.PackEntity
import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.model.HeroesModel
import com.example.marvelchampionstracker.domain.model.PacksModel
import com.example.marvelchampionstracker.network.card.CardsResponse
import com.example.marvelchampionstracker.network.pack.PacksResponse

object ModelMapper {

    fun toGamesModel(list: List<GameEntity>) = GamesModel(
        list.map {
            GamesModel.Game(it.timeStamp)
        }
    )

    fun toPacksModel(map: Map<String, PacksResponse>) = PacksModel(
        map.map {
            PacksModel.Pack(it.value.name)
        }
    )

    fun toCollectionModel(list: List<PackEntity>) = CollectionModel(
        list.map {
            CollectionModel.Pack(it.code, it.name)
        }
    )

    fun toPackModel(response: PacksResponse) = CollectionModel.Pack(response.code, response.name)

    fun toHeroesModel(list: List<CardsResponse>) = HeroesModel(
        list.filter { it.typeCode == CardTypeCode.HERO.typeCode }.map {
            HeroesModel.Hero(
                it.cardSetName,
                it.imageSrc
            )
        }
    )
}