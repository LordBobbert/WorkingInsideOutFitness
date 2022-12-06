package com.robertuhls.workinginsideoutfitness

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.navigation.compose.rememberNavController
import com.robertuhls.workinginsideoutfitness.navigation.NavGraph
import com.robertuhls.workinginsideoutfitness.presentation.roster.ClientViewModel
import com.robertuhls.workinginsideoutfitness.ui.theme.Material3ComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        setContent {
            Material3ComposeTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)


            }
        }
    }

}
