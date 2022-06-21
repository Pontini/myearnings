package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pontinisystems.myearnings.features.profile.impl.domain.CreateProfileUseCases
import javax.inject.Inject

@HiltViewModel
class CreateProfileViewModel @Inject constructor(
    private val createProfileUseCases: CreateProfileUseCases,
    ) : ViewModel() {
}
