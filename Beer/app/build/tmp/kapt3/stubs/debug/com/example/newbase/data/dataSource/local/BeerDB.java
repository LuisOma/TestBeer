package com.example.newbase.data.dataSource.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.newbase.data.dataSource.local.dao.BeerDao;
import com.example.newbase.data.entities.beer.BeerResults;

@androidx.room.Database(entities = {com.example.newbase.data.entities.beer.BeerResults.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/newbase/data/dataSource/local/BeerDB;", "Landroidx/room/RoomDatabase;", "()V", "beerDao", "Lcom/example/newbase/data/dataSource/local/dao/BeerDao;", "app_debug"})
public abstract class BeerDB extends androidx.room.RoomDatabase {
    
    public BeerDB() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.newbase.data.dataSource.local.dao.BeerDao beerDao();
}