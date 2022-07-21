package pontinisystems.myearnings.features.profile.domain.usecase

interface InsertProfileUseCase {
    suspend operator fun invoke(name: String, lastName: String, gender: String): Result<Unit>
}