package com.example.tarotone01

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.navigation.NavType
import androidx.navigation.navArgument

@Composable
fun TarotOneApp() {

    val navController = rememberNavController()

    Scaffold(topBar = { TopBarBG(navController) },
        bottomBar = { BottomBarMenu(navController) }) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BtNavItem.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable(BtNavItem.Home.route) { HomeScreen(navController) }
            composable(BtNavItem.Spreads.route) { SpreadsScreen(navController) }
            composable(BtNavItem.Meaning.route) { MeaningScreen(navController) }
            composable(BtNavItem.Profile.route) { ProfileScreen(navController) }
            composable("detail/{cardId}") { backStackEntry ->
                val cardId = backStackEntry.arguments?.getString("cardId")
                if (cardId != null) {
                    CardDetailScreen(cardId, navController)
                }
            }
            composable(
                route = "detailspread/{count}/{title}",
                arguments = listOf(navArgument("count") { type = NavType.IntType },
                    navArgument("title") { type = NavType.StringType }) // Specify type
            ) { backStackEntry ->
                val spreadCount = backStackEntry.arguments?.getInt("count")
                val spreadTitle = backStackEntry.arguments?.getString("title")
                if (spreadCount != null && spreadTitle != null) {
                    SpreadDetailScreen(count = spreadCount, title = spreadTitle)
                } else {
                    // Handle the case where count is missing or invalid
                    Text("Error: Missing or invalid count")
                }
            }
        }
    }
}