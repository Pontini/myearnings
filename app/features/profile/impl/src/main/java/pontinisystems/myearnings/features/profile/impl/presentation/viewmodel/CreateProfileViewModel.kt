package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import pontinisystems.myearnings.features.profile.impl.domain.usecase.InsertProfileUseCaseImpl
import pontinisystems.myearnings.features.share.data.database.error.ProfileError
import javax.inject.Inject

@HiltViewModel
class CreateProfileViewModel @Inject constructor(
    private val dispatcherProvider: DispactcherProvider,
    private val insertProfile: InsertProfileUseCaseImpl,
) : ViewModel() {

     val error: MutableLiveData<String> = MutableLiveData()

    private fun insert(name: String, lastName: String) {
        viewModelScope.launch(dispatcherProvider.io()) {
            insertProfile(name = name, lastName = lastName)
                .onSuccess {
                    Log.i("EWERTON PONTINI", "onSuccess")
                }
                .onFailure {
                    when (it) {
                        is ProfileError.InsertProfileException -> {
                            error.postValue(it.descriptionError)
                            Log.i("EWERTON PONTINI", "onFailure" + it.descriptionError)
                        }


                    }

                }
        }
    }

    fun onClickSave() {
        insert("", "")
    }
}
