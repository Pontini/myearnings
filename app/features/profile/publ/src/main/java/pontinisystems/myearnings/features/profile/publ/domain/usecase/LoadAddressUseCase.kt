package pontinisystems.myearnings.features.profile.publ.domain.usecase

interface LoadAddressUseCase{
    suspend operator fun invoke(): Result<String>
}