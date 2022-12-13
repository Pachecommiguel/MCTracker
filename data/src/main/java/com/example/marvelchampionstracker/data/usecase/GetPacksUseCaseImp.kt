package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.PacksRepository
import com.example.marvelchampionstracker.domain.usecase.GetPacksUseCase
import javax.inject.Inject

class GetPacksUseCaseImp @Inject constructor(
    private val repository: PacksRepository
) : GetPacksUseCase {

    override suspend fun invoke() = repository.getAll()
}