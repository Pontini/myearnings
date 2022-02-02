package pontinisystems.myearnings.features.share.publ.domain.repositories

import pontinisystems.core.Either
import pontinisystems.myearnings.features.share.publ.domain.entities.Stock
import pontinisystems.myearnings.features.share.publ.domain.erros.Failure

interface StockRepository {
    suspend fun search(text: String?, page: String, limit: String): Either<List<Stock>, Failure>
}