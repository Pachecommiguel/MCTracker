package com.example.marvelchampionstracker.data.di

import com.example.marvelchampionstracker.data.usecase.*
import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.usecase.*
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
    abstract fun bindGetCollectionUseCase(
        useCase: GetCollectionUseCaseImp
    ): GetCollectionUseCase<Flow<CollectionModel>>

    @Singleton
    @Binds
    abstract fun bindAddPackToCollectionUseCase(
        useCase: AddPackToCollectionUseCaseImp
    ): AddPackToCollectionUseCase

    @Singleton
    @Binds
    abstract fun bindGetPacksUseCase(useCase: GetPacksUseCaseImp): GetPacksUseCase

    @Singleton
    @Binds
    abstract fun bindGetAvailablePacksUseCase(
        useCase: GetAvailablePacksUseCaseImp
    ): GetAvailablePacksUseCase

    @Singleton
    @Binds
    abstract fun bindRemovePackFromCollectionUseCase(
        useCase: RemovePackFromCollectionUseCaseImp
    ): RemovePackFromCollectionUseCase

    @Singleton
    @Binds
    abstract fun bindRemoveGameUseCase(useCase: RemoveGameUseCaseImp): RemoveGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddPlayerToGameUseCase(
        useCase: AddPlayerToGameUseCaseImp
    ): AddPlayerToGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddGameUseCase(useCase: AddGameUseCaseImp): AddGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddHeroToGameUseCase(useCase: AddHeroToGameUseCaseImp): AddHeroToGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddHeroKOToGameUseCase(
        useCase: AddHeroKOToGameUseCaseImp
    ): AddHeroKOToGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddAspectToGameUseCase(
        useCase: AddAspectToGameUseCaseImp
    ): AddAspectToGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddDeckTypeToGameUseCase(
        useCase: AddDeckTypeToGameUseCaseImp
    ): AddDeckTypeToGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddCampaignToGameUseCase(
        useCase: AddCampaignToGameUseCaseImp
    ): AddCampaignToGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddVillainToGameUseCase(
        useCase: AddVillainToGameUseCaseImp
    ): AddVillainToGameUseCase
}