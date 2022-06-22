package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import pontinisystems.myearnings.features.profile.impl.domain.ProfileUseCases
import javax.inject.Inject

@HiltViewModel
class CreateProfileViewModel @Inject constructor(
    private val profileUseCases: ProfileUseCases,
    private val dispatcherProvider: DispactcherProvider,
) : BaseViewModel<ProfileState, ProfileAction>(), ActionDispatcher<ProfileAction> {
    override val viewState: ProfileState = ProfileState()

    override fun dispatchViewAction(viewAction: ProfileAction) {
        when (viewAction) {
            is ProfileAction.OnInit -> {

            }
            is ProfileAction.OnClick -> {
                val name = viewAction.name
                val lastName = viewAction.lastName
                insertProfile(name = name, lastName = lastName)
            }
        }
    }

    private fun insertProfile(name: String, lastName: String) {
        viewModelScope.launch {
            profileUseCases.insertProfile(
                name = name,
                lastName = lastName
            )
        }
    }

}
