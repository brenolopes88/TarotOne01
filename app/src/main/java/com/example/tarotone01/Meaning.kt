package com.example.tarotone01


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.tarotone01.cards.TarotCardDetail
import com.example.tarotone01.cards.TarotDeck
import com.example.tarotone01.cards.majorArcanaCards
import com.example.tarotone01.cards.pentaclesCards
import com.example.tarotone01.cards.swordsCards
import com.example.tarotone01.cards.wandsCards

@Composable
fun ArchiveScreen(navController: NavHostController) {

    val allCards = listOf(majorArcanaCards, pentaclesCards, swordsCards,wandsCards, cupsCards, )
    val tabsTitle = listOf("Major Arcana", "Pentacles", "Swords", "Wands", "Cups")
    val tabState = remember { mutableIntStateOf(0) }

    ScrollableTabRow(
        selectedTabIndex = tabState.intValue,
        modifier = Modifier.fillMaxWidth(),
    ) {
        tabsTitle.forEachIndexed { index, title ->
            Tab(selected = tabState.intValue == index,
                onClick = { tabState.intValue = index },
                text = { Text(text = title, style = MaterialTheme.typography.labelLarge) })
        }
    }

    when (tabState.intValue) {
        0 -> AllCardsTabContent(allCards[0], navController)
        1 -> AllCardsTabContent(allCards[1], navController)
        2 -> AllCardsTabContent(allCards[2], navController)
        3 -> AllCardsTabContent(allCards[3], navController)
        4 -> AllCardsTabContent(allCards[4], navController)
        5 -> AllCardsTabContent(TarotDeck, navController)
    }
}

@Composable
fun AllCardsTabContent(list: List<TarotCardDetail>, navController: NavHostController) {

    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 120.dp),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(list) { item ->
            Box(modifier = Modifier
                .height(230.dp)
                .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
                .clickable {
                    navController.navigate("detail/${item.id}")
                }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = painterResource(id = item.imageResId),
                        contentDescription = item.title,
                        modifier = Modifier.height(165.dp)
                    )
                    Text(
                        item.title,
                        style = androidx.compose.material.MaterialTheme.typography.body1,
                    )
                }
            }
        }
    }
}