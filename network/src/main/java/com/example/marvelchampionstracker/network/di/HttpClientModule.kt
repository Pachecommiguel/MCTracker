package com.example.marvelchampionstracker.network.di

import com.example.marvelchampionstracker.network.ApiEndpoints
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HttpClientModule {

    @Singleton
    @Provides
    fun provideHttpClient(): Retrofit = Retrofit.Builder()
        .baseUrl(ApiEndpoints.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}