package pontinisystems.myearnings.features.stock.domain.repository

import pontinisystems.myearnings.features.stock.domain.model.Stock

interface StockRepository {
    suspend fun search(text: String?, page: String, limit: String): Result<List<Stock>>
}

