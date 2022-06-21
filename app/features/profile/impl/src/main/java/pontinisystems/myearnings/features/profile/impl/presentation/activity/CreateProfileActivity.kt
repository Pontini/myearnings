package pontinisystems.myearnings.features.profile.impl.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import pontinisystems.myearnings.design_system.theme.MyEarningsTheme
import pontinisystems.myearnings.features.profile.impl.R
import pontinisystems.myearnings.features.profile.impl.presentation.viewmodel.CreateProfileViewModel

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
                    FeedItem()
                }
            }
        }
    }

    @Composable
    private fun FeedItem() {
        Column() {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription ="Thumbanail"
            )

        }
    }
}
