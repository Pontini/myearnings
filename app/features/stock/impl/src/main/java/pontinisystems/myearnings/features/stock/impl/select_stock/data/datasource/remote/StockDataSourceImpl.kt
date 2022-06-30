package pontinisystems.myearnings.features.stock.impl.select_stock.data.datasource.remote

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import pontinisystems.myearnings.features.stock.impl.select_stock.data.datasource.StockDataSource
import pontinisystems.myearnings.features.stock.impl.select_stock.data.datasource.remote.api.StockApi

internal class StockDataSourceImpl(
    private val stockApi: StockApi
) : StockDataSource {
    override fun searchBySymbol(): Flow<String> {
        return flow {
            val data = stockApi.searchForSymbol("CVC")
            emit("")
        }
    }

}