package com.example.tarotone01

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
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
            .padding(16.dp)            ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        //Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Spreads", style = androidx.compose.material.MaterialTheme.typography.h4, modifier = Modifier.padding(16.dp))
        Box(modifier = Modifier
            .wrapContentSize()
            .height(230.dp)
            .clickable {
                navController.navigate("detailspread/3/Cartas do Dia")
            }) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_spread_3),
                    contentDescription = " 3 cards spread",
                    modifier = Modifier.height(165.dp)
                )
                Text(text = "Cartas do Dia", style = androidx.compose.material.MaterialTheme.typography.body1)
            }
        }
        Box(modifier = Modifier
            .wrapContentSize()
            .height(230.dp)
            .clickable {
                navController.navigate("detailspread/5/Cartas do Semana")
            }) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_spread_5),
                    contentDescription = " 5 spread",
                    modifier = Modifier.height(165.dp)
                )
                Text(text = "Cartas do Semana", style = androidx.compose.material.MaterialTheme.typography.body1)
            }
        }
        Box(modifier = Modifier
            .wrapContentSize()
            .height(230.dp)
            .clickable {
                navController.navigate("detailspread/10/Cartas do Mes")
            }) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_spread_10),
                    contentDescription = " 10 cards spread",
                    modifier = Modifier.height(165.dp)
                )
                Text(text = "Cartas do Mes", style = androidx.compose.material.MaterialTheme.typography.body1)
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
