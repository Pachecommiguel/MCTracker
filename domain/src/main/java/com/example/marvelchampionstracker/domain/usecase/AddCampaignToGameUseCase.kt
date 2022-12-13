package com.example.marvelchampionstracker.domain.usecase

interface AddCampaignToGameUseCase {
    operator fun invoke(isCampaign: Boolean)
}