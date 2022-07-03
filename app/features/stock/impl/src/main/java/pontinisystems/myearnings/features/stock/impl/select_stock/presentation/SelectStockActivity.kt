package pontinisystems.myearnings.features.stock.impl.select_stock.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import dagger.hilt.android.AndroidEntryPoint
import pontinisystems.myearnings.design_system.theme.MyEarningsTheme
import pontinisystems.myearnings.features.stock.impl.select_stock.presentation.component.ComponentStockListSession

@AndroidEntryPoint
class SelectStockActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyEarningsTheme() {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    ComponentStockListSession(activity = this)
                }
            }
        }
    }
}