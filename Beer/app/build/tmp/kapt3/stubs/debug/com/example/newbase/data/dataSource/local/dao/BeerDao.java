package com.example.newbase.data.dataSource.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.newbase.data.entities.beer.BeerResults;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/newbase/data/dataSource/local/dao/BeerDao;", "", "getAllBeers", "", "Lcom/example/newbase/data/entities/beer/BeerResults;", "insertAll", "", "beers", "app_debug"})
public abstract interface BeerDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "Select * from Beers")
    public abstract java.util.List<com.example.newbase.data.entities.beer.BeerResults> getAllBeers();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.newbase.data.entities.beer.BeerResults> beers);
}