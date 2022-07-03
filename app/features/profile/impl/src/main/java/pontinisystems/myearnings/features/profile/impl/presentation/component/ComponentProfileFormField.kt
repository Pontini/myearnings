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
) {
    TextField(labelName)
    Spacer(modifier = Modifier.padding(vertical = 4.dp))
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