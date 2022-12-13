package com.example.marvelchampionstracker.database.pack

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PackEntity(
    @PrimaryKey val code: String,
    val name: String
)