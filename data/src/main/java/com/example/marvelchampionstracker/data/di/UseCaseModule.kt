package com.example.marvelchampionstracker.data.di

import com.example.marvelchampionstracker.data.usecase.GetAvailablePacksUseCaseImp
import com.example.marvelchampionstracker.data.usecase.GetCollectionUseCaseImp
import com.example.marvelchampionstracker.data.usecase.GetGamesUseCaseImp
import com.example.marvelchampionstracker.data.usecase.GetPacksUseCaseImp
import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.usecase.GetAvailablePacksUseCase
import com.example.marvelchampionstracker.domain.usecase.GetCollectionUseCase
import com.example.marvelchampionstracker.domain.usecase.GetGamesUseCase
import com.example.marvelchampionstracker.domain.usecase.GetPacksUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class  UseCaseModule {

    @Singleton
    @Binds
    abstract fun bindGetGamesUseCase(useCase: GetGamesUseCaseImp): GetGamesUseCase<Flow<GamesModel>>

    @Singleton
    @Binds
    abstract fun bindGetCollectionUseCase(useCase: GetCollectionUseCaseImp): GetCollectionUseCase<Flow<CollectionModel>>

    @Singleton
    @Binds
    abstract fun bindGetPacksUseCase(useCase: GetPacksUseCaseImp): GetPacksUseCase

    @Singleton
    @Binds
    abstract fun bindGetAvailablePacksUseCase(useCase: GetAvailablePacksUseCaseImp): GetAvailablePacksUseCase
}