package com.app.routiner

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.app.routiner.ui.bottomnav.BottomNavBar
import com.app.routiner.ui.navigation.NavRoute
import com.app.routiner.ui.navigation.navGraph
import com.app.routiner.ui.theme.RoutinerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : ComponentActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            RoutinerTheme {
                setUpNavigation(onBackPressedDispatcher)
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun setUpNavigation(onBackPressedDispatcher: OnBackPressedDispatcher) {
    val navController = rememberNavController()
    Scaffold(backgroundColor = Color.LightGray, bottomBar = {
        BottomNavBar(navController, onBackPressedDispatcher) {}
    }, content = { paddingValues ->
        ScaffoldDefaults.contentWindowInsets
        Box(modifier = Modifier.padding(paddingValues)) {
            NavHost(
                navController = navController,
                route = NavRoute.SplashScreenRoute.route,
                startDestination = NavRoute.SplashScreenRoute.route
            ) {
                navGraph(navController)
            }
        }
    })
}