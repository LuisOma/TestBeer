package com.example.newbase.data.dataSource.local;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.newbase.data.dataSource.local.dao.BeerDao;
import com.example.newbase.data.entities.beer.BeerResults;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/newbase/data/dataSource/local/DatabaseBuilder;", "", "()V", "INSTANCE", "Lcom/example/newbase/data/dataSource/local/BeerDB;", "buildRoomDB", "context", "Landroid/content/Context;", "getInstance", "initDB", "", "app_debug"})
public final class DatabaseBuilder {
    @org.jetbrains.annotations.NotNull
    public static final com.example.newbase.data.dataSource.local.DatabaseBuilder INSTANCE = null;
    private static com.example.newbase.data.dataSource.local.BeerDB INSTANCE;
    
    private DatabaseBuilder() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.newbase.data.dataSource.local.BeerDB getInstance() {
        return null;
    }
    
    public final void initDB(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private final com.example.newbase.data.dataSource.local.BeerDB buildRoomDB(android.content.Context context) {
        return null;
    }
}