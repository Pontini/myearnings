package pontinisystems.myearnings.features.profile.impl.data.datasource.local

import pontinisystems.myearnings.features.share.data.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity
import pontinisystems.myearnings.features.profile.impl.data.datasource.ProfileDataSource
import javax.inject.Inject

class ProfileDataSourceImpl @Inject constructor(private val profileDao: ProfileDao) :
    ProfileDataSource {

    override suspend fun insert(profile: ProfileEntity): Long {
        try {
            return profileDao.insert(profile)
        } catch (e: Throwable) {
            println(e.message)
            throw e
        }
    }
}