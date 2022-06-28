package pontinisystems.myearnings.features.share.impl.data.database.dao

import androidx.room.*
import pontinisystems.myearnings.features.share.impl.data.database.entities.ProfileEntity

@Dao
interface ProfileDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: ProfileEntity): Long

    @Delete
    suspend fun delete(data: ProfileEntity)
}