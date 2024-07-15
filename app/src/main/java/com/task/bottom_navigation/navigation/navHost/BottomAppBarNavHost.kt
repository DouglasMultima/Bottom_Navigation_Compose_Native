package com.task.bottom_navigation.navigation.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.task.bottom_navigation.main.feed.FeedScreen
import com.task.bottom_navigation.main.friends.FriendsScreen
import com.task.bottom_navigation.main.profile.ProfileScreen
import com.task.bottom_navigation.main.search.SearchScreen
import kotlinx.serialization.Serializable


@Composable

fun BottomAppBarNavHost(navHostController: NavHostController){

    NavHost(
        navController = navHostController ,
        startDestination = FeedScreenRoute
    ) {
        composable<FeedScreenRoute>{
            FeedScreen()
        }

        composable<SearchScreenRoute>{
           SearchScreen()
        }

        composable<FriendsScreenRoute>{
            FriendsScreen()
        }

        composable<ProfileScreenRoute>{
           ProfileScreen()
        }

    }

}

@Serializable
object FeedScreenRoute

@Serializable
object SearchScreenRoute


@Serializable
object FriendsScreenRoute

@Serializable
object ProfileScreenRoute