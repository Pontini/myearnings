package pontinisystems.myearnings.features.profile.impl.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import dagger.hilt.android.AndroidEntryPoint
import pontinisystems.myearnings.design_system.theme.MyEarningsTheme
import pontinisystems.myearnings.features.profile.impl.presentation.component.ComponentProfileFormFieldSession

@AndroidEntryPoint
class CreateProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyEarningsTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    ComponentProfileFormFieldSession(activity = this)
                }
            }
        }
    }
}



