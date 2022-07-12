package pontinisystems.myearnings.presentation.menu

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import pontinisystems.myearnings.R

sealed class NavItem(
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val navRoute: String
) {
    object DashBoard : NavItem(R.string.dashboard, R.drawable.ic_baseline_dashboard_24, NAV_HOME)
    object Favorite : NavItem(R.string.last_name, R.drawable.ic_baseline_favorite_24, NAV_FAV)
}
