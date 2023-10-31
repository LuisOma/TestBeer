package com.example.newbase.data.dataSource.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.newbase.data.dataSource.local.dao.BeerDao;
import com.example.newbase.data.dataSource.local.dao.BeerDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BeerDB_Impl extends BeerDB {
  private volatile BeerDao _beerDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Beers` (`id` INTEGER, `name` TEXT, `tagline` TEXT, `firstBrewed` TEXT, `description` TEXT, `imageUrl` TEXT, `abv` REAL, `ibu` REAL, `targetFg` INTEGER, `targetOg` REAL, `ebc` INTEGER, `srm` REAL, `ph` REAL, `attenuationLevel` REAL, `brewersTips` TEXT, `contributedBy` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'afdb8b4809fa9abe9e9047f64a05ff9d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Beers`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBeers = new HashMap<String, TableInfo.Column>(16);
        _columnsBeers.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("tagline", new TableInfo.Column("tagline", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("firstBrewed", new TableInfo.Column("firstBrewed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("abv", new TableInfo.Column("abv", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("ibu", new TableInfo.Column("ibu", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("targetFg", new TableInfo.Column("targetFg", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("targetOg", new TableInfo.Column("targetOg", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("ebc", new TableInfo.Column("ebc", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("srm", new TableInfo.Column("srm", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("ph", new TableInfo.Column("ph", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("attenuationLevel", new TableInfo.Column("attenuationLevel", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("brewersTips", new TableInfo.Column("brewersTips", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBeers.put("contributedBy", new TableInfo.Column("contributedBy", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBeers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBeers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBeers = new TableInfo("Beers", _columnsBeers, _foreignKeysBeers, _indicesBeers);
        final TableInfo _existingBeers = TableInfo.read(_db, "Beers");
        if (! _infoBeers.equals(_existingBeers)) {
          return new RoomOpenHelper.ValidationResult(false, "Beers(com.example.newbase.data.entities.beer.BeerResults).\n"
                  + " Expected:\n" + _infoBeers + "\n"
                  + " Found:\n" + _existingBeers);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "afdb8b4809fa9abe9e9047f64a05ff9d", "6d1f15a71181d5cbfb389af206f32244");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Beers");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Beers`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(BeerDao.class, BeerDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public BeerDao beerDao() {
    if (_beerDao != null) {
      return _beerDao;
    } else {
      synchronized(this) {
        if(_beerDao == null) {
          _beerDao = new BeerDao_Impl(this);
        }
        return _beerDao;
      }
    }
  }
}