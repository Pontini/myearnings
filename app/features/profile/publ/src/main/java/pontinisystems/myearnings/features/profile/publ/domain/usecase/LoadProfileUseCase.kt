package pontinisystems.myearnings.features.profile.publ.domain.usecase

interface LoadProfileUseCase{
    suspend operator fun invoke(): Result<String>
}