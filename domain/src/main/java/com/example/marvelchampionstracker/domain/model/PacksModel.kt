package com.example.marvelchampionstracker.domain.model

data class PacksModel(
    val list: List<Pack>
) {
    data class Pack(
        val name: String
    )
}
