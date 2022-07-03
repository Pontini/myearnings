package pontinisystems.myearnings.features.profile.impl.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    init {
        collectFlow()
    }

    val countDownFlow = flow<Int> {
        val startingValue = 10
        var currentValue  = startingValue
        emit(startingValue)
        while (currentValue>0){
            delay(1000L)
            currentValue--
            emit(currentValue)
        }
    }

//Basicamente como está vindo  dados de cima e e estamos usando o collectLatest ele cancela o de baixo e emite de cima
    // Ele cancela o bloco de baixo... delay*15000L)

     fun collectFlow(){
        viewModelScope.launch {
            countDownFlow.collectLatest {time->
                delay(1500L)
                println("The current time is $time")
            }
        }
    }

}
