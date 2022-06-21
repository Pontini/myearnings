package pontinisystems.myearnings.features.share.impl.infra.database.dao

import androidx.room.*
import pontinisystems.myearnings.features.share.impl.infra.database.entities.ProfileEntity

@Dao
interface ProfileDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: ProfileEntity): Long

    @Delete
    suspend fun delete(data: ProfileEntity)
}