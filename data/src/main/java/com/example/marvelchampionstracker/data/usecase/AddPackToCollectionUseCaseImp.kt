package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import com.example.marvelchampionstracker.domain.repository.PacksRepository
import com.example.marvelchampionstracker.domain.usecase.AddPackToCollectionUseCase
import javax.inject.Inject

class AddPackToCollectionUseCaseImp @Inject constructor(
    private val collectionRepository: CollectionRepository,
    private val packsRepository: PacksRepository
) : AddPackToCollectionUseCase {

    override suspend fun invoke(code: String) {
        val pack = packsRepository.get(code)
        collectionRepository.addPack(pack)
    }
}