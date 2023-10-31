package com.example.newbase.data.repo

import androidx.lifecycle.liveData
import com.example.newbase.core.entity.Resource
import com.example.newbase.data.dataSource.local.DatabaseBuilder
import com.example.newbase.data.dataSource.remote.BeerRemoteDataSource
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class BeerRepository @Inject constructor(
    private val beerRemoteDataSource: BeerRemoteDataSource
) {
    private fun getBeers() = liveData(Dispatchers.IO) {
        val responseStatus = beerRemoteDataSource.getBeers()
        if (responseStatus.status == Resource.Status.SUCCESS) {
            responseStatus.data?.let { beers ->
                DatabaseBuilder.getInstance().beerDao().insertAll(beers)
            }
            emit(Resource(Resource.Status.SUCCESS,responseStatus.data,""))
        } else if (responseStatus.status == Resource.Status.ERROR) {
            emit(Resource.error(responseStatus.message!!))
        }
    }

    fun getBeersLocal() = liveData(Dispatchers.IO) {
        val responseStatus = DatabaseBuilder.getInstance().beerDao().getAllBeers()
        if (responseStatus.isEmpty()) {
            emitSource(getBeers())
        } else {
            emit(Resource(Resource.Status.SUCCESS,responseStatus, ""))
        }
    }
}
