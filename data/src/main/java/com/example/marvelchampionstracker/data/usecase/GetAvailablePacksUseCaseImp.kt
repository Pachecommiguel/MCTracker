package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import com.example.marvelchampionstracker.domain.repository.PacksRepository
import com.example.marvelchampionstracker.domain.usecase.GetAvailablePacksUseCase
import javax.inject.Inject

class GetAvailablePacksUseCaseImp @Inject constructor(
    private val packsRepository: PacksRepository,
    private val collectionRepository: CollectionRepository
) : GetAvailablePacksUseCase {

    override suspend fun invoke() = packsRepository.getSize() - collectionRepository.getSize()
}