package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.repository.CollectionRepository
import com.example.marvelchampionstracker.domain.usecase.GetCollectionUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCollectionUseCaseImp @Inject constructor(
    private val repository: CollectionRepository<Flow<CollectionModel>>
) : GetCollectionUseCase<Flow<@JvmSuppressWildcards CollectionModel>> {

    override suspend fun invoke() = repository.getAll()
}