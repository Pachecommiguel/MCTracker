package com.example.marvelchampionstracker.data.repository

import com.example.marvelchampionstracker.data.utils.ModelMapper
import com.example.marvelchampionstracker.domain.repository.PacksRepository
import com.example.marvelchampionstracker.network.pack.PackService
import com.example.marvelchampionstracker.network.pack.PacksResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PacksRepositoryImp @Inject constructor(
    private val service: PackService
) : PacksRepository {

    private lateinit var response: List<PacksResponse>

    override suspend fun getAll() = ModelMapper.toPacksModel(response)

    override suspend fun getSize(): Int {
        if (!::response.isInitialized) {
            response = service.getPacks()
        }

        return response.size
    }
}