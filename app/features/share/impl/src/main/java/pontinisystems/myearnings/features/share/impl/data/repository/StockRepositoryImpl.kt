package pontinisystems.myearnings.features.share.impl.data.repository

import pontinisystems.core.Either
import pontinisystems.myearnings.features.share.impl.data.database.dao.StockDao
import pontinisystems.myearnings.features.share.publ.domain.entity.Stock
import pontinisystems.myearnings.features.share.publ.domain.error.Failure
import pontinisystems.myearnings.features.share.publ.domain.repository.StockRepository

class StockRepositoryImpl(
    private val dao: StockDao
) : StockRepository {
    override suspend fun search(
        text: String?,
        page: String,
        limit: String
    ): Either<List<Stock>, Failure> {
        suspend {
            dao.selectAll()
        }
        return Either.Success(listOf())
    }


}


