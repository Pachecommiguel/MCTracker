package com.example.marvelchampionstracker.di.data

import com.example.marvelchampionstracker.data.usecase.*
import com.example.marvelchampionstracker.domain.usecase.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class  UseCaseModule {

    @Singleton
    @Binds
    abstract fun bindGetGamesUseCase(useCase: GetGamesUseCaseImp): GetGamesUseCase

    @Singleton
    @Binds
    abstract fun bindGetCollectionUseCase(useCase: GetCollectionUseCaseImp): GetCollectionUseCase

    @Singleton
    @Binds
    abstract fun bindAddPackToCollectionUseCase(useCase: AddPackToCollectionUseCaseImp): AddPackToCollectionUseCase

    @Singleton
    @Binds
    abstract fun bindGetPacksUseCase(useCase: GetPacksUseCaseImp): GetPacksUseCase

    @Singleton
    @Binds
    abstract fun bindGetAvailablePacksUseCase(useCase: GetAvailablePacksUseCaseImp): GetAvailablePacksUseCase

    @Singleton
    @Binds
    abstract fun bindRemovePackFromCollectionUseCase(useCase: RemovePackFromCollectionUseCaseImp): RemovePackFromCollectionUseCase

    @Singleton
    @Binds
    abstract fun bindGetHeroesUseCase(useCase: GetHeroesUseCaseImp): GetHeroesUseCase
}