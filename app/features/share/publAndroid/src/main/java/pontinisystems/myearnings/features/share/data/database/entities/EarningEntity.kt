package pontinisystems.myearnings.features.share.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "earning")
data class EarningEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String,
)