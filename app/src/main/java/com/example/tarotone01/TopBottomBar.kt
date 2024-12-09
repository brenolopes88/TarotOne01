package com.example.tarotone01

import android.R.attr.alpha
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.compose.animation.*
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tarotone01.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarBG(navController: NavHostController) {
    // Nav adressing
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route ?: "home"

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
    ) {

        //Images for each route
        val topBarImages = when {
            currentRoute == "home" -> R.drawable.bg_home
            currentRoute == "spreads" -> R.drawable.bg_spreads
            currentRoute == "meaning"||currentRoute.startsWith("detail/{cardId}") -> R.drawable.bg_meaning
            currentRoute == "profile" -> R.drawable.bg_profile
            else -> null
        }

        topBarImages?.let {
            Image(
                painter = painterResource(id = it),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .height(120.dp),
                contentScale = ContentScale.Crop
            )
        }

        CenterAlignedTopAppBar(
            title = {

            },
            navigationIcon = {
                Image(
                    painter = painterResource(id = R.drawable.ic_menu),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    contentScale = ContentScale.Crop
                )
            },
            actions = {
                Image(
                    painter = painterResource(id = R.drawable.ic_settings),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                )
            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Color.Transparent
            )
        )
    }
}


data class TarotCard(val id: String, val imageResId: Int)



sealed class BtNavItem(val route: String, val title: String, val icon: Int) {
    object Home : BtNavItem("home", "Home", R.drawable.ic_menu_home)
    object Spreads : BtNavItem("spreads", "Spreads", R.drawable.ic_menu_spreads)
    object Meaning : BtNavItem("meaning", "Meaning", R.drawable.ic_menu_meaning)
    object Profile : BtNavItem("profile", "Profile", R.drawable.ic_menu_profile)

}

@Composable
fun BottomBarMenu(navController: NavHostController) {
    val items = listOf(
        BtNavItem.Home,
        BtNavItem.Spreads,
        BtNavItem.Meaning,
        BtNavItem.Profile,
    )
    BottomNavigation(
        backgroundColor = Color.Black,
        contentColor = Color.White,
        modifier = Modifier
            .height(120.dp)
            .alpha(0.85f)
            .navigationBarsPadding(),
        elevation = 15.dp,

        ) {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route ?: "home"

        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(item.title) },
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route)
                    }
                }


            )

        }
    }
}