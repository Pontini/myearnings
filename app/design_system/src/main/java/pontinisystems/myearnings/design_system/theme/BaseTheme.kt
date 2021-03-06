package pontinisystems.myearnings.design_system.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val CustomPalette = lightColors(
    primary = colorTeal500,
    primaryVariant = colorTeal700,
    secondary = colorTeal200,
    background = colorLavender,
    )


@Composable
fun MyEarningsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        CustomPalette
    } else {
        CustomPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}