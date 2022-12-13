package com.example.marvelchampionstracker.database.game

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface GameDao {

    @Query("SELECT * FROM GameEntity ORDER BY timeStamp DESC LIMIT :limit")
    fun getAll(limit: Int): Flow<List<GameEntity>>

    @Insert
    suspend fun insert(entity: GameEntity)
}
