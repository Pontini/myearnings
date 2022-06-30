package pontinisystems.myearnings.features.profile.impl.presentation.component

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
                )
                ComponentProfileFormField(
                    labelName = activity.getString(R.string.last_name),
                )
            }
        },
        bottomBar = {
            Button(onClick = {
                viewModel.onCliclickSave()
            }, modifier = Modifier.fillMaxWidth()) {
                Text(text = activity.getString(R.string.save))
            }
        },
    )


}
