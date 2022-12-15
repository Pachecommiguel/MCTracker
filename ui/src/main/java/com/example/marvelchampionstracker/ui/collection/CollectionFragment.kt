package com.example.marvelchampionstracker.ui.collection

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.marvelchampionstracker.app.databinding.FragmentCollectionBinding
import com.example.marvelchampionstracker.domain.model.CollectionModel
import com.example.marvelchampionstracker.ui.common.AbstractBaseFragment
import com.example.marvelchampionstracker.ui.common.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CollectionFragment : AbstractBaseFragment<CollectionModel>() {

    override val viewModel: BaseViewModel<CollectionModel> by viewModels<CollectionViewModel>()
    private lateinit var binding: FragmentCollectionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCollectionBinding.inflate(inflater)
        return binding.root
    }

    override fun onState(state: CollectionModel) {
        Log.e("state ->  ", state.toString())
    }
}