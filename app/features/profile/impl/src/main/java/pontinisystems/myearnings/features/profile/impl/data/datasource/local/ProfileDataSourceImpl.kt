package pontinisystems.myearnings.features.profile.impl.data.datasource.local

import pontinisystems.myearnings.features.share.data.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity
import pontinisystems.myearnings.features.profile.impl.data.datasource.ProfileDataSource
import pontinisystems.myearnings.features.profile.impl.domain.error.ProfileError
import javax.inject.Inject

class ProfileDataSourceImpl @Inject constructor(private val profileDao: ProfileDao) :
    ProfileDataSource {

    override suspend fun insert(profile: ProfileEntity): Result<Long> {
        return try {
            val result = profileDao.insert(profile)
            Result.success(result)
        } catch (e: Throwable) {
            println(e.message)
            Result.failure(ProfileError.InsertProfileException("Failed to register profile."))
        }
    }
}