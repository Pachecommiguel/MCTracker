package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import com.example.marvelchampionstracker.domain.repository.PacksRepository
import com.example.marvelchampionstracker.domain.usecase.GetAvailablePacksUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAvailablePacksUseCaseImp @Inject constructor(
    private val packsRepository: PacksRepository,
    private val collectionRepository: CollectionRepository<Flow<CollectionModel>>
) : GetAvailablePacksUseCase {

    override suspend fun invoke() = packsRepository.getSize() - collectionRepository.getSize()
}