package pontinisystems.myearnings.features.profile.impl.presentation.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ComponentProfileFormField(
    labelName: String,
    textFieldState: TextFieldState,
) {
    TextField(labelName,textFieldState)
    Spacer(modifier = Modifier.padding(vertical = 4.dp))
}

@Composable
fun TextField(label: String, textFieldState: TextFieldState) {
    OutlinedTextField(
        value = textFieldState.text,
        onValueChange = { textFieldState.text = it },
        modifier = Modifier.fillMaxWidth(),
        label = { Text(label) }
    )
}

class TextFieldState(){
    var text: String by mutableStateOf("")
}
