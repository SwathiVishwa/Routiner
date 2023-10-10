package com.app.routiner.ui.navigation

sealed class NavRoute(val route: String) {
    object SplashScreenRoute : NavRoute("splash_screen_route")
    object OnBoardingScreenRoute : NavRoute("onboarding_screen_route")
}