package pontinisystems.myearnings.features.stock.impl.select_stock.presentation.component

import androidx.activity.ComponentActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import pontinisystems.myearnings.features.stock.impl.select_stock.presentation.viewmodel.SelectStockViewModel

@Composable
fun ComponentStockListSession(activity: ComponentActivity){

  /*  val viewModel: SelectStockViewModel = hiltViewModel()
    val response by remember { viewModel.response }
    val error by remember { viewModel.error }
    val loading by remember { viewModel.isLoading }

    LaunchedEffect(viewModel){
        viewModel.callService()
    }

    if(!error)
        ComponentProfileSuccess(loading = loading, response = response, modifier = modifier)
    else{
        // Caso de erro
        Text(text = "AAAA")
    }*/


}