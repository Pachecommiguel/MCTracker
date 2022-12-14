package com.example.marvelchampionstracker.di.network

import com.example.marvelchampionstracker.network.card.CardService
import com.example.marvelchampionstracker.network.pack.PackService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Singleton
    @Provides
    fun providePacksService(client: Retrofit): PackService = client.create(PackService::class.java)

    @Singleton
    @Provides
    fun provideCardsService(client: Retrofit): CardService = client.create(CardService::class.java)
}