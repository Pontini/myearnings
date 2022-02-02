package pontinisystems.myearnings.features.share.impl.infra.repositories

import pontinisystems.core.Either
import pontinisystems.myearnings.features.share.impl.infra.database.dao.StockDao
import pontinisystems.myearnings.features.share.publ.domain.entities.Stock
import pontinisystems.myearnings.features.share.publ.domain.erros.Failure
import pontinisystems.myearnings.features.share.publ.domain.repositories.StockRepository

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


