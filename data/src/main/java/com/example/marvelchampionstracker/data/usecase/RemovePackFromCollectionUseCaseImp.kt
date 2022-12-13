package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import com.example.marvelchampionstracker.domain.usecase.RemovePackFromCollectionUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemovePackFromCollectionUseCaseImp @Inject constructor(
    private val collectionRepository: CollectionRepository<Flow<CollectionModel>>
) : RemovePackFromCollectionUseCase {

    override suspend fun invoke(code: String) {
        collectionRepository.removePack(code)
    }
}