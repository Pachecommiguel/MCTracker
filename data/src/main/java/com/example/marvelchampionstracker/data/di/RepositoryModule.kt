package com.example.marvelchampionstracker.data.di

import com.example.marvelchampionstracker.data.repository.*
import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindGamesRepository(repository: GamesRepositoryImp): GamesRepository<Flow<GamesModel>>

    @Singleton
    @Binds
    abstract fun bindCollectionRepository(repository: CollectionRepositoryImp): CollectionRepository<Flow<CollectionModel>>

    @Singleton
    @Binds
    abstract fun bindPacksRepository(repository: PacksRepositoryImp): PacksRepository
}