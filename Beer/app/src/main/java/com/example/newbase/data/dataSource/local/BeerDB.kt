package com.example.newbase.data.dataSource.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.newbase.data.dataSource.local.dao.BeerDao
import com.example.newbase.data.entities.beer.BeerResults

@Database(entities = [BeerResults::class], version = 1)
abstract class BeerDB : RoomDatabase() {
    abstract fun beerDao(): BeerDao
}

object DatabaseBuilder {
    private var INSTANCE: BeerDB? = null

    fun getInstance(): BeerDB {
        return INSTANCE ?: throw IllegalStateException("Database not initialized!")
    }

    fun initDB(context: Context){
        synchronized(BeerDB::class) {
            if (INSTANCE == null) {
                INSTANCE = buildRoomDB(context)
            }
        }
    }

    private fun buildRoomDB(context: Context) =
        Room.databaseBuilder(
            context.applicationContext,
            BeerDB::class.java,
            "my-database"
        ).build()
}