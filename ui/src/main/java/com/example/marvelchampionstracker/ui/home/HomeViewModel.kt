package com.example.marvelchampionstracker.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvelchampionstracker.app.R
import com.example.marvelchampionstracker.domain.model.GamesModel
import com.example.marvelchampionstracker.domain.usecase.GetAvailablePacksUseCase
import com.example.marvelchampionstracker.domain.usecase.GetGamesUseCase
import com.example.marvelchampionstracker.ui.common.BaseViewModel
import com.example.marvelchampionstracker.ui.utils.StateMapper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getGamesUseCase: GetGamesUseCase<Flow<GamesModel>>,
    private val getAvailablePacksUseCase: GetAvailablePacksUseCase
) : ViewModel(), BaseViewModel<HomeState> {

    companion object {
        private const val LAST_GAMES = 5
    }

    override fun getState(
        onState: (state: HomeState) -> Unit,
        onError: (messageId: Int) -> Unit
    ) {
        viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
            onError(R.string.home_snackbar_message_games)
        }) {
            getGamesUseCase(LAST_GAMES).collect {
                val state = StateMapper.toHomeState(it)
                onState(state)
            }
        }

        viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
            onError(R.string.home_snackbar_message_available_packs)
        }) {
            val state = StateMapper.toHomeState(getAvailablePacksUseCase())
            onState(state)
        }
    }
}