package pontinisystems.myearnings.features.profile.impl.domain.repositories

import pontinisystems.core.Either
import pontinisystems.myearnings.features.profile.impl.domain.errors.Failure
import pontinisystems.myearnings.features.profile.publ.domain.entities.Profile

interface ProfileRepository {
    suspend fun getProfile(): Either<Profile, Failure>
}
