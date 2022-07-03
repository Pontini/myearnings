package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel

interface ActionDispatcher<VA>{
    fun dispatchViewAction(viewAction:VA)
}