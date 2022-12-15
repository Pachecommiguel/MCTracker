package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddCampaignModeToCurrentGameUseCase
import javax.inject.Inject

class AddCampaignModeToCurrentGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository
) : AddCampaignModeToCurrentGameUseCase {

    override fun invoke(isCampaign: Boolean) {
        repository.addCampaignModeToCurrentGame(isCampaign)
    }
}