package pontinisystems.myearnings.features.share.publicAndroid.data.database.dao

import androidx.room.*
import pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.StockEntity
import pontinisystems.myearnings.features.share.publicAndroid.data.database.relations.StockWithEarningsEntity

@Dao
interface StockDao {
    @Transaction
    @Query("SELECT * FROM `stock`")
    suspend fun selectAll():List<StockEntity>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: StockEntity): Long

    @Delete
    suspend fun delete(data: StockEntity)

    @Transaction
    @Query("SELECT * FROM earning")
    suspend fun getStockWithEarnings(): List<StockWithEarningsEntity>

}