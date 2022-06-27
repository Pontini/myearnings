package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import pontinisystems.myearnings.features.profile.impl.domain.ProfileUseCases
import javax.inject.Inject

@HiltViewModel
class CreateProfileViewModel @Inject constructor(
    private val profileUseCases: ProfileUseCases,
    private val dispatcherProvider: DispactcherProvider,
) :ViewModel() {
    private fun insertProfile(name: String, lastName: String) {
        viewModelScope.launch {
            profileUseCases.insertProfile(
                name = name,
                lastName = lastName
            )
        }
    }

    fun onCliclickSave() {
        insertProfile("A","C")
    }

}
