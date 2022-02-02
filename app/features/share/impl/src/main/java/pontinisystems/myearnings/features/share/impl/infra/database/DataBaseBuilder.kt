package pontinisystems.myearnings.features.share.impl.infra.database

import androidx.room.Database
import androidx.room.RoomDatabase
import pontinisystems.myearnings.features.share.impl.infra.database.DataBaseBuilder.Companion.DB_VERSION
import pontinisystems.myearnings.features.share.impl.infra.database.dao.StockDao
import pontinisystems.myearnings.features.share.impl.infra.database.entities.EarningEntity
import pontinisystems.myearnings.features.share.impl.infra.database.entities.StockEntity


@Database(entities = [StockEntity::class, EarningEntity::class,], version = DB_VERSION)
abstract class DataBaseBuilder : RoomDatabase() {
    abstract fun stockDao(): StockDao

    companion object {
        const val DB_VERSION = 300
    }
}