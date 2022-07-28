package pontinisystems.myearnings.features.profile.impl.data.repository

import pontinisystems.myearnings.features.profile.impl.domain.repository.ProfileRepository
import pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity
import pontinisystems.myearnings.features.profile.impl.data.datasource.ProfileDataSource
import pontinisystems.myearnings.features.profile.impl.domain.error.ProfileError
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(
    private val profileDataSource: ProfileDataSource,
    private val outroDataSource: ProfileDataSource,
) : ProfileRepository {
    override suspend fun insert(name: String, lastName: String) = runCatching {
        val profile = ProfileEntity(name = name, lastName = lastName)
        val outraInfo = outroDataSource.insert()
        profileDataSource.insert(mapperData.map(profile))
        Unit
    }
}