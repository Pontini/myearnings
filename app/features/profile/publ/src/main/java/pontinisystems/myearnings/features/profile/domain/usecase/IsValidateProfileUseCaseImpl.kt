package pontinisystems.myearnings.features.profile.domain.usecase

interface IsValidateProfileUseCase{
    operator fun invoke(name: String, lastName: String, gender: String): Result<Unit>
}
