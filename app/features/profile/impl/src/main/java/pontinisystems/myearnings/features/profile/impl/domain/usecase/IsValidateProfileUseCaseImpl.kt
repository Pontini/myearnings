package pontinisystems.myearnings.features.profile.impl.domain.usecase

import pontinisystems.myearnings.features.profile.domain.usecase.IsValidateProfileUseCase
import pontinisystems.myearnings.features.profile.impl.domain.error.ProfileError

class IsValidateProfileUseCaseImpl :
    IsValidateProfileUseCase {
    override fun invoke(name: String, lastName: String, gender: String): Result<Unit> {
        if (name.isEmpty() || lastName.isEmpty() || gender.isEmpty()) {
            return Result.failure(ProfileError.InvalidProfile("Failure validate user"))
        }
        return Result.success(Unit)
    }
}

