package com.example.marvelchampionstracker.domain.usecase

import com.example.marvelchampionstracker.domain.model.PacksModel

interface GetPacksUseCase {
    suspend operator fun invoke(): PacksModel
}