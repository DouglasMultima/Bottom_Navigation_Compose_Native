package com.task.bottom_navigation.navigation.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.task.bottom_navigation.main.home.HomeScreen
import kotlinx.serialization.Serializable

@Composable

fun MyNavHost(navHostController: NavHostController){

    NavHost(
        navController = navHostController ,
        startDestination = HomeScreenRoute
    ) {
       composable<HomeScreenRoute>{
            HomeScreen()
       }

    }

}

@Serializable
object HomeScreenRoute