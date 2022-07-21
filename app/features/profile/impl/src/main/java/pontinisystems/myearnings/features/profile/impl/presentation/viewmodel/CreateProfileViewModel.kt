package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import pontinisystems.myearnings.features.profile.domain.usecase.InsertProfileUseCase
import pontinisystems.myearnings.features.profile.domain.usecase.IsValidateProfileUseCase
import pontinisystems.myearnings.features.profile.impl.presentation.model.EnumOptionType
import pontinisystems.myearnings.features.profile.impl.presentation.model.GenderType
import pontinisystems.myearnings.features.profile.impl.presentation.model.TextFieldState
import pontinisystems.myearnings.features.profile.impl.domain.error.ProfileError
import javax.inject.Inject

@HiltViewModel
class CreateProfileViewModel @Inject constructor(
    private val dispatcherProvider: DispactcherProvider,
    private val insertProfile: InsertProfileUseCase,
    private val isValidateProfile: IsValidateProfileUseCase
) : ViewModel() {

    private val _name = MutableStateFlow(TextFieldState(textValue = "", label = "Nome"))
    val name: StateFlow<TextFieldState> = _name

    private val _lastName = MutableStateFlow(TextFieldState(textValue = "", label = "Nome"))
    val lastName: StateFlow<TextFieldState> = _lastName

    val listGenderType = listOf<EnumOptionType>(GenderType.MALE, GenderType.FEMALE)
    private val _selectGenderType = MutableStateFlow(GenderType.MALE)
    val selectGenderType: StateFlow<EnumOptionType> = _selectGenderType

    private val _isButtonSaveEnable = MutableStateFlow(false)
    val isButtonSaveEnable: StateFlow<Boolean> = _isButtonSaveEnable

    fun onClickCreateProfile() {
        val name = _name.value.textValue
        val lastName = _lastName.value.textValue
        val gender = _selectGenderType.value.getCode()

        viewModelScope.launch(dispatcherProvider.io()) {
            insertProfile(name = name, lastName = lastName, gender = gender)
                .onSuccess {
                    insertProfile(name = name, lastName = lastName, gender = gender)
                }
                .onFailure {
                    when (it) {
                        is ProfileError.InsertProfileException -> {}
                        is ProfileError.Unknown -> {}
                    }
                }
        }
    }

    fun onChangeName(newName: String) {
        viewModelScope.launch {
            val newProfile = _name.value.onChangeValue(newName)
            _name.emit(newProfile)
            validateFormField()
        }
    }

    fun onChangeLastName(newLastName: String) {
        viewModelScope.launch {
            val newProfile = _lastName.value.onChangeValue(newLastName)
            _lastName.emit(newProfile)
            validateFormField()
        }
    }

    fun onChangeGender(enumOptionType: GenderType) {
        viewModelScope.launch {
            _selectGenderType.emit(enumOptionType)
            validateFormField()
        }
    }

    private fun validateFormField() {
        val name = _name.value.textValue
        val lastName = _lastName.value.textValue
        val gender = _selectGenderType.value.getCode()

        isValidateProfile(name = name, lastName = lastName, gender = gender)
            .onSuccess {
                viewModelScope.launch {
                    _isButtonSaveEnable.emit(true)
                }
            }
            .onFailure {
                viewModelScope.launch {
                    _isButtonSaveEnable.emit(false)
                }
            }
    }
}
