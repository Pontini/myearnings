package pontinisystems.myearnings.features.share.impl.infra.repositories

import pontinisystems.myearnings.features.share.impl.infra.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.impl.infra.database.entities.ProfileEntity
import pontinisystems.myearnings.features.share.publ.domain.repository.ProfileRepository

class ProfileRepositoryImpl(
    private val profileDao: ProfileDao
) : ProfileRepository {
    override suspend fun insert(name: String, lastName: String): Result<Unit> {
        return try {
            val profileEntity = ProfileEntity(name = name, lastName = lastName)
            profileDao.insert(profileEntity)
            Result.success(Unit)
        } catch (e: Throwable) {
            Result.failure(e)
        }
    }
}


