
package pontinisystems.myearnings.features.profile.impl.data.repository

import pontinisystems.myearnings.features.profile.impl.domain.repository.ProfileRepository
import pontinisystems.myearnings.features.share.publicAndroid.data.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.ProfileEntity
import javax.inject.Inject

class ProfileRepositoryImpl  @Inject constructor(
    private val profileDao: ProfileDao
) : ProfileRepository {
    override suspend fun insert(name: String, lastName: String): Result<Unit> {
        return try {
            val profileEntity = ProfileEntity(id = 1, name = name, lastName = lastName)
            val result = profileDao.insert(profileEntity)
            Result.success(Unit)
        } catch (e: Throwable) {
            Result.failure(e)
        }
    }
}

