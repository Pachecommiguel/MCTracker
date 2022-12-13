package com.example.marvelchampionstracker.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.marvelchampionstracker.app.databinding.FragmentHomeBinding
import com.example.marvelchampionstracker.ui.common.AbstractBaseFragment
import com.example.marvelchampionstracker.ui.common.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : AbstractBaseFragment<HomeState>() {

    override val viewModel: BaseViewModel<HomeState> by viewModels<HomeViewModel>()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initViews()
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onState(state: HomeState) {
        Log.e("games ", state.games.toString())
        Log.e("packs ", state.availablePacks.toString())
    }

    private fun initViews() {
    }
}