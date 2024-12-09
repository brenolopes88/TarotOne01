package com.example.tarotone01

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        SpreadDetailScreen(3, title = "Cartas do Dia ")

    }
}

@Composable
fun SpreadsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Column(){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(230.dp)
                    .clickable {
                        navController.navigate("detailspread/3")
                    },
                contentAlignment = Alignment.Center
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_spread_3),
                        contentDescription = "3 cards spread",
                        modifier = Modifier.height(165.dp),
                    )
                    Text(
                        text = "Daillie 3 cards Spread",
                        style = androidx.compose.material.MaterialTheme.typography.h5,
                    )
                }

            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(230.dp)
                    .clickable {
                        navController.navigate("detailspread/5")
                    },
                contentAlignment = Alignment.Center
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_spread_5),
                        contentDescription = "3 cards spread",
                        modifier = Modifier.height(165.dp)
                    )
                    Text(
                        text = "Daillie 5 cards Spread",
                        style = androidx.compose.material.MaterialTheme.typography.h5,
                    )
                }

            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(230.dp)
                    .clickable {
                        navController.navigate("detailspread/10")
                    },
                contentAlignment = Alignment.Center
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_spread_10),
                        contentDescription = "3 cards spread",
                        modifier = Modifier.height(165.dp)
                    )
                    Text(
                        text = "Daillie 7 cards Spread",
                        style = androidx.compose.material.MaterialTheme.typography.h5,
                    )
                }

            }
        }


    }
}

@Composable
fun MeaningScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
    ) {
        ArchiveScreen(navController)

    }
}

@Composable
fun ProfileScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(text = "Profile Screen")

    }
}
