package pontinisystems.myearnings.features.profile.publ.domain

interface InsertProfileUseCase{
    suspend operator fun invoke(): Result<String>
}