package pontinisystems.myearnings.features.profile.impl.presentation.model

data class TextFieldState(
    val descriptionError: String = "",
    val isError: Boolean = false,
    val textValue: String = "",
    val label: String = ""
) {
    fun onChangeValue(newValue: String): TextFieldState {
        return this.copy(textValue = newValue)
    }
}