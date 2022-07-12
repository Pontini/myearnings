package pontinisystems.myearnings.features.profile.impl.presentation.component

import android.util.Log
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import pontinisystems.myearnings.design_system.theme.colorTeal500
import pontinisystems.myearnings.features.profile.impl.R
import pontinisystems.myearnings.features.profile.impl.presentation.viewmodel.CreateProfileViewModel

@Composable
fun ComponentProfileFormFieldSession(activity: ComponentActivity) {
    val viewModel: CreateProfileViewModel = hiltViewModel()

    val name = remember { TextFieldState() }
    val lastName = remember { TextFieldState() }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = activity.getString(R.string.insert_profile))
                },
                backgroundColor = colorTeal500,
                contentColor = MaterialTheme.colors.background
            )
        },
        content = {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top
            ) {
                ComponentProfileFormField(
                    labelName = activity.getString(R.string.name),
                    name
                )
                ComponentProfileFormField(
                    labelName = activity.getString(R.string.last_name),
                    textFieldState = lastName,
                )
            }
        },
        bottomBar = {
            Button(onClick = {
                Log.i("Ewerton Pontini", "name: " + name.text)
                Log.i("Ewerton Pontini", "name: " + lastName.text)

                viewModel.onClickSave()
            }, modifier = Modifier.fillMaxWidth()) {
                Text(text = activity.getString(R.string.save))
            }
        },
    )


}


@Composable
fun SnackbarDemo() {
    val scaffoldState = rememberScaffoldState() // this contains the `SnackbarHostState`
    val (showSnackBar, setShowSnackBar) = remember {
        mutableStateOf(false)
    }
    if (showSnackBar) {
        LaunchedEffect(scaffoldState.snackbarHostState) {
            // Show snackbar using a coroutine, when the coroutine is cancelled the
            // snackbar will automatically dismiss. This coroutine will cancel whenever
            // `showSnackBar` is false, and only start when `showSnackBar` is true
            // (due to the above if-check), or if `scaffoldState.snackbarHostState` changes.
            val result = scaffoldState.snackbarHostState.showSnackbar(
                message = "Error message",
                actionLabel = "Retry message"
            )
            when (result) {
                SnackbarResult.Dismissed -> {
                    setShowSnackBar(false)
                }
                SnackbarResult.ActionPerformed -> {
                    setShowSnackBar(false)
                    // perform action here
                }
            }
        }
    }
}
