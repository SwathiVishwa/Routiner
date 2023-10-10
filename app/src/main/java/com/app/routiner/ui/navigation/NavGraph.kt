package com.app.routiner.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.app.routiner.ui.screens.OnBoardingScreens
import com.app.routiner.ui.screens.SplashScreens

fun NavGraphBuilder.navGraph(
    navController: NavController,
) {
    navigation(
        startDestination = NavRoute.SplashScreenRoute.route,
        route = NavRoute.SplashScreenRoute.route
    ) {
        composable(route = NavRoute.SplashScreenRoute.route) {
            SplashScreens(navController)
        }
        composable(route = NavRoute.OnBoardingScreenRoute.route) {
            OnBoardingScreens(navController)
        }
    }
}