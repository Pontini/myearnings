package pontinisystems.myearnings.features.profile.impl.domain.usecase

import pontinisystems.myearnings.features.profile.publ.domain.InsertProfileUseCase
import pontinisystems.myearnings.features.share.publ.domain.repository.ProfileRepository

class InsertProfileUseCaseImpl(private val insertProfileRepository: ProfileRepository) : InsertProfileUseCase {
    override suspend fun invoke(
    ): Result<String> {
        return Result.success("")
    }

}