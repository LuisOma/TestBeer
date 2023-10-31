package com.example.newbase.data.dataSource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.newbase.data.entities.beer.BeerResults

@Dao
interface BeerDao {
    @Query("Select * from Beers")
    fun getAllBeers(): List<BeerResults>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(beers: List<BeerResults>)

}