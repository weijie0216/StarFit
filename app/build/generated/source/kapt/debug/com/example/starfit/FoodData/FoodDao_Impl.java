package com.example.starfit.FoodData;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodDao_Impl implements FoodDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Food> __insertionAdapterOfFood;

  private final EntityDeletionOrUpdateAdapter<Food> __deletionAdapterOfFood;

  private final EntityDeletionOrUpdateAdapter<Food> __updateAdapterOfFood;

  public FoodDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFood = new EntityInsertionAdapter<Food>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `feeling` (`id`,`mode`,`remaks`,`Created_at`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Food value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getMode());
        if (value.getRemaks() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRemaks());
        }
        stmt.bindLong(4, value.getCreated_at());
      }
    };
    this.__deletionAdapterOfFood = new EntityDeletionOrUpdateAdapter<Food>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `feeling` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Food value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfFood = new EntityDeletionOrUpdateAdapter<Food>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `feeling` SET `id` = ?,`mode` = ?,`remaks` = ?,`Created_at` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Food value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getMode());
        if (value.getRemaks() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRemaks());
        }
        stmt.bindLong(4, value.getCreated_at());
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object insertFeeling(final Food food, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFood.insert(food);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteFeeling(final Food food, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFood.handle(food);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateFeeling(final Food food, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFood.handle(food);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Food>> getAllRecords() {
    final String _sql = "Select * From feeling";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"feeling"}, false, new Callable<List<Food>>() {
      @Override
      public List<Food> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfMode = CursorUtil.getColumnIndexOrThrow(_cursor, "mode");
          final int _cursorIndexOfRemaks = CursorUtil.getColumnIndexOrThrow(_cursor, "remaks");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "Created_at");
          final List<Food> _result = new ArrayList<Food>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Food _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpMode;
            _tmpMode = _cursor.getInt(_cursorIndexOfMode);
            final String _tmpRemaks;
            _tmpRemaks = _cursor.getString(_cursorIndexOfRemaks);
            final long _tmpCreated_at;
            _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new Food(_tmpId,_tmpMode,_tmpRemaks,_tmpCreated_at);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Food getOneRecord(final int search_id) {
    final String _sql = "Select * From feeling WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, search_id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMode = CursorUtil.getColumnIndexOrThrow(_cursor, "mode");
      final int _cursorIndexOfRemaks = CursorUtil.getColumnIndexOrThrow(_cursor, "remaks");
      final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "Created_at");
      final Food _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpMode;
        _tmpMode = _cursor.getInt(_cursorIndexOfMode);
        final String _tmpRemaks;
        _tmpRemaks = _cursor.getString(_cursorIndexOfRemaks);
        final long _tmpCreated_at;
        _tmpCreated_at = _cursor.getLong(_cursorIndexOfCreatedAt);
        _result = new Food(_tmpId,_tmpMode,_tmpRemaks,_tmpCreated_at);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
