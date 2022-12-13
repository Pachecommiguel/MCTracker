package com.example.marvelchampionstracker.domain.model

data class CollectionModel(
    val list: List<Pack>
) {
    data class Pack(
        val name: String
    )
}