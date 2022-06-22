package pontinisystems.myearnings.features.share.impl.infra.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "profile")
data class ProfileEntity(
    val name: String,
    val lastName: String
)