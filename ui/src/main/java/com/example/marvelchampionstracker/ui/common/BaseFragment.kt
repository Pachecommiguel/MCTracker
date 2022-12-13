package com.example.marvelchampionstracker.ui.common

interface BaseFragment<T> {
    fun onState(state: T)
}