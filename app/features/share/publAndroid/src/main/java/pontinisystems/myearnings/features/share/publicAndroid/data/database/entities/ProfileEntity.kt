package pontinisystems.myearnings.features.share.publicAndroid.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profile")
data class ProfileEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val name: String,
    val lastName: String
)