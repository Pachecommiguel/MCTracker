package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import com.example.marvelchampionstracker.domain.usecase.RemovePackFromCollectionUseCase
import javax.inject.Inject

class RemovePackFromCollectionUseCaseImp @Inject constructor(
    private val collectionRepository: CollectionRepository
) : RemovePackFromCollectionUseCase {

    override suspend fun invoke(code: String) {
        collectionRepository.removePack(code)
    }
}