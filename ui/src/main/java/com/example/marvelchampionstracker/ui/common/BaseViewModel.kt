package com.example.marvelchampionstracker.ui.common

interface BaseViewModel<T> {
    fun getState(
        onState: (state: T) -> Unit,
        onError: (messageId: Int) -> Unit
    )
}