package com.example.marvelchampionstracker.data.utils

import com.example.marvelchampionstracker.database.game.GameEntity
import com.example.marvelchampionstracker.database.pack.PackEntity
import com.example.marvelchampionstracker.domain.model.CollectionModel

object EntityMapper {

    fun toCollectionEntity(pack: CollectionModel.Pack) = PackEntity(pack.code, pack.name)

    fun toPlayerEntity(name: String) = GameEntity.Player(name)

    fun toGameEntity(timeStamp: Long) = GameEntity(timeStamp)
}