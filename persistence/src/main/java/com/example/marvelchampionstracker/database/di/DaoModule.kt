package com.example.marvelchampionstracker.database.di

import com.example.marvelchampionstracker.database.Database
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DaoModule {

    @Singleton
    @Provides
    fun providePackDao(database: Database) = database.packDao()

    @Singleton
    @Provides
    fun provideGameDao(database: Database) = database.gameDao()
}