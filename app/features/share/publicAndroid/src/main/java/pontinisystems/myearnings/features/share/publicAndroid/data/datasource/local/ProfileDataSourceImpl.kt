package pontinisystems.myearnings.features.share.publicAndroid.data.datasource.local

import pontinisystems.myearnings.features.share.publicAndroid.data.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.publicAndroid.data.database.entities.ProfileEntity
import javax.inject.Inject

class ProfileDataSourceImpl @Inject constructor(private val profileDao: ProfileDao) :
    ProfileDataSource {

    override suspend fun insert(): Long {
        return profileDao.insert(ProfileEntity(1L, "", ""))
    }


}