package pontinisystems.myearnings.features.share.impl.infra.repositories

import pontinisystems.myearnings.features.share.impl.infra.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.publ.domain.repository.ProfileRepository

class ProfileRepositoryImpl(
    private val profileDao: ProfileDao
) : ProfileRepository {
    override suspend fun insert(name: String): Result<String> {
        return Result.success("")
    }


}


