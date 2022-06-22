package pontinisystems.myearnings.features.profile.impl.domain.usecase

import pontinisystems.myearnings.features.profile.publ.domain.usecase.InsertProfileUseCase
import pontinisystems.myearnings.features.share.publ.domain.repository.ProfileRepository

class InsertProfileUseCaseImpl(private val profileRepository: ProfileRepository) :
    InsertProfileUseCase {
    override suspend fun invoke(name: String, lastName: String): Result<Unit> {
        return profileRepository.insert(name, lastName)
    }

}