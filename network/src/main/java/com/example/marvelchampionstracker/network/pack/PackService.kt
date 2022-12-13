package com.example.marvelchampionstracker.network.pack

import com.example.marvelchampionstracker.network.ApiEndpoints
import retrofit2.http.GET

interface PackService {

    @GET(ApiEndpoints.PACKS)
    suspend fun getPacks(): List<PacksResponse>
}