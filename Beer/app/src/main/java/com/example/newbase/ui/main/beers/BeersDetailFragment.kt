package com.example.newbase.ui.main.beers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.newbase.databinding.FragmentBeerDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BeersDetailFragment : Fragment() {

    private val viewModel: BeersViewModel by activityViewModels()
    private var binding: FragmentBeerDetailBinding? = null
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBeerDetailBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()
    }

    private fun setUpView() {
        binding?.name?.setVisibilityAndText(viewModel.selectedBeer?.name)
        binding?.tagline?.setVisibilityAndText(viewModel.selectedBeer?.tagline)
        binding?.abv?.setVisibilityAndText("${viewModel.selectedBeer?.abv}% alcohol")
        binding?.ibu?.setVisibilityAndText("${viewModel.selectedBeer?.ibu} bitterness")
        binding?.ph?.setVisibilityAndText("${viewModel.selectedBeer?.ph} ph")
        binding?.intensity?.setVisibilityAndText("${viewModel.selectedBeer?.ebc} intensity")
        binding?.contribution?.setVisibilityAndText("Contributed by: ${viewModel.selectedBeer?.contributedBy}")

        val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
        binding?.let {
            Glide.with(requireActivity()).load(viewModel.selectedBeer?.imageUrl).apply(requestOptions).into(
                it.image)
        }
        binding?.descriptionValue?.text = viewModel.selectedBeer?.description
        binding?.tipsValue?.text = viewModel.selectedBeer?.brewersTips
    }

    private fun View.setVisibilityAndText(text: String?) {
        this.visibility = if (text.isNullOrBlank() || text.contains("null")) View.GONE else View.VISIBLE
        if (text != null) {
            when (this) {
                is TextView -> this.text = text
            }
        }
    }
}