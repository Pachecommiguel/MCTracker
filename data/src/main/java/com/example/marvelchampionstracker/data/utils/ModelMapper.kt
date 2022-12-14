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

    fun toGamesModel(list: List<GameEntity>): GamesModel {
        val tmpList = list.map {
            GamesModel.Game(it.timeStamp)
        }

        return GamesModel(tmpList)
    }

    fun toPacksModel(map: Map<String, PacksResponse>): PacksModel {
        val tmpList = map.map {
            PacksModel.Pack(it.value.name)
        }

        return PacksModel(tmpList)
    }

    fun toCollectionModel(list: List<PackEntity>): CollectionModel {
        val tmpList = list.map {
            CollectionModel.Pack(it.code, it.name)
        }

        return CollectionModel(tmpList)
    }

    fun toPackModel(response: PacksResponse) = CollectionModel.Pack(response.code, response.name)

    fun toHeroesModel(list: List<CardsResponse>): HeroesModel {
        val heroList = list.filter {
            it.typeCode == CardTypeCode.HERO.typeCode
        }

        val tmpList = heroList.map {
            HeroesModel.Hero(it.cardSetName, it.imageSrc)
        }

        return HeroesModel(tmpList)
    }
}