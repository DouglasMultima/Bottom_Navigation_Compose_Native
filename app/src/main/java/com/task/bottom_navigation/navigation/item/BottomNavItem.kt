package com.task.bottom_navigation.navigation.item

import androidx.annotation.DrawableRes
import com.task.bottom_navigation.R

sealed class BottomNavItem(

    val title : Int,
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int,

    ){

    data object Feed : BottomNavItem(

        title = R.string.bottom_bar_item_feed,
        selectedIcon = R.drawable.home_fill,
        unselectedIcon = R.drawable.home_line

    )

    data object Search : BottomNavItem(

        title = R.string.bottom_bar_item_search,
        selectedIcon = R.drawable.search_fill,
        unselectedIcon = R.drawable.search_line

    )

    data object Friends : BottomNavItem(

        title = R.string.bottom_bar_item_friends,
        selectedIcon = R.drawable.group_fill,
        unselectedIcon = R.drawable.group_line

    )


    data object Profile : BottomNavItem(

        title = R.string.bottom_bar_item_profile,
        selectedIcon = R.drawable.user_settings_fill,
        unselectedIcon = R.drawable.user_settings_line

    )

    companion object{

        val items = listOf(Feed,Search,Friends,Profile)

    }






}