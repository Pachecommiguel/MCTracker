package com.example.marvelchampionstracker.ui.common

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.marvelchampionstracker.app.R
import com.google.android.material.snackbar.Snackbar

abstract class AbstractBaseFragment<T> : Fragment(), BaseFragment<T> {

    protected abstract val viewModel: BaseViewModel<T>

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        initState()
    }

    private fun initState() {
        viewModel.getState(
            onState = ::onState,
            onError = ::onError
        )
    }

    private fun onError(messageId: Int) {
        Snackbar.make(requireView(), getString(messageId), Snackbar.LENGTH_INDEFINITE)
            .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
            .setAction(R.string.snackbar_action_text_got_it) {}
            .show()
    }
}