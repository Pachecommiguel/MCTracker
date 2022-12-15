package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import com.example.marvelchampionstracker.domain.usecase.GetCollectionUseCase
import javax.inject.Inject

class GetCollectionUseCaseImp @Inject constructor(
    private val repository: CollectionRepository
) : GetCollectionUseCase {

    override suspend fun invoke() = repository.getAll()
}