package pontinisystems.myearnings.features.share.impl.infra.database

import androidx.room.Database
import androidx.room.RoomDatabase
import pontinisystems.myearnings.features.share.impl.infra.database.DataBaseBuilder.Companion.DB_VERSION
import pontinisystems.myearnings.features.share.impl.infra.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.impl.infra.database.dao.StockDao
import pontinisystems.myearnings.features.share.impl.infra.database.entities.EarningEntity
import pontinisystems.myearnings.features.share.impl.infra.database.entities.ProfileEntity
import pontinisystems.myearnings.features.share.impl.infra.database.entities.StockEntity


@Database(entities = [StockEntity::class, EarningEntity::class,ProfileEntity::class], version = DB_VERSION)
abstract class DataBaseBuilder : RoomDatabase() {
    abstract fun stockDao(): StockDao
    abstract fun profileDao(): ProfileDao

    companion object {
        const val DB_VERSION = 500
    }
}