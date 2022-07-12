package pontinisystems.myearnings.features.profile.impl.domain.usecase

import pontinisystems.myearnings.features.profile.impl.domain.repository.ProfileRepository
import pontinisystems.myearnings.features.profile.domain.usecase.InsertProfileUseCase
import javax.inject.Inject

class InsertProfileUseCaseImpl @Inject constructor(private val profileRepository: ProfileRepository) :
    InsertProfileUseCase {
    override suspend fun invoke(name: String, lastName: String): Result<Unit> {
        return profileRepository.insert(name, lastName)
    }

}