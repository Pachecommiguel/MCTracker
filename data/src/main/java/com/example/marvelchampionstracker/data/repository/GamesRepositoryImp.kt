package com.example.marvelchampionstracker.data.repository

import com.example.marvelchampionstracker.database.game.GameDao
import com.example.marvelchampionstracker.data.utils.ModelMapper
import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GamesRepositoryImp @Inject constructor(
    private val dao: GameDao
) : GamesRepository<Flow<@JvmSuppressWildcards GamesModel>> {

    override suspend fun getAll(limit: Int) = dao.getAll(limit).map(ModelMapper::toGamesModel)

    override suspend fun remove(timeStamp: Long) {
        dao.delete(timeStamp)
    }
}