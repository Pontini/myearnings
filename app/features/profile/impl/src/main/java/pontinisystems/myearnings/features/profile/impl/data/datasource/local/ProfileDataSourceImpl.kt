package pontinisystems.myearnings.features.profile.impl.data.datasource.local

import pontinisystems.myearnings.features.share.data.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity
import pontinisystems.myearnings.features.profile.impl.data.datasource.ProfileDataSource
import pontinisystems.myearnings.features.share.data.database.error.ProfileError
import javax.inject.Inject

class ProfileDataSourceImpl @Inject constructor(private val profileDao: ProfileDao) :
    ProfileDataSource {

    override suspend fun insert(profile: ProfileEntity): Long {
        try {
            return profileDao.insert(profile)
        } catch (e: Exception) {
            throw ProfileError.InsertEntityException("There was an error registering user")
        }
    }
}