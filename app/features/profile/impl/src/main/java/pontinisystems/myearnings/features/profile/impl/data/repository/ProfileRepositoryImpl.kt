package pontinisystems.myearnings.features.profile.impl.data.repository

import pontinisystems.myearnings.features.profile.impl.domain.repository.ProfileRepository
import pontinisystems.myearnings.features.share.data.database.entities.ProfileEntity
import pontinisystems.myearnings.features.profile.impl.data.datasource.ProfileDataSource
import pontinisystems.myearnings.features.share.data.database.error.ProfileError
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(
    private val profileDataSource: ProfileDataSource
) : ProfileRepository {
    override suspend fun insert(name: String, lastName: String): Result<Unit> {
        return try {
            val profile = ProfileEntity(name = name, lastName = lastName)
            profileDataSource.insert(profile)
            Result.success(Unit)
        } catch (e: ProfileError) {
            when(e){
                is ProfileError.InsertEntityException -> {
                    Result.failure(ProfileError.InsertEntityException(""))
                }
                is ProfileError.Unknown -> {
                    Result.failure(ProfileError.Unknown(""))
                }
            }
        } catch (e: Exception) {
            Result.failure(ProfileError.Unknown(""))
        }
    }
}

