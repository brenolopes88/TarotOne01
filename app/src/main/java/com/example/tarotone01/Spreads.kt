package com.example.tarotone01


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.tarotone01.cards.TarotCardDetail
import com.example.tarotone01.cards.TarotDeck
import kotlin.String

@Composable
fun SpreadDetailScreen(count: Int, cards: List<TarotCardDetail> = TarotDeck, title: String) {

    val shuffledCards = remember { cards.shuffled().toTypedArray() }
    val todaysCards = shuffledCards.take(count)
    val selectedCard = remember { mutableStateOf<TarotCardDetail?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .height(280.dp)
        ) {
            items(todaysCards) { card ->
                val isSelected = selectedCard.value == card

                Box(modifier = Modifier
                    .height(if (isSelected) 250.dp else 230.dp) // Increase size if selected
                    .width(if (isSelected) 150.dp else 130.dp) // Increase size if selected
                    .clickable { selectedCard.value = card } // Set the selected card on click
                    .border(
                        width = if (isSelected) 2.dp else 1.dp, // Add border for selected card
                        color = if (isSelected) MaterialTheme.colorScheme.primary else Color.Gray,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(8.dp)) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Box(modifier = Modifier.height(35.dp)) {
                            Text(
                                text = card.title,
                                style = MaterialTheme.typography.bodyMedium,
                                textAlign = TextAlign.Center
                            )
                        }

                        Spacer(modifier = Modifier.height(8.dp))

                        Box(modifier = Modifier.height(165.dp)){
                            Image(
                                painter = painterResource(id = card.imageResId),
                                contentDescription = card.title,
                                modifier = Modifier.size(if (isSelected) 175.dp else 150.dp)
                            )
                        }

                    }
                }
            }
        }

        selectedCard.value?.let { card ->
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Keywords: ${card.keywordsUpright.joinToString(", ")}",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                Text(
                    text = "Meaning: ${card.meaningUpright}",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
        }
    }
}
