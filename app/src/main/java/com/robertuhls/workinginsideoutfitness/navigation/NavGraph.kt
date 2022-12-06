package com.robertuhls.workinginsideoutfitness.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.robertuhls.workinginsideoutfitness.presentation.roster.DashboardScreen
import com.robertuhls.workinginsideoutfitness.presentation.login.LoginScreen
import com.robertuhls.workinginsideoutfitness.presentation.registration.RegisterScreen
import com.robertuhls.workinginsideoutfitness.presentation.reset.ResetScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(route = Screen.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screen.Register.route) {
            RegisterScreen(navController = navController)
        }
        composable(route = Screen.Reset.route) {
            ResetScreen(navController = navController)
        }
        composable(route = Screen.Dashboard.route) {
            DashboardScreen(navController = navController)
        }

    }
}
