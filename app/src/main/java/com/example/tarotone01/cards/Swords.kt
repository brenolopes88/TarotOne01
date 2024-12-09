package com.example.tarotone01.cards

import com.example.tarotone01.R


val swordsCards = listOf(
    TarotCardDetail(
        id = "swords_01",
        title = "Ace of Swords",
        upDescription = "The Ace of Swords represents clarity, truth, and breakthroughs. It symbolizes the power of the mind and new beginnings in thought and communication.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_01, // Replace with the actual resource ID
        history = """
        The Ace of Swords traditionally depicts a hand holding a sword emerging from a cloud, symbolizing divine inspiration and the triumph of reason over confusion.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Ace of Swords signifies mental clarity, new ideas, and the courage to face the truth. It encourages using logic and intellect to overcome challenges.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate confusion, miscommunication, or a lack of focus. It suggests reassessing your thoughts and seeking clarity before taking action.
    """.trimIndent(),
        keywordsUpright = listOf("Clarity", "Breakthrough", "Truth", "Intellect", "New Ideas"),
        keywordsReversed = listOf("Confusion", "Miscommunication", "Mental Block"),
        element = "Air",
        planet = "Mercury",
        associatedNumerology = 1,
        associatedSign = "Gemini",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_02",
        title = "Two of Swords",
        upDescription = "The Two of Swords represents decision-making, balance, and the challenge of weighing opposing options or ideas.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_02, // Replace with the actual resource ID
        history = """
        Traditionally, the Two of Swords depicts a blindfolded figure holding two crossed swords, symbolizing the need for balance and a difficult choice.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Two of Swords signifies the need to make a decision, often between two equally challenging options. It encourages finding balance and seeking clarity.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate indecision, avoidance, or being stuck between conflicting choices. It advises facing the issue head-on to move forward.
    """.trimIndent(),
        keywordsUpright = listOf("Decisions", "Balance", "Choices", "Inner Conflict"),
        keywordsReversed = listOf("Indecision", "Avoidance", "Confusion"),
        element = "Air",
        planet = "Moon",
        associatedNumerology = 2,
        associatedSign = "Libra",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_03",
        title = "Three of Swords",
        upDescription = "The Three of Swords represents heartbreak, sorrow, and emotional pain. It often symbolizes challenges in relationships or personal struggles.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_03, // Replace with the actual resource ID
        history = """
        The Three of Swords traditionally depicts a heart pierced by three swords, often with rain or stormy clouds, symbolizing grief and emotional suffering.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Three of Swords signifies heartbreak, loss, or emotional upheaval. It encourages acknowledging pain and seeking healing through introspection.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate recovery, forgiveness, or releasing past pain. It advises letting go of emotional burdens and embracing a new chapter.
    """.trimIndent(),
        keywordsUpright = listOf("Heartbreak", "Loss", "Sorrow", "Emotional Pain"),
        keywordsReversed = listOf("Recovery", "Forgiveness", "Healing"),
        element = "Air",
        planet = "Saturn",
        associatedNumerology = 3,
        associatedSign = "Libra",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_04",
        title = "Four of Swords",
        upDescription = "The Four of Swords represents rest, recovery, and contemplation. It encourages taking a step back to restore mental and emotional balance.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_04, // Replace with the actual resource ID
        history = """
        The Four of Swords often depicts a figure lying down with hands clasped, as if in meditation or rest, symbolizing recovery and introspection.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Four of Swords signifies rest, recuperation, and mental clarity. It encourages stepping back to regain perspective and energy.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate burnout, restlessness, or the inability to pause. It advises prioritizing self-care and finding time to recharge.
    """.trimIndent(),
        keywordsUpright = listOf("Rest", "Recovery", "Introspection", "Clarity"),
        keywordsReversed = listOf("Burnout", "Restlessness", "Overwhelm"),
        element = "Air",
        planet = "Jupiter",
        associatedNumerology = 4,
        associatedSign = "Libra",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_05",
        title = "Five of Swords",
        upDescription = "The Five of Swords represents conflict, tension, and the aftermath of a battle. It symbolizes the consequences of winning at any cost.",

        revDescription = "to do ",
        imageResId = R.drawable.swords_05, // Replace with the actual resource ID
        history = """
        The Five of Swords typically depicts a figure holding swords after a battle, with two figures walking away. This suggests the futility of fighting and the cost of conflict.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Five of Swords signifies conflict, tension, and the potential for betrayal. It may indicate a hollow victory, where the aftermath is more damaging than the win.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate the resolution of conflict or a desire for reconciliation. It suggests letting go of grudges and moving on from past battles.
    """.trimIndent(),
        keywordsUpright = listOf("Conflict", "Tension", "Betrayal", "Hollow Victory"),
        keywordsReversed = listOf("Resolution", "Reconciliation", "Forgiveness"),
        element = "Air",
        planet = "Venus",
        associatedNumerology = 5,
        associatedSign = "Aquarius",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_06",
        title = "Six of Swords",
        upDescription = "The Six of Swords represents transition, change, and moving forward. It signifies leaving behind difficulties and finding peace.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_06, // Replace with the actual resource ID
        history = """
        The Six of Swords traditionally depicts a boat carrying figures across a body of water, symbolizing a journey away from turbulent times toward calmer waters.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Six of Swords signifies moving forward after a difficult period. It suggests leaving behind emotional baggage and heading toward a more peaceful state of mind.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate stagnation or reluctance to move on. It suggests a need to accept the past in order to heal and move forward.
    """.trimIndent(),
        keywordsUpright = listOf("Transition", "Change", "Healing", "Moving On"),
        keywordsReversed = listOf("Stagnation", "Reluctance", "Resistance to Change"),
        element = "Air",
        planet = "Mercury",
        associatedNumerology = 6,
        associatedSign = "Aquarius",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_07",
        title = "Seven of Swords",
        upDescription = "The Seven of Swords represents deception, strategy, and secrecy. It suggests acting stealthily or avoiding confrontation.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_07, // Replace with the actual resource ID
        history = """
        The Seven of Swords often depicts a figure sneaking away with swords, suggesting trickery, secrecy, or the need for discretion in a given situation.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Seven of Swords suggests deception or the need for a strategic approach to a problem. It may indicate someone is acting covertly or hiding their intentions.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate coming clean, revealing the truth, or facing up to one's actions. It suggests honesty after a period of secrecy or avoidance.
    """.trimIndent(),
        keywordsUpright = listOf("Deception", "Strategy", "Secrecy", "Avoidance"),
        keywordsReversed = listOf("Honesty", "Truth", "Revelation", "Confrontation"),
        element = "Air",
        planet = "Moon",
        associatedNumerology = 7,
        associatedSign = "Aquarius",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_08",
        title = "Eight of Swords",
        upDescription = "The Eight of Swords represents restriction, limitation, and a sense of being trapped. It suggests being bound by one's own thoughts or circumstances.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_08, // Replace with the actual resource ID
        history = """
        The Eight of Swords often depicts a figure trapped by swords, symbolizing mental imprisonment or the illusion of being unable to escape a situation.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Eight of Swords signifies feeling trapped, restricted, or bound by circumstances. It suggests overcoming self-imposed limitations through clarity of thought.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card indicates the possibility of breaking free from these limitations. It suggests that the restrictions are self-imposed and can be lifted by changing perspective.
    """.trimIndent(),
        keywordsUpright = listOf("Restriction", "Limitation", "Trapped", "Mental Block"),
        keywordsReversed = listOf("Freedom", "Release", "Overcoming Obstacles"),
        element = "Air",
        planet = "Jupiter",
        associatedNumerology = 8,
        associatedSign = "Gemini",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_09",
        title = "Nine of Swords",
        upDescription = "The Nine of Swords represents anxiety, guilt, and mental anguish. It reflects the torment of the mind and the fear of worst-case scenarios.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_09, // Replace with the actual resource ID
        history = """
        The Nine of Swords traditionally depicts a figure sitting up in bed, hands on their face, reflecting the agony of sleepless nights filled with worry and fear.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Nine of Swords signifies anxiety, worry, and sleepless nights. It suggests that fear and guilt are taking a toll on one's mental health, but it also represents the power to overcome these fears.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card indicates the possibility of release from anxiety or the easing of guilt. It suggests working through the torment and finding peace of mind.
    """.trimIndent(),
        keywordsUpright = listOf("Anxiety", "Guilt", "Mental Anguish", "Fear"),
        keywordsReversed = listOf("Release", "Peace of Mind", "Healing", "Letting Go"),
        element = "Air",
        planet = "Mars",
        associatedNumerology = 9,
        associatedSign = "Gemini",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_10",
        title = "Ten of Swords",
        upDescription = "The Ten of Swords represents betrayal, loss, and the ending of a painful cycle. It suggests hitting rock bottom but also the potential for recovery and new beginnings.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_10, // Replace with the actual resource ID
        history = """
        The Ten of Swords traditionally depicts a figure lying face down, stabbed by ten swords, symbolizing the finality of a painful situation or betrayal.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Ten of Swords signifies a painful ending, betrayal, or being at rock bottom. However, it also indicates that this is the end of the cycle, and recovery is possible.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may suggest a difficult situation coming to a close or relief after suffering. It also represents the opportunity to heal and rebuild after hardship.
    """.trimIndent(),
        keywordsUpright = listOf("Betrayal", "Painful Ending", "Rock Bottom", "Defeat"),
        keywordsReversed = listOf("Recovery", "Healing", "New Beginnings", "Relief"),
        element = "Air",
        planet = "Sun",
        associatedNumerology = 10,
        associatedSign = "Gemini",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_page",
        title = "Page of Swords",
        upDescription = "The Page of Swords represents curiosity, exploration, and the desire for knowledge. It symbolizes a fresh, youthful approach to discovering new ideas.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_page, // Replace with the actual resource ID
        history = """
        The Page of Swords often depicts a youthful figure with a sword, symbolizing a sharp mind and the willingness to ask questions, seek out truths, and engage in intellectual pursuits.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Page of Swords represents a thirst for knowledge and new experiences. It may suggest a time for studying, learning, or researching something new.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may indicate gossip, spying, or the need to be cautious with the information you share. It warns against using intellect in a manipulative or deceitful way.
    """.trimIndent(),
        keywordsUpright = listOf("Curiosity", "Learning", "Discovery", "Youthful Energy"),
        keywordsReversed = listOf("Gossip", "Spying", "Deception", "Insecurity"),
        element = "Air",
        planet = "Earth",
        associatedNumerology = 11,
        associatedSign = "Gemini",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_knight",
        title = "Knight of Swords",
        upDescription = "The Knight of Swords represents action, ambition, and determination. It signifies someone who charges ahead with a clear goal and is willing to overcome any obstacle to achieve it.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_knight, // Replace with the actual resource ID
        history = """
        The Knight of Swords depicts a figure riding swiftly into battle, embodying determination, mental sharpness, and the drive to take swift action to achieve one's goals.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Knight of Swords signifies a period of assertive action, quick thinking, and direct communication. It encourages making decisions and pushing forward with confidence.
    """.trimIndent(),
        meaningReversed = """
        Reversed, the Knight of Swords suggests impulsive behavior, reckless actions, or being overly focused on a goal without considering the consequences. It warns against rushing into situations.
    """.trimIndent(),
        keywordsUpright = listOf("Action", "Ambition", "Determination", "Quick Thinking"),
        keywordsReversed = listOf("Impulsiveness", "Recklessness", "Conflict", "Unfocused"),
        element = "Air",
        planet = "Mars",
        associatedNumerology = 12,
        associatedSign = "Aquarius",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_queen",
        title = "Queen of Swords",
        upDescription = "The Queen of Swords represents clarity, intellect, and wisdom. She embodies an objective and rational approach to life’s challenges, balancing emotion with reason.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_queen, // Replace with the actual resource ID
        history = """
        The Queen of Swords is often depicted as a calm and collected figure, wielding her sword with precision. She represents mental clarity, independence, and the ability to see through deception.
    """.trimIndent(),
        meaningUpright = """
        Upright, the Queen of Swords signifies clarity of thought, rationality, and unbiased judgment. She encourages speaking your truth and using intellect to solve problems or make decisions.
    """.trimIndent(),
        meaningReversed = """
        Reversed, the Queen of Swords may indicate emotional coldness, detachment, or the need to reevaluate a situation. It suggests being cautious of becoming too harsh or judgmental.
    """.trimIndent(),
        keywordsUpright = listOf("Clarity", "Wisdom", "Independence", "Rationality"),
        keywordsReversed = listOf("Coldness", "Harshness", "Detachment", "Judgmental"),
        element = "Air",
        planet = "Venus",
        associatedNumerology = 13,
        associatedSign = "Libra",
        suit = "Swords"
    ),
    TarotCardDetail(
        id = "swords_king",
        title = "King of Swords",
        upDescription = "The King of Swords represents authority, logic, and leadership. He embodies a master of intellect, using reason and analysis to lead with fairness and wisdom.",
        revDescription = "to do ",

        imageResId = R.drawable.swords_king, // Replace with the actual resource ID
        history = """
        The King of Swords is depicted as a strong, authoritative figure holding a sword, symbolizing his ability to use intellect, diplomacy, and fairness in leadership and decision-making.
    """.trimIndent(),
        meaningUpright = """
        Upright, the King of Swords signifies intellectual authority, logical decision-making, and mastery of communication. He encourages clear thinking, fair judgment, and leadership by example.
    """.trimIndent(),
        meaningReversed = """
        Reversed, this card may suggest misuse of power, manipulation, or overly rigid thinking. It warns against being overly critical, domineering, or disconnected from emotions.
    """.trimIndent(),
        keywordsUpright = listOf("Authority", "Intellect", "Leadership", "Fairness"),
        keywordsReversed = listOf("Manipulation", "Rigid Thinking", "Misuse of Power", "Coldness"),
        element = "Air",
        planet = "Jupiter",
        associatedNumerology = 14,
        associatedSign = "Aquarius",
        suit = "Swords"
    )
)
