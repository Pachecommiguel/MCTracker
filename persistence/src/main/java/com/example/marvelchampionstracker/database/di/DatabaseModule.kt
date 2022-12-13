package com.example.marvelchampionstracker.database.di

import android.content.Context
import androidx.room.Room
import com.example.marvelchampionstracker.database.Database
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) = Room
        .databaseBuilder(context, Database::class.java, Database.DATABASE_NAME)
        .fallbackToDestructiveMigration()
        .build()
}