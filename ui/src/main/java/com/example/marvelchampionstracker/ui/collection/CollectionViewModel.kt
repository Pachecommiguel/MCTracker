package com.example.marvelchampionstracker.ui.collection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marvelchampionstracker.app.R
import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.domain.usecase.GetCollectionUseCase
import com.example.marvelchampionstracker.ui.common.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CollectionViewModel @Inject constructor(
    private val getCollectionUseCase: GetCollectionUseCase
) : ViewModel(), BaseViewModel<CollectionModel> {

    override fun getState(
        onState: (state: CollectionModel) -> Unit,
        onError: (messageId: Int) -> Unit
    ) {
        viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
            onError(R.string.collection_snackbar_message)
        }) {
            getCollectionUseCase().collect {
                onState(it)
            }
        }
    }
}