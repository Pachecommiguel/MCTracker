package com.example.marvelchampionstracker.data.repository

import com.example.marvelchampionstracker.data.utils.ModelMapper
import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.model.PacksModel
import com.example.marvelchampionstracker.domain.repository.PacksRepository
import com.example.marvelchampionstracker.network.pack.PackService
import com.example.marvelchampionstracker.network.pack.PacksResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PacksRepositoryImp @Inject constructor(
    private val service: PackService
) : PacksRepository {

    private lateinit var packsMap: Map<String, PacksResponse>

    override suspend fun getAll(): PacksModel {
        checkPacksMapValue()
        return ModelMapper.toPacksModel(packsMap)
    }

    override suspend fun getSize(): Int {
        checkPacksMapValue()
        return packsMap.size
    }

    override fun getByCode(code: String): CollectionModel.Pack {
        val value = packsMap.getValue(code)
        return ModelMapper.toPackModel(value)
    }

    private suspend fun checkPacksMapValue() {
        if (!::packsMap.isInitialized) {
            packsMap = service.getPacks().associateBy(PacksResponse::code)
        }
    }
}