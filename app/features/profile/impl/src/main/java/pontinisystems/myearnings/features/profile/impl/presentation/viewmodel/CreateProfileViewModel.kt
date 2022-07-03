package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import pontinisystems.myearnings.features.profile.impl.domain.usecase.InsertProfileUseCaseImpl
import javax.inject.Inject

@HiltViewModel
class CreateProfileViewModel @Inject constructor(
    private val insertProfile: InsertProfileUseCaseImpl,
) : ViewModel() {
    private fun insertProfile(name: String, lastName: String) {
        viewModelScope.launch {
            insertProfile.invoke(
                name = name,
                lastName = lastName
            )
        }
    }

    fun onClickSave() {
        insertProfile("A", "C")
    }

}
