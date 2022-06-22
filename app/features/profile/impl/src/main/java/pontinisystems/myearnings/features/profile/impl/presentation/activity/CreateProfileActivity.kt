package pontinisystems.myearnings.features.profile.impl.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import pontinisystems.myearnings.design_system.theme.MyEarningsTheme
import pontinisystems.myearnings.design_system.theme.colorTeal500
import pontinisystems.myearnings.features.profile.impl.R
import pontinisystems.myearnings.features.profile.impl.presentation.viewmodel.CreateProfileViewModel
import pontinisystems.myearnings.features.profile.impl.presentation.viewmodel.ProfileAction

@AndroidEntryPoint
class CreateProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: CreateProfileViewModel = hiltViewModel()

            MyEarningsTheme() {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(text = getString(R.string.insert_profile))
                                },
                                backgroundColor = colorTeal500,
                                contentColor = MaterialTheme.colors.background
                            )
                        }, content = {
                            Column(
                                modifier = Modifier.padding(16.dp),
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.Top
                            ) {
                                TextField(getString(R.string.name))
                                Spacer(modifier = Modifier.padding(vertical = 4.dp))
                                TextField(getString(R.string.last_name))
                            }
                        },
                        bottomBar = {
                            Button(onClick = {
                                viewModel.dispatchViewAction(
                                    ProfileAction.OnClick(
                                        "Ewerton",
                                        "Pontini"
                                    )
                                )
                            }, modifier = Modifier.fillMaxWidth()) {
                                Text(text = "Carregar as informacoes")
                            }
                        }
                    )
                }
            }
        }
    }

    @Composable
    fun TextField(label: String) {
        var text by remember { mutableStateOf("") }
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(label) }
        )
    }
}



