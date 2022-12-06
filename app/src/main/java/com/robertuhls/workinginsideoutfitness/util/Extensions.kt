package com.robertuhls.workinginsideoutfitness.util

import android.app.Activity
import android.util.Log
import androidx.activity.result.IntentSenderRequest
import androidx.compose.runtime.MutableState
import androidx.navigation.NavController


import com.robertuhls.workinginsideoutfitness.navigation.Screen

fun NavController.navigateTo(route: String) {
    if (route == Screen.Login.route) {
        this.navigate(Screen.Login.route) {
            popUpTo(Screen.Dashboard.route) {
                inclusive = true
            }
        }
    } else {
        this.navigate(Screen.Dashboard.route) {
            popUpTo(Screen.Login.route) {
                inclusive = true
            }
        }
    }
}
