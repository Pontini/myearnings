package pontinisystems.myearnings.features.share.impl.infra.database

import android.content.Context
import androidx.room.Room
import pontinisystems.myearnings.features.share.impl.infra.database.dao.StockDao

class Database(context: Context) {

    companion object {
        const val DB_NAME = "myearnings-db"
    }

    private val db = Room.databaseBuilder(context, DataBaseBuilder::class.java, DB_NAME)
        .fallbackToDestructiveMigration().build()


    fun stockDao(): StockDao {
        return db.stockDao()
    }

}