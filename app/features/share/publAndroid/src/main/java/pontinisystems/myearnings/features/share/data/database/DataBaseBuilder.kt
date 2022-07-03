package pontinisystems.myearnings.features.share.impl.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import pontinisystems.myearnings.features.share.impl.data.database.DataBaseBuilder.Companion.DB_VERSION
import pontinisystems.myearnings.features.share.data.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.data.database.dao.StockDao
import pontinisystems.myearnings.features.share.data.database.entities.EarningEntity
import pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity
import pontinisystems.myearnings.features.share.data.database.entities.StockEntity


@Database(entities = [StockEntity::class, EarningEntity::class, ProfileEntity::class], version = DB_VERSION)
abstract class DataBaseBuilder : RoomDatabase() {
    abstract fun stockDao(): StockDao
    abstract fun profileDao(): ProfileDao

    companion object {
        const val DB_VERSION = 500
    }
}