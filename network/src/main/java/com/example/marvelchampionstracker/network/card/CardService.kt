package com.example.marvelchampionstracker.network.card

import com.example.marvelchampionstracker.network.ApiEndpoints
import retrofit2.http.GET
import retrofit2.http.Path

interface CardService {

    @GET(ApiEndpoints.CARDS)
    suspend fun getCards(@Path("packCode") packCode: String): List<CardsResponse>
}