package pontinisystems.myearnings.features.profile.impl.presentation.viewaction

import pontinisystems.myearnings.features.profile.publ.domain.entities.Profile


sealed class CreateProfileViewAction {
    data class OnChange(val profile: Profile):CreateProfileViewAction()
}