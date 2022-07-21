package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import pontinisystems.myearnings.features.profile.impl.domain.usecase.InsertProfileUseCaseImpl
import pontinisystems.myearnings.features.profile.impl.presentation.model.EnumOptionType
import pontinisystems.myearnings.features.profile.impl.presentation.model.GenderType
import pontinisystems.myearnings.features.profile.impl.presentation.model.TextFieldState
import pontinisystems.myearnings.features.share.data.database.error.ProfileError
import javax.inject.Inject

@HiltViewModel
class CreateProfileViewModel @Inject constructor(
    private val dispatcherProvider: DispactcherProvider,
    private val insertProfile: InsertProfileUseCaseImpl,
) : ViewModel() {

    private val _name = MutableStateFlow(TextFieldState(textValue = "", label = "Nome"))
    val name: StateFlow<TextFieldState> = _name

    private val _lastName = MutableStateFlow(TextFieldState(textValue = "", label = "Nome"))
    val lastName: StateFlow<TextFieldState> = _lastName

    val listGenderType = listOf<EnumOptionType>(GenderType.MALE, GenderType.FEMALE)
    private val _selectGenderType = MutableStateFlow(GenderType.MALE)
    val selectGenderType: StateFlow<EnumOptionType> = _selectGenderType

    fun onClickCreateProfile() {
        val name = _name.value.textValue
        val lastName = _lastName.value.textValue

        viewModelScope.launch(dispatcherProvider.io()) {
            insertProfile(name = name, lastName = lastName)
                .onSuccess {
                }
                .onFailure {
                    when (it) {
                        is ProfileError.InsertProfileException -> {
                        }
                    }
                }
        }
    }

    fun onChangeName(newName: String) {
        viewModelScope.launch {
            val newProfile = _name.value.onChangeValue(newName)
            _name.emit(newProfile)
        }
    }

    fun onChangeLastName(newLastName: String) {
        viewModelScope.launch {
            val newProfile = _lastName.value.onChangeValue(newLastName)
            _lastName.emit(newProfile)
        }
    }

    fun onChangeGender(enumOptionType: EnumOptionType) {
        viewModelScope.launch {
            _selectGenderType.emit(enumOptionType as GenderType)
        }
    }
}
