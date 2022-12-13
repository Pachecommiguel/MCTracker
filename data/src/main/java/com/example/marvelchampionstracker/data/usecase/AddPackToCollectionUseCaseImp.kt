package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import com.example.marvelchampionstracker.domain.repository.PacksRepository
import com.example.marvelchampionstracker.domain.usecase.AddPackToCollectionUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddPackToCollectionUseCaseImp @Inject constructor(
    private val collectionRepository: CollectionRepository<Flow<CollectionModel>>,
    private val packsRepository: PacksRepository
) : AddPackToCollectionUseCase {

    override suspend fun invoke(code: String) {
        val pack = packsRepository.get(code)
        collectionRepository.addPack(pack)
    }
}