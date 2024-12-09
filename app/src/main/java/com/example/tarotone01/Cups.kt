package com.example.tarotone01


val cupsCards = listOf(
    TarotCardDetail(
        id = "cups_01",
        title = "Ace of Cups",
        upDescription = "The Ace of Cups represents emotional fulfillment, new beginnings in relationships, and the flow of love and compassion.",
        revDescription = "The Ace of Cups reverse represents blocked emotions and unrequited love",
        imageResId = R.drawable.cups_01, // Replace with the actual resource ID
        history = """
        Often depicted as an overflowing chalice, the Ace of Cups symbolizes the potential for emotional renewal and the awakening of the heart.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Ace of Cups signifies new relationships, love, and emotional fulfillment. It encourages embracing your feelings and expressing them openly.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate emotional blockages, unrequited love, or difficulty in expressing emotions. It suggests working on emotional healing and self-love.
    """.trimIndent(),
        keywordsUpright = listOf("Love", "Compassion", "Emotional Renewal", "Relationships", "Creativity"),
        keywordsReversed = listOf("Blocked Emotions", "Unrequited Love", "Emotional Healing"),
        element = "Water",
        planet = "Venus",
        associatedNumerology = 1,
        associatedSign = "Cancer",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_02",
        title = "Two of Cups",
        upDescription = "The Two of Cups represents partnership, harmony, and mutual respect in relationships.",
        revDescription = "The Two of Cups reverse represents imbalance, miscommunication, and tension.",
        imageResId = R.drawable.cups_02, // Replace with the actual resource ID
        history = """
        This card often depicts two individuals exchanging cups, symbolizing connection, love, and equality in relationships.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Two of Cups signifies strong partnerships, romantic unions, and emotional balance. It encourages building relationships based on trust and mutual understanding.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card warns of imbalance, tension, or lack of harmony in relationships. It suggests addressing issues openly and striving for understanding.
    """.trimIndent(),
        keywordsUpright = listOf("Partnership", "Harmony", "Union", "Love", "Balance"),
        keywordsReversed = listOf("Imbalance", "Miscommunication", "Tension"),
        element = "Water",
        planet = "Venus",
        associatedNumerology = 2,
        associatedSign = "Cancer",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_03",
        title = "Three of Cups",
        upDescription = "The Three of Cups symbolizes celebration, friendship, and shared joy.",
        revDescription = "The Three of Cups reverse symbolizes Overindulgence , gossip and loneliness.",
        imageResId = R.drawable.cups_03, // Replace with the actual resource ID
        history = """
        Traditionally shown with three figures raising their cups in a toast, this card reflects community, unity, and shared happiness.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Three of Cups signifies celebration, teamwork, and the support of close friends and family. It encourages cherishing moments of togetherness.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may suggest overindulgence, gossip, or feelings of isolation. It advises focusing on meaningful connections.
    """.trimIndent(),
        keywordsUpright = listOf("Celebration", "Friendship", "Unity", "Happiness"),
        keywordsReversed = listOf("Overindulgence", "Gossip", "Loneliness"),
        element = "Water",
        planet = "Mercury",
        associatedNumerology = 3,
        associatedSign = "Cancer",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_04",
        title = "Four of Cups",
        upDescription = "The Four of Cups represents introspection, contemplation, and the need to reassess opportunities.",
        revDescription = "The Four of Cups reverse renewed focus ",
        imageResId = R.drawable.cups_04, // Replace with the actual resource ID
        history = """
        Often depicted as a figure sitting under a tree, ignoring a cup being offered, this card symbolizes introspection and the challenge of finding gratitude.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Four of Cups encourages reevaluating your emotional state and the opportunities around you. It suggests the need for gratitude and mindfulness.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate a new awareness, seizing opportunities, or breaking free from stagnation. It suggests a shift in emotional perspective.
    """.trimIndent(),
        keywordsUpright = listOf("Contemplation", "Introspection", "Stagnation", "Opportunities"),
        keywordsReversed = listOf("Awareness", "Opportunity", "Renewed Focus"),
        element = "Water",
        planet = "Moon",
        associatedNumerology = 4,
        associatedSign = "Cancer",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_05",
        title = "Five of Cups",
        upDescription = "The Five of Cups represents loss, disappointment, and focusing on the negative while overlooking remaining opportunities.",
        revDescription = "The Five of Cups reverse represents recovery, hope and acceptance",
        imageResId = R.drawable.cups_05, // Replace with the actual resource ID
        history = """
        This card traditionally shows a figure mourning over three spilled cups, while two remain upright, symbolizing a sense of loss and the need to shift perspective.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Five of Cups signifies feelings of regret, sadness, or failure. It encourages finding the strength to move on and appreciate what remains.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate emotional recovery, acceptance, and renewed hope. It suggests learning from past mistakes and moving forward.
    """.trimIndent(),
        keywordsUpright = listOf("Loss", "Regret", "Sadness", "Disappointment"),
        keywordsReversed = listOf("Recovery", "Hope", "Acceptance"),
        element = "Water",
        planet = "Mars",
        associatedNumerology = 5,
        associatedSign = "Scorpio",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_06",
        title = "Six of Cups",
        upDescription = "The Six of Cups represents nostalgia, childhood memories, and the simple joys of the past.",
        revDescription = "The Six of Cups reverse represents avoidance and living in the past ",
        imageResId = R.drawable.cups_06, // Replace with the actual resource ID
        history = """
        Traditionally, this card shows children exchanging cups filled with flowers, evoking themes of innocence, generosity, and joyful recollection.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Six of Cups encourages embracing happy memories, reconnecting with loved ones, or finding joy in simple pleasures.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card warns against being stuck in the past, avoiding responsibilities, or romanticizing bygone times. It advises focusing on the present.
    """.trimIndent(),
        keywordsUpright = listOf("Nostalgia", "Innocence", "Generosity", "Joy"),
        keywordsReversed = listOf("Living in the Past", "Unrealistic Expectations", "Avoidance"),
        element = "Water",
        planet = "Sun",
        associatedNumerology = 6,
        associatedSign = "Scorpio",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_07",
        title = "Seven of Cups",
        upDescription = "The Seven of Cups represents choices, dreams, and the challenge of discerning reality from illusion.",
        revDescription = "The Seven of Cups reverse represents clarity and focus .",
        imageResId = R.drawable.cups_07, // Replace with the actual resource ID
        history = """
        This card often depicts a figure gazing at seven cups filled with various symbols, highlighting the complexity of choices and the allure of illusions.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Seven of Cups signifies a wealth of options, daydreaming, and imagination. It advises careful consideration and focusing on what's truly achievable.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate clarity, realistic choices, and overcoming confusion. It suggests grounding your aspirations in reality.
    """.trimIndent(),
        keywordsUpright = listOf("Choices", "Dreams", "Illusions", "Imagination"),
        keywordsReversed = listOf("Clarity", "Realism", "Focus"),
        element = "Water",
        planet = "Neptune",
        associatedNumerology = 7,
        associatedSign = "Scorpio",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_08",
        title = "Eight of Cups",
        upDescription = "The Eight of Cups represents leaving behind what no longer serves you to pursue personal fulfillment.",
        revDescription = "The Eight of Cups reverse represents stagnation, fear of change and resistance",
        imageResId = R.drawable.cups_08, // Replace with the actual resource ID
        history = """
        This card traditionally shows a figure walking away from eight cups, symbolizing the courage to let go of the familiar to seek deeper meaning.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Eight of Cups signifies letting go, introspection, and the pursuit of higher goals. It encourages prioritizing personal growth over comfort.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate fear of change, stagnation, or difficulty leaving an unfulfilling situation. It suggests examining what’s holding you back.
    """.trimIndent(),
        keywordsUpright = listOf("Letting Go", "Introspection", "Personal Growth", "Pursuit"),
        keywordsReversed = listOf("Stagnation", "Fear of Change", "Resistance"),
        element = "Water",
        planet = "Saturn",
        associatedNumerology = 8,
        associatedSign = "Pisces",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_09",
        title = "Nine of Cups",
        upDescription = "The Nine of Cups represents contentment, satisfaction, and emotional fulfillment.",
        revDescription = "The Nine of Cups reverse represents dissatisfaction overindulgence and overexposure.",
        imageResId = R.drawable.cups_09, // Replace with the actual resource ID
        history = """
        Known as the 'wish card,' this card often depicts a figure sitting in front of nine cups, signifying joy, gratitude, and abundance.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Nine of Cups signifies happiness, emotional well-being, and the realization of personal desires. It encourages gratitude for what you’ve achieved.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate dissatisfaction, overindulgence, or unfulfilled desires. It advises reflection on what truly brings contentment.
    """.trimIndent(),
        keywordsUpright = listOf("Contentment", "Gratitude", "Fulfillment", "Abundance"),
        keywordsReversed = listOf("Dissatisfaction", "Overindulgence", "Emptiness"),
        element = "Water",
        planet = "Jupiter",
        associatedNumerology = 9,
        associatedSign = "Pisces",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_10",
        title = "Ten of Cups",
        upDescription = "The Ten of Cups represents harmony, family happiness, and emotional fulfillment on a deep level.",
        revDescription = "The Ten of Cups represents dissatisfaction and emotional strain.",
        imageResId = R.drawable.cups_10, // Replace with the actual resource ID
        history = """
        Often depicted as a family beneath a rainbow of cups, this card symbolizes lasting happiness, peace, and emotional contentment.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Ten of Cups signifies long-term happiness, family harmony, and fulfillment in relationships. It celebrates emotional connection and love.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate strained relationships, broken dreams, or dissatisfaction. It suggests reevaluating your emotional priorities.
    """.trimIndent(),
        keywordsUpright = listOf("Harmony", "Happiness", "Fulfillment", "Connection"),
        keywordsReversed = listOf("Strain", "Dissatisfaction", "Broken Dreams"),
        element = "Water",
        planet = "Mars",
        associatedNumerology = 10,
        associatedSign = "Pisces",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_page",
        title = "Page of Cups",
        upDescription = "The Page of Cups represents emotional openness, curiosity, and the beginning of creative or emotional exploration.",
        revDescription = "The Page of Cups represents emotional blockages, moodiness, and unrealistic expectations.",
        imageResId = R.drawable.cups_page, // Replace with the actual resource ID
        history = """
        Traditionally, the Page of Cups depicts a youthful figure holding a cup with a fish, symbolizing imagination and unexpected inspiration.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Page of Cups signifies new emotional experiences, creative endeavors, and openness to inspiration. It encourages embracing your inner child.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate emotional immaturity, creative blockages, or a reluctance to express feelings. It suggests addressing these vulnerabilities.
    """.trimIndent(),
        keywordsUpright = listOf("Imagination", "Inspiration", "Openness", "Curiosity"),
        keywordsReversed = listOf("Immaturity", "Blockages", "Repression"),
        element = "Water",
        planet = "Moon",
        associatedNumerology = 11,
        associatedSign = "Pisces",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_knight",
        title = "Knight of Cups",
        upDescription = "The Knight of Cups represents romanticism, creativity, and pursuing one’s dreams with passion and grace.",
        revDescription = "The Knight of Cups represents unrealistic expectations and imbalances",
        imageResId = R.drawable.cups_knight, // Replace with the actual resource ID
        history = """
        The Knight of Cups often depicts a knight holding a cup, symbolizing the pursuit of emotional or creative goals with charm and sensitivity.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Knight of Cups signifies pursuing your passions, following your heart, and embracing creativity. It encourages listening to your intuition.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate over-romanticizing, moodiness, or unrealistic expectations. It advises finding balance in emotional pursuits.
    """.trimIndent(),
        keywordsUpright = listOf("Romance", "Charm", "Creativity", "Dreams"),
        keywordsReversed = listOf("Moodiness", "Unrealistic Expectations", "Imbalance"),
        element = "Water",
        planet = "Venus",
        associatedNumerology = 12,
        associatedSign = "Scorpio",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_queen",
        title = "Queen of Cups",
        upDescription = "The Queen of Cups represents emotional intelligence, compassion, and intuitive wisdom.",
        revDescription = "The Queen of Cups represents emotional insecurity, emotional overload, and emotional withdrawal.",
        imageResId = R.drawable.cups_queen, // Replace with the actual resource ID
        history = """
        The Queen of Cups is often shown seated on a throne by the water, symbolizing emotional depth and a connection to intuition.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Queen of Cups signifies nurturing, understanding, and emotional balance. It encourages empathy and trusting your intuition.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate emotional overwhelm, insecurity, or codependency. It advises finding emotional stability and self-care.
    """.trimIndent(),
        keywordsUpright = listOf("Compassion", "Intuition", "Empathy", "Nurturing"),
        keywordsReversed = listOf("Insecurity", "Overwhelm", "Codependency"),
        element = "Water",
        planet = "Neptune",
        associatedNumerology = 13,
        associatedSign = "Cancer",
        suit = "Cups"
    ),
    TarotCardDetail(
        id = "cups_king",
        title = "King of Cups",
        upDescription = "The King of Cups represents emotional mastery, diplomacy, and the balance of intellect and feelings.",
        revDescription = "The King of Cups reversed represents emotional manipulation ,volatility and suppression.",
        imageResId = R.drawable.cups_king, // Replace with the actual resource ID
        history = """
        The King of Cups is depicted as a calm figure on a throne surrounded by water, symbolizing emotional stability and leadership.
    """.trimIndent(),
        meaningUpright = """
        Upright, the King of Cups signifies emotional balance, compassion, and wise leadership. It encourages handling challenges with empathy and composure.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate emotional manipulation, volatility, or suppressed feelings. It suggests addressing underlying emotions and fostering stability.
    """.trimIndent(),
        keywordsUpright = listOf("Balance", "Diplomacy", "Compassion", "Leadership"),
        keywordsReversed = listOf("Manipulation", "Volatility", "Suppression"),
        element = "Water",
        planet = "Pluto",
        associatedNumerology = 14,
        associatedSign = "Pisces",
        suit = "Cups"
    )
)
