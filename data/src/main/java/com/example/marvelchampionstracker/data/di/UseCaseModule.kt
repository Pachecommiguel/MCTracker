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
    abstract fun bindGetCollectionUseCase(useCase: GetCollectionUseCaseImp): GetCollectionUseCase<Flow<CollectionModel>>

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
    abstract fun bindRemoveGameUseCase(useCase: RemoveGameUseCaseImp): RemoveGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddPlayerToGameUseCase(useCase: AddPlayerToCurrentGameUseCaseImp): AddPlayerToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddGameUseCase(useCase: CreateNewGameUseCaseImp): CreateNewGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddHeroToGameUseCase(useCase: AddHeroToCurrentGameUseCaseImp): AddHeroToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddHeroKOToGameUseCase(useCase: AddHeroStateToCurrentGameUseCaseImp): AddHeroStateToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddAspectToGameUseCase(useCase: AddAspectToCurrentGameUseCaseImp): AddAspectToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddDeckTypeToGameUseCase(useCase: AddDeckTypeToCurrentGameUseCaseImp): AddDeckTypeToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddCampaignToGameUseCase(useCase: AddCampaignModeToCurrentGameUseCaseImp): AddCampaignModeToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddVillainToGameUseCase(useCase: AddVillainToCurrentGameUseCaseImp): AddVillainToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddEncounterSetToGameUseCase(useCase: AddEncounterSetToCurrentGameUseCaseImp): AddEncounterSetToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddDifficultyToGameUseCase(useCase: AddDifficultyToCurrentGameUseCaseImp): AddDifficultyToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindAddResultToGameUseCase(useCase: AddResultToCurrentGameUseCaseImp): AddResultToCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindSaveCurrentGameUseCase(useCase: SaveCurrentGameUseCaseImp): SaveCurrentGameUseCase

    @Singleton
    @Binds
    abstract fun bindGetHeroesUseCase(useCase: GetHeroesUseCaseImp): GetHeroesUseCase
}