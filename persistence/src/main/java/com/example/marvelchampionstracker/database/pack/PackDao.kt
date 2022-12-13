package com.example.marvelchampionstracker.database.pack

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PackDao {

    @Query("SELECT * FROM PackEntity")
    fun getAll(): Flow<List<PackEntity>>

    @Query("SELECT COUNT(*) FROM PackEntity")
    suspend fun getSize(): Int

    @Insert
    suspend fun insert(pack: PackEntity)
}
