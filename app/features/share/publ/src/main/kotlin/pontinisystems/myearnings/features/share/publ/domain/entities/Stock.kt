package pontinisystems.myearnings.features.share.publ.domain.entities

data class Stock(
    val symbol: String,
    val description: String,
    val amount: Long,
)