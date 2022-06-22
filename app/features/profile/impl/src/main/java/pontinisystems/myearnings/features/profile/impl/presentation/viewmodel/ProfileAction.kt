package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel


sealed class ProfileAction {
    object OnInit : ProfileAction()
    data class OnClick(val name: String, val lastName: String): ProfileAction()
}