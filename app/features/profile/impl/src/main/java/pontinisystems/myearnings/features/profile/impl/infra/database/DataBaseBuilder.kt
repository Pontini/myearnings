package pontinisystems.myearnings.features.profile.impl.infra.database

import androidx.room.Database
import androidx.room.RoomDatabase
import pontinisystems.myearnings.features.profile.impl.infra.database.DataBaseBuilder.Companion.DB_VERSION
import pontinisystems.myearnings.features.profile.impl.infra.database.dao.ProfileDao
import pontinisystems.myearnings.features.profile.impl.infra.database.entities.ProfileEntity


@Database(entities = [ProfileEntity::class], version = DB_VERSION)
abstract class DataBaseBuilder : RoomDatabase() {
    abstract fun profileDao(): ProfileDao

    companion object {
        const val DB_VERSION = 10
        const val DB_NAME = "profile"
    }
}