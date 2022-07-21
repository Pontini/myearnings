package pontinisystems.myearnings.features.profile.impl.presentation.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pontinisystems.myearnings.features.profile.impl.presentation.model.EnumOptionType


@Composable
fun ComponentRadioButton(
    listEnumOptions: List<EnumOptionType>,
    selectedDefault: EnumOptionType,
    label: String,
    onValueChange: (EnumOptionType) -> Unit,
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = label)
        Spacer(modifier = Modifier.padding(top = 8.dp))
        listEnumOptions.forEach {
            Row() {
                RadioButton(selected = selectedDefault == it, onClick = { onValueChange(it)})
                Text(
                    text = it.description(),
                    modifier = Modifier
                        .clickable(onClick = { onValueChange(it) })
                        .padding(start = 4.dp)
                )
            }
            Spacer(modifier = Modifier.size(8.dp))
        }
    }
}