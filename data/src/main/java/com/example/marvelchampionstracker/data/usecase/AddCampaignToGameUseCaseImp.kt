package com.example.marvelchampionstracker.data.usecase

import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.repository.GamesRepository
import com.example.marvelchampionstracker.domain.usecase.AddCampaignToGameUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AddCampaignToGameUseCaseImp @Inject constructor(
    private val repository: GamesRepository<Flow<GamesModel>>
) : AddCampaignToGameUseCase {

    override fun invoke(isCampaign: Boolean) {
        repository.addCampaignModeToCurrentGame(isCampaign)
    }
}