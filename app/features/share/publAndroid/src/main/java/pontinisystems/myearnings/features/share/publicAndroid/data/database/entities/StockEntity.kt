package pontinisystems.myearnings.features.share.publicAndroid.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stock")
data class StockEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String,

)