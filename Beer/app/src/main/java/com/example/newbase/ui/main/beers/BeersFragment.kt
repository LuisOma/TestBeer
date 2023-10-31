package com.example.newbase.ui.main.beers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newbase.R
import com.example.newbase.core.entity.Resource
import com.example.newbase.data.entities.beer.BeerResults
import com.example.newbase.databinding.FragmentBeersBinding
import com.example.newbase.ui.main.adapter.BeerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BeersFragment : Fragment(), BeerAdapter.itemClickListener {

    private val viewModel: BeersViewModel by activityViewModels()
    private var binding: FragmentBeersBinding? = null
    private val beerAdapter: BeerAdapter by lazy {
        BeerAdapter(requireContext(), arrayListOf()).apply {
            setItemListener(this@BeersFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBeersBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()
        initObservers()
    }

    private fun setUpView() {
        binding?.beerRv?.let {
            it.apply {
                val gridLayoutManager = GridLayoutManager(requireContext(), 2)
                gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
                    override fun getSpanSize(position: Int): Int {
                        val viewType = adapter?.getItemViewType(position)
                        return if (viewType == 1) 1
                        else 2
                    }
                }
                layoutManager = gridLayoutManager
                setHasFixedSize(true)
                adapter = beerAdapter
            }
        }

        binding?.beerRv?.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                if (dy > 0) {
                    binding?.fabScroll?.show()
                } else {
                    binding?.fabScroll?.hide()
                }
                super.onScrolled(recyclerView, dx, dy)
            }
        })

        binding?.fabScroll?.setOnClickListener { view ->
            binding?.beerRv?.post {
                binding?.beerRv?.smoothScrollToPosition(0)
            }
        }

        binding?.beerSv?.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                beerAdapter.filter.filter(newText)
                return false
            }
        })
    }

    private fun initObservers() {
        viewModel.beers.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Resource.Status.SUCCESS -> {
                    binding?.progressBar?.visibility = View.GONE
                    if(!it.data.isNullOrEmpty()) beerAdapter.addItems(it.data)
                }
                Resource.Status.ERROR ->
                    Toast.makeText(requireContext(), it.message, Toast.LENGTH_SHORT).show()
                Resource.Status.LOADING ->
                    binding?.progressBar?.visibility = View.VISIBLE
            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onItemClicked(beer: BeerResults) {
        viewModel.selectedBeer = beer
        viewModel.navController?.navigate(R.id.action_beerFragment_to_beerDetailFragment)
    }

}
