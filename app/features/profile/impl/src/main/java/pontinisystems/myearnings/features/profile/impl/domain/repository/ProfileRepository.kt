package pontinisystems.myearnings.features.profile.impl.domain.repository


interface ProfileRepository {
    suspend fun insert(name: String, lastName: String): Result<Unit>
}