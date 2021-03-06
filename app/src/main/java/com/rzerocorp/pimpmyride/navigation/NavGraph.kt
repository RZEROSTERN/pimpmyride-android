package com.rzerocorp.pimpmyride.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rzerocorp.pimpmyride.ui.views.SplashFragment

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashFragment(navController = navController)
        }
        composable(route = Screen.Home.route) {
            Box(
               modifier = Modifier.fillMaxSize()
            )
        }
    }
}