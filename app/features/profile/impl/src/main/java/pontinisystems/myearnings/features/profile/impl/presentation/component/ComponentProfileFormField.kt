package pontinisystems.myearnings.features.profile.impl.presentation.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ComponentTextField(
    labelName: String,
    textFieldState: String,
    isError: Boolean,
    onValueChange: (String) -> Unit,
) {
    TextField(labelName, onValueChange, textFieldState, isError)
    Spacer(modifier = Modifier.padding(vertical = 4.dp))
}

@Composable
fun TextField(
    label: String,
    onValueChange: (String) -> Unit,
    textFieldState: String,
    isError: Boolean
) {
    OutlinedTextField(
        value = textFieldState,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(),
        label = { Text(label) },
        isError = isError
    )
}

