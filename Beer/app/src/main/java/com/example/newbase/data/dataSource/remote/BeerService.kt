package com.example.newbase.data.dataSource.remote

import com.example.newbase.data.entities.beer.BeerResults
import retrofit2.Response
import retrofit2.http.GET

interface BeerService {
    @GET("v2/beers?page=1")
    suspend fun getBeerList(): Response<List<BeerResults>>
}
