package com.example.newbase.domain.useCase

import com.example.newbase.data.repo.BeerRepository
import javax.inject.Inject

class GetBeerUseCase @Inject constructor(
    private val beerRepository: BeerRepository
) {
    fun getAllBeers() = beerRepository.getBeersLocal()
}