package com.example.tarotone01.cards

import com.example.tarotone01.cupsCards


class TarotCardDetail(
    val id: String,
    val title: String,
    val upDescription: String,
    val revDescription: String,
    val imageResId: Int,
    val history: String,
    val meaningUpright: String, // Meaning of the card when it’s upright **
    val meaningReversed: String, // Meaning of the card when it’s reversed **
    val keywordsUpright: List<String>, // Keywords associated with the card (e.g., "Beginnings", "Innocence") **
    val keywordsReversed: List<String>, // Keywords associated with the card (e.g., "Beginnings", "Innocence") **
    val element: String,
    val planet: String,
    val associatedNumerology: Int, // Numerology number of the card (e.g., "0" for The Fool) **
    val associatedSign: String,
    val suit: String,
    val upright: Boolean = false // Whether the card is upright or reversed
)

val TarotDeck = majorArcanaCards + wandsCards + swordsCards + cupsCards + pentaclesCards

data class TarotCategory(
    val title: String,
    val cards: List<TarotCardDetail>
)

val tarotCategories = listOf(
    TarotCategory(
        title = "Major Arcana",
        cards = majorArcanaCards // List of Major Arcana cards
    ),
    TarotCategory(
        title = "Pentacles",
        cards = pentaclesCards // List of Pentacles cards
    ),
    TarotCategory(
        title = "Wands",
        cards = wandsCards // List of Wands cards
    ),
    TarotCategory(
        title = "Cups",
        cards = cupsCards // List of Cups cards
    ),
    TarotCategory(
        title = "Swords",
        cards = swordsCards // List of Swords cards
    )
)