package com.app.routiner.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.app.routiner.R
import com.app.routiner.ui.theme.radial1
import com.app.routiner.ui.theme.radial2


@Composable
fun SplashScreens(navController: NavController) {
    val radialGradient = Brush.radialGradient(
        colors = listOf(radial1, radial2)
    )

    Column(
        Modifier
            .background(radialGradient)
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = "App Logo",
            Modifier.size(300.dp),
            alignment = Alignment.Center
        )

    }
}
