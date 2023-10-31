package com.example.newbase.ui.main.beers

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.newbase.data.entities.beer.BeerResults
import com.example.newbase.domain.useCase.GetBeerUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BeersViewModel @Inject constructor(
    getBeerUseCase: GetBeerUseCase
): ViewModel() {
    var navController: NavController? = null
    val beers = getBeerUseCase.getAllBeers()
    var selectedBeer: BeerResults? = null
}