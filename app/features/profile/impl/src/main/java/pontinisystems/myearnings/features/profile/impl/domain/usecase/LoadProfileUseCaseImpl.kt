package pontinisystems.myearnings.features.profile.impl.domain.usecase

import pontinisystems.myearnings.features.profile.publ.domain.usecase.LoadProfileUseCase
import pontinisystems.myearnings.features.share.publ.domain.repository.ProfileRepository

class LoadProfileUseCaseImpl(private val profileRepository: ProfileRepository) :
    LoadProfileUseCase {
    override suspend fun invoke(
    ): Result<String> {
        return Result.success("Ewerton Pontini")
    }

}