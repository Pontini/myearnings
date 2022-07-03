package pontinisystems.myearnings.features.share.publicAndroid.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.ArrayMap;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.EarningEntity;
import pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.StockEntity;
import pontinisystems.myearnings.features.share.publicAndroid.data.database.relations.StockWithEarningsEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class StockDao_Impl implements StockDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<StockEntity> __insertionAdapterOfStockEntity;

  private final EntityDeletionOrUpdateAdapter<StockEntity> __deletionAdapterOfStockEntity;

  public StockDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStockEntity = new EntityInsertionAdapter<StockEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `stock` (`id`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StockEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__deletionAdapterOfStockEntity = new EntityDeletionOrUpdateAdapter<StockEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `stock` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StockEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final StockEntity data, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfStockEntity.insertAndReturnId(data);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final StockEntity data, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStockEntity.handle(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object selectAll(final Continuation<? super List<StockEntity>> continuation) {
    final String _sql = "SELECT * FROM `stock`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<StockEntity>>() {
      @Override
      public List<StockEntity> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final List<StockEntity> _result = new ArrayList<StockEntity>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final StockEntity _item;
              final String _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getString(_cursorIndexOfId);
              }
              _item = new StockEntity(_tmpId);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getStockWithEarnings(
      final Continuation<? super List<StockWithEarningsEntity>> continuation) {
    final String _sql = "SELECT * FROM earning";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<List<StockWithEarningsEntity>>() {
      @Override
      public List<StockWithEarningsEntity> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final ArrayMap<String, ArrayList<EarningEntity>> _collectionEarnings = new ArrayMap<String, ArrayList<EarningEntity>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfId);
              ArrayList<EarningEntity> _tmpEarningsCollection = _collectionEarnings.get(_tmpKey);
              if (_tmpEarningsCollection == null) {
                _tmpEarningsCollection = new ArrayList<EarningEntity>();
                _collectionEarnings.put(_tmpKey, _tmpEarningsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipearningAspontinisystemsMyearningsFeaturesSharePublicAndroidDataDatabaseEntitiesEarningEntity(_collectionEarnings);
            final List<StockWithEarningsEntity> _result = new ArrayList<StockWithEarningsEntity>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final StockWithEarningsEntity _item;
              final StockEntity _tmpSchool;
              if (! (_cursor.isNull(_cursorIndexOfId))) {
                final String _tmpId;
                if (_cursor.isNull(_cursorIndexOfId)) {
                  _tmpId = null;
                } else {
                  _tmpId = _cursor.getString(_cursorIndexOfId);
                }
                _tmpSchool = new StockEntity(_tmpId);
              }  else  {
                _tmpSchool = null;
              }
              ArrayList<EarningEntity> _tmpEarningsCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfId);
              _tmpEarningsCollection_1 = _collectionEarnings.get(_tmpKey_1);
              if (_tmpEarningsCollection_1 == null) {
                _tmpEarningsCollection_1 = new ArrayList<EarningEntity>();
              }
              _item = new StockWithEarningsEntity(_tmpSchool,_tmpEarningsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipearningAspontinisystemsMyearningsFeaturesSharePublicAndroidDataDatabaseEntitiesEarningEntity(
      final ArrayMap<String, ArrayList<EarningEntity>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<EarningEntity>> _tmpInnerMap = new ArrayMap<String, ArrayList<EarningEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipearningAspontinisystemsMyearningsFeaturesSharePublicAndroidDataDatabaseEntitiesEarningEntity(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<EarningEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipearningAspontinisystemsMyearningsFeaturesSharePublicAndroidDataDatabaseEntitiesEarningEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id` FROM `earning` WHERE `id` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = 0;
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<EarningEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final EarningEntity _item_1;
          final String _tmpId;
          if (_cursor.isNull(_cursorIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _cursor.getString(_cursorIndexOfId);
          }
          _item_1 = new EarningEntity(_tmpId);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
