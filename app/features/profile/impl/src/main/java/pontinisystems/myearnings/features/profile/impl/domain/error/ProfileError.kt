package pontinisystems.myearnings.features.profile.impl.domain.error

sealed class ProfileError : Throwable() {
    data class InsertProfileException(val descriptionError: String) : ProfileError()
    data class InvalidProfile(val descriptionError: String) : ProfileError()
    data class Unknown(val descriptionError: String?) : ProfileError()
}