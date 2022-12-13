package com.example.marvelchampionstracker.data.utils

import com.example.marvelchampionstracker.database.pack.PackEntity
import com.example.marvelchampionstracker.domain.model.CollectionModel

object EntityMapper {

    fun toCollectionEntity(pack: CollectionModel.Pack) = PackEntity(pack.code, pack.name)
}