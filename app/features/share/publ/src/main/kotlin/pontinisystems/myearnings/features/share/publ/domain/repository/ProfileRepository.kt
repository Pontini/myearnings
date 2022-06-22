package pontinisystems.myearnings.features.share.publ.domain.repository


interface ProfileRepository {
    suspend fun insert(name: String, lastName: String): Result<Unit>
}