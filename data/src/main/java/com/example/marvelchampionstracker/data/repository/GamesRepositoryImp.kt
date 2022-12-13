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

    override fun addPlayerToCurrentGame(player: String) {
        val entity = EntityMapper.toPlayerEntity(player)
        game.playersSet.add(entity)
    }

    override fun createNewGame(timeStamp: Long) {
        game = EntityMapper.toGameEntity(timeStamp)
    }

    override fun addHeroToCurrentGame(hero: String) {
        game.playersSet.last().heroName = hero
    }

    override fun addHeroStateToCurrentGame(isKO: Boolean) {
        game.playersSet.last().isHeroKO = isKO
    }

    override fun addAspectToCurrentGame(aspect: String) {
        game.playersSet.last().aspectsSet.add(aspect)
    }

    override fun addDeckTypeToCurrentGame(type: String) {
        game.playersSet.last().deckType = type
    }

    override fun addCampaignModeToCurrentGame(isCampaign: Boolean) {
        game.isCampaign = isCampaign
    }

    override fun addVillainToCurrentGame(villain: String) {
        game.villain = villain
    }

    override fun addEncounterSetToCurrentGame(set: String) {
        game.encountersSet.add(set)
    }

    override fun addDifficultyToCurrentGame(difficulty: String) {
        game.difficulty = difficulty
    }

    override fun addResultToCurrentGame(result: String) {
        game.result = result
    }
}