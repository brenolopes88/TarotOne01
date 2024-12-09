package com.example.tarotone01

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.tarotone01.cards.TarotDeck


@Composable
fun CardDetailScreen(cardId: String = "major_02", navController: NavHostController) {
    val card = TarotDeck.find { it.id == cardId }
    var isUpright by remember { mutableStateOf(card?.upright ?: true) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top
    ) {
        item {
            if (card != null) {
                Text(
                    text = card.title, style = MaterialTheme.typography.headlineMedium
                )

                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(200.dp), Alignment.Center
                ) {
                    Row() {
                        Image(painter = painterResource(id = card.imageResId),
                            contentDescription = card.title,
                            modifier = Modifier
                                .padding(24.dp)
                                .clickable { isUpright = true })
                        Image(painter = painterResource(id = card.imageResId),
                            contentDescription = card.title,
                            modifier = Modifier
                                .padding(24.dp)
                                .graphicsLayer(rotationZ = 180f)
                                .clickable { isUpright = false })
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = if (isUpright) "Upright" else "Reversed",
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = if (isUpright) card.upDescription else card.revDescription,
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("History: ")
                        }
                        append(card.history)
                    }, style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Meaning: ")
                        }
                        append(if (isUpright) card.meaningUpright else card.meaningReversed)
                    }, style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                            append("Keywords: ")
                        }
                        append(
                            if (isUpright) card.keywordsUpright.joinToString(", ") else card.keywordsReversed.joinToString(
                                ", "
                            )
                        )
                    }, style = MaterialTheme.typography.bodyLarge
                )
            } else {
                Text(text = "Card not found")
            }
        }
    }
}