package com.task.bottom_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.task.bottom_navigation.navigation.navHost.MyNavHost
import com.task.bottom_navigation.ui.theme.Bottom_NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContent {
            Bottom_NavigationTheme {
                MyNavHost(navHostController = rememberNavController())
            }
        }
    }
}

