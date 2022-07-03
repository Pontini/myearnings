package pontinisystems.myearnings.features.stock.impl.select_stock.data.datasource

import kotlinx.coroutines.flow.Flow

interface StockDataSource {
    fun searchBySymbol(): Flow<String>
}