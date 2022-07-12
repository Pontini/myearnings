package pontinisystems.myearnings.features.share.data.database.error

sealed class ProfileError : Throwable() {
    data class InsertProfileException(val descriptionError: String) : ProfileError()
    data class Unknown(val descriptionError: String?) : ProfileError()
}