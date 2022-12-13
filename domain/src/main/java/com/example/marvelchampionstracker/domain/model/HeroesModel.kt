package com.example.marvelchampionstracker.domain.model

data class HeroesModel(
    val heroesList: List<Hero>
) {
    data class Hero(
        val name: String,
        val imageSrc: String
    )
}
