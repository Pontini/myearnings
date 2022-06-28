package pontinisystems.myearnings.features.share.impl.data.repository

import android.util.Log
import pontinisystems.myearnings.features.share.impl.data.database.dao.ProfileDao
import pontinisystems.myearnings.features.share.impl.data.database.entities.ProfileEntity
import pontinisystems.myearnings.features.share.publ.domain.repository.ProfileRepository

class ProfileRepositoryImpl(
    private val profileDao: ProfileDao
) : ProfileRepository {
    override suspend fun insert(name: String, lastName: String): Result<Unit> {
        return try {
            val profileEntity = ProfileEntity(id = 1, name = name, lastName = lastName)
            val result = profileDao.insert(profileEntity)
            Log.i("AAA","A"+result)
            Result.success(Unit)
        } catch (e: Throwable) {
            Result.failure(e)
        }
    }
}


