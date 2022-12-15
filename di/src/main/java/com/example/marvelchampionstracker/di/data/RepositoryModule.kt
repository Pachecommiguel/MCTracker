package com.example.marvelchampionstracker.di.data

import com.example.marvelchampionstracker.data.repository.CardsRepositoryImp
import com.example.marvelchampionstracker.data.repository.CollectionRepositoryImp
import com.example.marvelchampionstracker.data.repository.GamesRepositoryImp
import com.example.marvelchampionstracker.data.repository.PacksRepositoryImp
import com.example.marvelchampionstracker.domain.repository.CardsRepository
import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.repository.PacksRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindGamesRepository(repository: GamesRepositoryImp): GamesRepository

    @Singleton
    @Binds
    abstract fun bindCollectionRepository(repository: CollectionRepositoryImp): CollectionRepository

    @Singleton
    @Binds
    abstract fun bindPacksRepository(repository: PacksRepositoryImp): PacksRepository

    @Singleton
    @Binds
    abstract fun bindCardsRepository(repository: CardsRepositoryImp): CardsRepository
}