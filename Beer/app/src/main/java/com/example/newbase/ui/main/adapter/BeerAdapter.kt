package com.example.newbase.ui.main.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.newbase.constants.Constants
import com.example.newbase.core.entity.Resource
import com.example.newbase.data.entities.beer.BeerResults
import com.example.newbase.databinding.BeerItemBinding
import com.example.newbase.databinding.NetworkStateItemBinding
import java.util.Locale

class BeerAdapter(private val context: Context, private val beerList: ArrayList<BeerResults>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(),
    Filterable {
    private var networkState: Resource.Status? = null
    private var listener: itemClickListener? = null

    var beerFilterList = ArrayList<BeerResults>()

    init {
        beerFilterList = beerList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        if (viewType == Constants.BEER_VIEW_TYPE) {
            val binding = BeerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return PokemonItemViewHolder(
                binding
            )
        } else {
            val binding = NetworkStateItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return NetworkStateItemViewHolder(
                binding
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == Constants.BEER_VIEW_TYPE) {
            (holder as PokemonItemViewHolder).bind(beerFilterList[position],context)
            holder.itemView.setOnClickListener{
                beerFilterList[position].let { it1 -> listener?.onItemClicked(it1) }
            }
        }
        else {
            (holder as NetworkStateItemViewHolder).bind(networkState)
        }
    }

    fun setItemListener(listener: itemClickListener){
        this.listener = listener
    }

    private fun hasExtraRow(): Boolean {
        return networkState != null && networkState != Resource.Status.SUCCESS
    }

    override fun getItemCount() = beerFilterList.size

    override fun getItemViewType(position: Int): Int {
        return if (hasExtraRow() && position == itemCount - 1) {
            Constants.NETWORK_VIEW_TYPE
        } else {
            Constants.BEER_VIEW_TYPE
        }
    }

    class PokemonItemViewHolder (private val binding: BeerItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(beer: BeerResults?, context: Context) {
            binding.cvBeerTitle.text = beer?.name
            val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
            Glide.with(context).load(beer?.imageUrl).apply(requestOptions).into(binding.cvIvBeerPoster)
        }
    }


    class NetworkStateItemViewHolder (private val binding: NetworkStateItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(networkState: Resource.Status?) {
            if (networkState != null && networkState == Resource.Status.LOADING) {
                binding.progressBarItem.visibility = View.VISIBLE
            }
            else  {
                binding.progressBarItem.visibility = View.GONE
            }
            if (networkState != null && networkState == Resource.Status.ERROR) {
                binding.errorMsgItem.visibility = View.VISIBLE
            }
            else {
                binding.errorMsgItem.visibility = View.GONE
            }
        }
    }

    fun addItems(list: List<BeerResults>){
        beerFilterList.clear()
        beerFilterList.addAll(list)
        notifyDataSetChanged()
    }

    interface itemClickListener{
        fun onItemClicked(beer: BeerResults)
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (charSearch.isEmpty()) {
                    beerFilterList = beerList
                } else {
                    val resultList = ArrayList<BeerResults>()
                    for (row in beerList) {
                        if (row.name?.toLowerCase(Locale.ROOT)?.contains(charSearch.toLowerCase(Locale.ROOT)) == true
                        ) {
                            resultList.add(row)
                        }
                    }
                    beerFilterList = resultList
                }
                val filterResults = FilterResults()
                filterResults.values = beerFilterList
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                beerFilterList = results?.values as ArrayList<BeerResults>
                notifyDataSetChanged()
            }
        }
    }

}