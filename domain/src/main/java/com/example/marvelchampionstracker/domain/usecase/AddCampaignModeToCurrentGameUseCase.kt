package com.example.marvelchampionstracker.domain.usecase

interface AddCampaignModeToCurrentGameUseCase {
    operator fun invoke(isCampaign: Boolean)
}