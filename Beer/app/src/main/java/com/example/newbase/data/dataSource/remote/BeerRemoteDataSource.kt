package com.example.newbase.data.dataSource.remote

import javax.inject.Inject

class BeerRemoteDataSource @Inject constructor(
    private val beerService: BeerService
): BaseRemoteDataSource() {
    suspend fun getBeers() = getResult { beerService.getBeerList() }
}