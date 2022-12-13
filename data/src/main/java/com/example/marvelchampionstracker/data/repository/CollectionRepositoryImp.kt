package com.example.marvelchampionstracker.data.repository

import com.example.marvelchampionstracker.data.utils.EntityMapper
import com.example.marvelchampionstracker.data.utils.ModelMapper
import com.example.marvelchampionstracker.database.pack.PackDao
import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CollectionRepositoryImp @Inject constructor(
    private val dao: PackDao
) : CollectionRepository<Flow<@JvmSuppressWildcards CollectionModel>> {

    override suspend fun getAll() = dao.getAll().map(ModelMapper::toCollectionModel)

    override suspend fun getSize() = dao.getSize()

    override suspend fun addPack(pack: CollectionModel.Pack) {
        val entity = EntityMapper.toCollectionEntity(pack)
        dao.insert(entity)
    }

    override suspend fun removePack(code: String) {
        dao.delete(code)
    }
}