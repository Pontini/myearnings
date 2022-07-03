package pontinisystems.myearnings.features.share.data.database.relations

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation
import pontinisystems.myearnings.features.share.data.database.entities.EarningEntity
import pontinisystems.myearnings.features.share.data.database.entities.StockEntity

@Entity(tableName = "Stock_with_earnings")
data class StockWithEarningsEntity(
    @Embedded val school: StockEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "id"
    )
    val earnings: List<EarningEntity>
)