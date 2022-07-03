package pontinisystems.myearnings.features.share.impl.data.database;

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
import pontinisystems.myearnings.features.share.publicAndroid.data.database.dao.ProfileDao;
import pontinisystems.myearnings.features.share.publicAndroid.data.database.dao.ProfileDao_Impl;
import pontinisystems.myearnings.features.share.publicAndroid.data.database.dao.StockDao;
import pontinisystems.myearnings.features.share.publicAndroid.data.database.dao.StockDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DataBaseBuilder_Impl extends DataBaseBuilder {
  private volatile StockDao _stockDao;

  private volatile ProfileDao _profileDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(500) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `stock` (`id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `earning` (`id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `profile` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `lastName` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '448f656c3a87c1d4a54fce7e2506e753')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `stock`");
        _db.execSQL("DROP TABLE IF EXISTS `earning`");
        _db.execSQL("DROP TABLE IF EXISTS `profile`");
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
        final HashMap<String, TableInfo.Column> _columnsStock = new HashMap<String, TableInfo.Column>(1);
        _columnsStock.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStock = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStock = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStock = new TableInfo("stock", _columnsStock, _foreignKeysStock, _indicesStock);
        final TableInfo _existingStock = TableInfo.read(_db, "stock");
        if (! _infoStock.equals(_existingStock)) {
          return new RoomOpenHelper.ValidationResult(false, "stock(pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.StockEntity).\n"
                  + " Expected:\n" + _infoStock + "\n"
                  + " Found:\n" + _existingStock);
        }
        final HashMap<String, TableInfo.Column> _columnsEarning = new HashMap<String, TableInfo.Column>(1);
        _columnsEarning.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEarning = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEarning = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEarning = new TableInfo("earning", _columnsEarning, _foreignKeysEarning, _indicesEarning);
        final TableInfo _existingEarning = TableInfo.read(_db, "earning");
        if (! _infoEarning.equals(_existingEarning)) {
          return new RoomOpenHelper.ValidationResult(false, "earning(pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.EarningEntity).\n"
                  + " Expected:\n" + _infoEarning + "\n"
                  + " Found:\n" + _existingEarning);
        }
        final HashMap<String, TableInfo.Column> _columnsProfile = new HashMap<String, TableInfo.Column>(3);
        _columnsProfile.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfile.put("lastName", new TableInfo.Column("lastName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProfile = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProfile = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProfile = new TableInfo("profile", _columnsProfile, _foreignKeysProfile, _indicesProfile);
        final TableInfo _existingProfile = TableInfo.read(_db, "profile");
        if (! _infoProfile.equals(_existingProfile)) {
          return new RoomOpenHelper.ValidationResult(false, "profile(pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.ProfileEntity).\n"
                  + " Expected:\n" + _infoProfile + "\n"
                  + " Found:\n" + _existingProfile);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "448f656c3a87c1d4a54fce7e2506e753", "8134e4929a648c1615e8e05b212e7ab8");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "stock","earning","profile");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `stock`");
      _db.execSQL("DELETE FROM `earning`");
      _db.execSQL("DELETE FROM `profile`");
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
    _typeConvertersMap.put(StockDao.class, StockDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ProfileDao.class, ProfileDao_Impl.getRequiredConverters());
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
  public StockDao stockDao() {
    if (_stockDao != null) {
      return _stockDao;
    } else {
      synchronized(this) {
        if(_stockDao == null) {
          _stockDao = new StockDao_Impl(this);
        }
        return _stockDao;
      }
    }
  }

  @Override
  public ProfileDao profileDao() {
    if (_profileDao != null) {
      return _profileDao;
    } else {
      synchronized(this) {
        if(_profileDao == null) {
          _profileDao = new ProfileDao_Impl(this);
        }
        return _profileDao;
      }
    }
  }
}
