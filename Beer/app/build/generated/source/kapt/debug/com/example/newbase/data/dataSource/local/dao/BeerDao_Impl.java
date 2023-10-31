package com.example.newbase.data.dataSource.local.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.newbase.data.entities.beer.BeerResults;
import java.lang.Class;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BeerDao_Impl implements BeerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BeerResults> __insertionAdapterOfBeerResults;

  public BeerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBeerResults = new EntityInsertionAdapter<BeerResults>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Beers` (`id`,`name`,`tagline`,`firstBrewed`,`description`,`imageUrl`,`abv`,`ibu`,`targetFg`,`targetOg`,`ebc`,`srm`,`ph`,`attenuationLevel`,`brewersTips`,`contributedBy`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BeerResults value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getTagline() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTagline());
        }
        if (value.getFirstBrewed() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFirstBrewed());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImageUrl());
        }
        if (value.getAbv() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getAbv());
        }
        if (value.getIbu() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getIbu());
        }
        if (value.getTargetFg() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getTargetFg());
        }
        if (value.getTargetOg() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindDouble(10, value.getTargetOg());
        }
        if (value.getEbc() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getEbc());
        }
        if (value.getSrm() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindDouble(12, value.getSrm());
        }
        if (value.getPh() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindDouble(13, value.getPh());
        }
        if (value.getAttenuationLevel() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindDouble(14, value.getAttenuationLevel());
        }
        if (value.getBrewersTips() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getBrewersTips());
        }
        if (value.getContributedBy() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getContributedBy());
        }
      }
    };
  }

  @Override
  public void insertAll(final List<BeerResults> beers) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBeerResults.insert(beers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<BeerResults> getAllBeers() {
    final String _sql = "Select * from Beers";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
      final int _cursorIndexOfFirstBrewed = CursorUtil.getColumnIndexOrThrow(_cursor, "firstBrewed");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfAbv = CursorUtil.getColumnIndexOrThrow(_cursor, "abv");
      final int _cursorIndexOfIbu = CursorUtil.getColumnIndexOrThrow(_cursor, "ibu");
      final int _cursorIndexOfTargetFg = CursorUtil.getColumnIndexOrThrow(_cursor, "targetFg");
      final int _cursorIndexOfTargetOg = CursorUtil.getColumnIndexOrThrow(_cursor, "targetOg");
      final int _cursorIndexOfEbc = CursorUtil.getColumnIndexOrThrow(_cursor, "ebc");
      final int _cursorIndexOfSrm = CursorUtil.getColumnIndexOrThrow(_cursor, "srm");
      final int _cursorIndexOfPh = CursorUtil.getColumnIndexOrThrow(_cursor, "ph");
      final int _cursorIndexOfAttenuationLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "attenuationLevel");
      final int _cursorIndexOfBrewersTips = CursorUtil.getColumnIndexOrThrow(_cursor, "brewersTips");
      final int _cursorIndexOfContributedBy = CursorUtil.getColumnIndexOrThrow(_cursor, "contributedBy");
      final List<BeerResults> _result = new ArrayList<BeerResults>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BeerResults _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpTagline;
        if (_cursor.isNull(_cursorIndexOfTagline)) {
          _tmpTagline = null;
        } else {
          _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
        }
        final String _tmpFirstBrewed;
        if (_cursor.isNull(_cursorIndexOfFirstBrewed)) {
          _tmpFirstBrewed = null;
        } else {
          _tmpFirstBrewed = _cursor.getString(_cursorIndexOfFirstBrewed);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        final Double _tmpAbv;
        if (_cursor.isNull(_cursorIndexOfAbv)) {
          _tmpAbv = null;
        } else {
          _tmpAbv = _cursor.getDouble(_cursorIndexOfAbv);
        }
        final Double _tmpIbu;
        if (_cursor.isNull(_cursorIndexOfIbu)) {
          _tmpIbu = null;
        } else {
          _tmpIbu = _cursor.getDouble(_cursorIndexOfIbu);
        }
        final Integer _tmpTargetFg;
        if (_cursor.isNull(_cursorIndexOfTargetFg)) {
          _tmpTargetFg = null;
        } else {
          _tmpTargetFg = _cursor.getInt(_cursorIndexOfTargetFg);
        }
        final Double _tmpTargetOg;
        if (_cursor.isNull(_cursorIndexOfTargetOg)) {
          _tmpTargetOg = null;
        } else {
          _tmpTargetOg = _cursor.getDouble(_cursorIndexOfTargetOg);
        }
        final Integer _tmpEbc;
        if (_cursor.isNull(_cursorIndexOfEbc)) {
          _tmpEbc = null;
        } else {
          _tmpEbc = _cursor.getInt(_cursorIndexOfEbc);
        }
        final Double _tmpSrm;
        if (_cursor.isNull(_cursorIndexOfSrm)) {
          _tmpSrm = null;
        } else {
          _tmpSrm = _cursor.getDouble(_cursorIndexOfSrm);
        }
        final Double _tmpPh;
        if (_cursor.isNull(_cursorIndexOfPh)) {
          _tmpPh = null;
        } else {
          _tmpPh = _cursor.getDouble(_cursorIndexOfPh);
        }
        final Double _tmpAttenuationLevel;
        if (_cursor.isNull(_cursorIndexOfAttenuationLevel)) {
          _tmpAttenuationLevel = null;
        } else {
          _tmpAttenuationLevel = _cursor.getDouble(_cursorIndexOfAttenuationLevel);
        }
        final String _tmpBrewersTips;
        if (_cursor.isNull(_cursorIndexOfBrewersTips)) {
          _tmpBrewersTips = null;
        } else {
          _tmpBrewersTips = _cursor.getString(_cursorIndexOfBrewersTips);
        }
        final String _tmpContributedBy;
        if (_cursor.isNull(_cursorIndexOfContributedBy)) {
          _tmpContributedBy = null;
        } else {
          _tmpContributedBy = _cursor.getString(_cursorIndexOfContributedBy);
        }
        _item = new BeerResults(_tmpId,_tmpName,_tmpTagline,_tmpFirstBrewed,_tmpDescription,_tmpImageUrl,_tmpAbv,_tmpIbu,_tmpTargetFg,_tmpTargetOg,_tmpEbc,_tmpSrm,_tmpPh,_tmpAttenuationLevel,_tmpBrewersTips,_tmpContributedBy);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
