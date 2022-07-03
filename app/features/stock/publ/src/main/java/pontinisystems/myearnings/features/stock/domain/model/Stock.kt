package pontinisystems.myearnings.features.stock.domain.model

data class Stock(
    val symbol: String,
    val description: String,
    val amount: Long,
)