package pontinisystems.myearnings.features.profile.impl.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel< VA> : ViewModel() {
    abstract fun dispatchViewAction(viewAction: VA)
}
