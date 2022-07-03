package pontinisystems.myearnings.features.share.data.datasource.local

import pontinisystems.myearnings.features.share.data.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity
import pontinisystems.myearnings.features.share.data.datasource.ProfileDataSource
import javax.inject.Inject

class ProfileDataSourceImpl @Inject constructor(private val profileDao: ProfileDao) :
    ProfileDataSource {

    override suspend fun insert(): Long {
        return profileDao.insert(ProfileEntity(1L, "", ""))
    }


}