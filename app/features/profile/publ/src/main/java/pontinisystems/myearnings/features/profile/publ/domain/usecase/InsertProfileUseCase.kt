package pontinisystems.myearnings.features.profile.publ.domain.usecase

interface InsertProfileUseCase{
    suspend operator fun invoke(name: String, lastName: String): Result<Unit>
}