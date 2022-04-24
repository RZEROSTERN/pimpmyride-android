package com.rzerocorp.pimpmyride

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.rzerocorp.pimpmyride.navigation.SetupNavGraph
import com.rzerocorp.pimpmyride.ui.theme.PimpMyRideTheme
import com.rzerocorp.pimpmyride.ui.views.SplashFragment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PimpMyRideTheme {
                val navController = rememberNavController()
                // SplashFragment(navController = navController)
                SetupNavGraph(navController = navController)
            }
        }
    }
}