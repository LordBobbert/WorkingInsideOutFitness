package com.robertuhls.workinginsideoutfitness.navigation

sealed class Screen(val route: String) {
    object Login : Screen(route = "login_screen")
    object Register : Screen(route = "register_screen")
    object Reset : Screen(route = "reset_screen")
    object Dashboard : Screen(route = "dashboard_screen")
}