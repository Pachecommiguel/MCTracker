package com.example.marvelchampionstracker.data.repository

import com.example.marvelchampionstracker.data.utils.EntityMapper
import com.example.marvelchampionstracker.database.game.GameDao
import com.example.marvelchampionstracker.data.utils.ModelMapper
import com.example.marvelchampionstracker.database.game.GameEntity
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

    private lateinit var game: GameEntity

    override suspend fun getAll(limit: Int) = dao.getAll(limit).map(ModelMapper::toGamesModel)

    override suspend fun remove(timeStamp: Long) {
        dao.delete(timeStamp)
    }

    override fun addPlayer(name: String) {
        val entity = EntityMapper.toPlayerEntity(name)
        game.playersSet.add(entity)
    }

    override fun createGame(timeStamp: Long) {
        game = EntityMapper.toGameEntity(timeStamp)
    }

    override fun addHero(name: String) {
        game.playersSet.last().heroName = name
    }

    override fun addHeroKO(isKO: Boolean) {
        game.playersSet.last().isHeroKO = isKO
    }

    override fun addAspect(aspect: String) {
        game.playersSet.last().aspectsSet.add(aspect)
    }

    override fun addDeckType(type: String) {
        game.playersSet.last().deckType = type
    }

    override fun addCampaign(isCampaign: Boolean) {
        game.isCampaign = isCampaign
    }

    override fun addVillain(name: String) {
        game.villain = name
    }

    override fun addEncounterSet(name: String) {
        game.encountersSet.add(name)
    }
}