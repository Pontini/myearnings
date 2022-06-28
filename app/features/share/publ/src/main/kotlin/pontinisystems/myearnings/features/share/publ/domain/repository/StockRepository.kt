package pontinisystems.myearnings.features.share.publ.domain.repository

import pontinisystems.core.Either
import pontinisystems.myearnings.features.share.publ.domain.entity.Stock
import pontinisystems.myearnings.features.share.publ.domain.error.Failure

interface StockRepository {
    suspend fun search(text: String?, page: String, limit: String): Either<List<Stock>, Failure>
}