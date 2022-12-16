package com.example.marvelchampionstracker.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvelchampionstracker.app.R
import com.example.marvelchampionstracker.domain.usecase.GetAvailablePacksUseCase
import com.example.marvelchampionstracker.domain.usecase.GetGamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getGamesUseCase: GetGamesUseCase,
    private val getAvailablePacksUseCase: GetAvailablePacksUseCase
) : ViewModel() {

    var state = MutableStateFlow(HomeState()); private set

    init {
        getGames()
        getAvailablePacks()
    }

    private fun getGames() {
        viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
            state.value = state.value.copy(messageId = R.string.home_snackbar_message_games)
        }) {
            getGamesUseCase(LAST_GAMES).collect {
                state.value = state.value.copy(gamesModel = it)
            }
        }
    }

    private fun getAvailablePacks() {
        viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
            state.value = state.value.copy(messageId = R.string.home_snackbar_message_packs)
        }) {
            state.value = state.value.copy(packsAvailable = getAvailablePacksUseCase())
        }
    }

    companion object {
        private const val LAST_GAMES = 5
    }
}
