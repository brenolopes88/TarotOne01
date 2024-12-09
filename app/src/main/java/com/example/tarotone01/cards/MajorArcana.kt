package com.example.tarotone01.cards

import com.example.tarotone01.R


var majorArcanaCards = listOf(

    TarotCardDetail(
        id = "major_00",
        title = "The Fool",
        imageResId = R.drawable.major_00, // Replace with actual resource ID for The Fool image
        upDescription = "The Fool represents new beginnings, innocence, and the pursuit of a journey with an open heart.",
        revDescription = "to do ",
        meaningUpright = """
        The Fool upright signifies embarking on a new adventure, trusting the unknown, and embracing the freedom of starting anew. It encourages living in the moment and having faith in the path ahead.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Fool may indicate recklessness, foolishness, or naivety. It suggests caution before jumping into new ventures or taking unnecessary risks.
    """.trimIndent(),
        keywordsUpright = listOf("Beginnings", "Innocence", "Freedom", "Adventure", "Trust"),
        keywordsReversed = listOf("Recklessness", "Foolishness", "Naivety"),
        element = "Air",
        planet = "Uranus",
        associatedNumerology = 0,
        suit = "Major Arcana",
        history = """
        The Fool is one of the 22 Major Arcana cards in the Tarot deck, symbolizing the beginning of a journey. It has roots in medieval imagery, often depicted as a carefree traveler or jester.
    """.trimIndent(),
        associatedSign = "Aquarius"

    ),
    TarotCardDetail(

        id = "major_01",
        title = "The Magician",
        imageResId = R.drawable.major_01,
        upDescription = "The Magician represents willpower, skill, and manifestation.",
        revDescription = "to do ",
        meaningUpright = "Upright, The Magician symbolizes mastery, creativity, and the ability to manifest one’s desires.",
        meaningReversed = "Reversed, The Magician may suggest deception, lack of focus, or manipulation.",
        keywordsUpright = listOf("Beginnings", "Innocence", "Freedom", "Adventure", "Trust"),
        keywordsReversed = listOf("Recklessness", "Foolishness", "Naivety"),
        element = "Air",
        planet = "Mercury",
        associatedNumerology = 1,
        suit = "Major Arcana",
        history = "The Magician is the card of creation, indicating the use of one's skills to achieve goals.",
        associatedSign = "Virgo"
    ),

    TarotCardDetail(
        id = "major_02",
        title = "The High Priestess",
        imageResId = R.drawable.major_02, // Replace with the actual resource ID
        upDescription = """
        The High Priestess represents intuition, mystery, and the deeper subconscious mind. She invites you to trust your inner wisdom and uncover the truths that lie within.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The High Priestess signifies intuition, spiritual enlightenment, and the discovery of hidden truths. She encourages reflection, stillness, and listening to your inner voice.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The High Priestess suggests blocked intuition, secrets being withheld, or a lack of understanding about yourself or a situation. It’s a reminder to reconnect with your inner wisdom.
    """.trimIndent(),
        keywordsUpright = listOf("Beginnings", "Innocence", "Freedom", "Adventure", "Trust"),
        keywordsReversed = listOf("Recklessness", "Foolishness", "Naivety"),
        element = "Water",
        planet = "Moon",
        associatedNumerology = 2,
        suit = "Major Arcana",
        history = """
        The High Priestess is one of the Major Arcana cards, symbolizing the gatekeeper to deeper knowledge and spiritual wisdom. Historically, she represents the archetype of a wise woman or oracle, embodying the power of intuition and the mysteries of the unknown.
    """.trimIndent(),
        associatedSign = "Cancer"
    ),
    TarotCardDetail(
        id = "major_03",
        title = "The Empress",
        imageResId = R.drawable.major_03, // Replace with the actual resource ID
        upDescription = """
        The Empress embodies fertility, abundance, and the nurturing aspect of creation. She symbolizes growth, harmony, and connection with the natural world.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Empress signifies creativity, fertility, nurturing energy, and abundance. It encourages the expression of love and the embracing of life's pleasures.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Empress suggests creative blocks, dependence, or neglect. It may also indicate a lack of self-care or unfulfilled potential.
    """.trimIndent(),
        keywordsUpright = listOf("Fertility", "Abundance", "Creativity", "Nurturing", "Harmony"),
        keywordsReversed = listOf(
            "Neglect",
            "Creative Blocks",
            "Overdependence",
            "Stagnation",
            "Imbalance"
        ),
        element = "Earth",
        planet = "Venus",
        associatedNumerology = 3,
        suit = "Major Arcana",
        history = """
        The Empress, as part of the Major Arcana, represents the archetype of the nurturing mother and the creative force of life. Historically, she has been seen as a symbol of growth, prosperity, and the interconnectedness of nature.
    """.trimIndent(),
        associatedSign = "Taurus"
    ),
    TarotCardDetail(
        id = "major_04",
        title = "The Emperor",
        imageResId = R.drawable.major_04, // Replace with the actual resource ID
        upDescription = """
        The Emperor represents authority, structure, and the power of rationality. He embodies the archetype of a father figure, offering protection, guidance, and stability.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Emperor signifies structure, authority, and discipline. It represents the ability to create order out of chaos and establish rules to maintain control.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Emperor suggests issues with control, rigidity, or misuse of authority. It may indicate challenges with independence or resistance to structure.
    """.trimIndent(),
        keywordsUpright = listOf("Authority", "Structure", "Discipline", "Leadership", "Stability"),
        keywordsReversed = listOf("Tyranny", "Rigidity", "Domination", "Insecurity", "Rebellion"),
        element = "Fire",
        planet = "Mars",
        associatedNumerology = 4,
        suit = "Major Arcana",
        history = """
        The Emperor has long been a symbol of leadership and power. In historical tarot decks, he often depicted a figure of sovereign authority, representing governance and societal order. 
    """.trimIndent(),
        associatedSign = "Aries"
    ),
    TarotCardDetail(
        id = "major_05",
        title = "The Hierophant",
        imageResId = R.drawable.major_05, // Replace with the actual resource ID
        upDescription = """
        The Hierophant represents spiritual guidance, tradition, and the pursuit of higher knowledge. He serves as a bridge between the divine and the earthly, guiding others on their spiritual journey.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Hierophant symbolizes tradition, spiritual wisdom, and seeking knowledge within established frameworks. It encourages learning from mentors and respecting customs.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Hierophant challenges outdated traditions and dogma. It suggests questioning authority, exploring unconventional paths, or rejecting societal expectations.
    """.trimIndent(),
        keywordsUpright = listOf("Tradition", "Wisdom", "Spirituality", "Education", "Guidance"),
        keywordsReversed = listOf(
            "Rebellion",
            "Nonconformity",
            "Dogma",
            "Questioning",
            "Personal Belief"
        ),
        element = "Earth",
        planet = "Venus",
        associatedNumerology = 5,
        suit = "Major Arcana",
        history = """
        The Hierophant has roots in ancient traditions, often depicted as a religious leader or spiritual guide. Historically, he represented the institutional knowledge of faith and wisdom passed through generations.
    """.trimIndent(),
        associatedSign = "Taurus"
    ),
    TarotCardDetail(
        id = "major_06",
        title = "The Lovers",
        imageResId = R.drawable.major_06, // Replace with the actual resource ID
        upDescription = """
        The Lovers represents harmony, choices, and the power of union. It reflects both romantic relationships and inner alignment, symbolizing the balance between our values and desires.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Lovers signifies love, partnership, harmony, and alignment of values. It often represents a meaningful connection or a choice that aligns with your higher self.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Lovers can indicate disharmony, imbalance, or conflict in relationships. It may also point to indecision or a misalignment between your actions and values.
    """.trimIndent(),
        keywordsUpright = listOf("Love", "Union", "Choices", "Harmony", "Alignment"),
        keywordsReversed = listOf(
            "Conflict",
            "Imbalance",
            "Temptation",
            "Misalignment",
            "Indecision"
        ),
        element = "Air",
        planet = "Mercury",
        associatedNumerology = 6,
        suit = "Major Arcana",
        history = """
        The Lovers has evolved from historical depictions of choices and allegories of virtue versus temptation. Over time, it became a card symbolizing love and harmonious connections.
    """.trimIndent(),
        associatedSign = "Gemini"
    ),
    TarotCardDetail(
        id = "major_07",
        title = "The Chariot",
        imageResId = R.drawable.major_07, // Replace with the actual resource ID
        upDescription = """
        The Chariot represents determination, willpower, and triumph through control and focus. It symbolizes the journey toward victory, where success is achieved through discipline and resilience.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Chariot signifies overcoming obstacles, self-discipline, and achieving success through determination and control. It reflects confidence and the ability to harness opposing forces.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Chariot can point to a lack of direction, feeling out of control, or struggling with discipline. It may indicate that inner conflicts are hindering your progress.
    """.trimIndent(),
        keywordsUpright = listOf("Victory", "Willpower", "Determination", "Control", "Focus"),
        keywordsReversed = listOf(
            "Lack of control",
            "Conflict",
            "Self-doubt",
            "Stagnation",
            "Disarray"
        ),
        element = "Water",
        planet = "Moon",
        associatedNumerology = 7,
        suit = "Major Arcana",
        history = """
        The Chariot card has its roots in ancient depictions of triumphal processions, symbolizing victory and the mastery of willpower over chaos. Traditionally, it was seen as a sign of movement and conquest.
    """.trimIndent(),
        associatedSign = "Cancer"
    ),
    TarotCardDetail(
        id = "major_08",
        title = "Strength",
        imageResId = R.drawable.major_08, // Replace with the actual resource ID
        upDescription = """
        Strength embodies courage, compassion, and inner resilience. It is a reminder that true power comes from within, blending determination with kindness and patience.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, Strength speaks of bravery, confidence, and the ability to remain calm and composed in challenging situations. It highlights emotional balance and the power of self-control.
    """.trimIndent(),
        meaningReversed = """
        Reversed, Strength may indicate self-doubt, fear, or a lack of inner resolve. It can suggest an inability to cope with stress or a struggle to assert oneself constructively.
    """.trimIndent(),
        keywordsUpright = listOf(
            "Courage",
            "Compassion",
            "Inner strength",
            "Patience",
            "Resilience"
        ),
        keywordsReversed = listOf("Fear", "Self-doubt", "Weakness", "Lack of control", "Avoidance"),
        element = "Fire",
        planet = "Sun",
        associatedNumerology = 8,
        suit = "Major Arcana",
        history = """
        Historically, Strength has symbolized the balance between raw instinct and cultivated grace. Early decks depicted it as the mastery of the lion, representing humanity's ability to channel primal forces into constructive outcomes.
    """.trimIndent(),
        associatedSign = "Leo"
    ),
    TarotCardDetail(
        id = "major_09",
        title = "The Hermit",
        imageResId = R.drawable.major_09, // Replace with the actual resource ID
        upDescription = """
        The Hermit symbolizes introspection, wisdom, and the search for deeper truths. It encourages stepping away from distractions to focus on self-discovery and enlightenment.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Hermit represents solitude, inner guidance, and reflection. It signifies the need to retreat from the external world to gain clarity, wisdom, and insight into life's challenges.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Hermit can indicate isolation, loneliness, or an over-reliance on solitude. It may also suggest avoiding self-reflection or the refusal to seek help when it's needed.
    """.trimIndent(),
        keywordsUpright = listOf("Introspection", "Solitude", "Wisdom", "Guidance", "Reflection"),
        keywordsReversed = listOf(
            "Isolation",
            "Loneliness",
            "Avoidance",
            "Confusion",
            "Withdrawal"
        ),
        element = "Earth",
        planet = "Mercury",
        associatedNumerology = 9,
        suit = "Major Arcana",
        history = """
        The Hermit has historically represented the seeker of truth, carrying a lantern to illuminate the path ahead. Early tarot decks depicted the figure as a monk or wise elder, symbolizing spiritual enlightenment and life's journey toward self-discovery.
    """.trimIndent(),
        associatedSign = "Virgo"
    ),
    TarotCardDetail(
        id = "major_10",
        title = "The Wheel of Fortune",
        imageResId = R.drawable.major_10, // Replace with the actual resource ID
        upDescription = """
        The Wheel of Fortune represents cycles, fate, and the constant movement of life. It is a card of luck, change, and the unseen forces at play in our lives.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Wheel of Fortune signifies good fortune, cycles of change, and destiny. It suggests that life's events are interconnected and that you're entering a period of positive transformation or opportunity.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Wheel of Fortune can indicate setbacks, resistance to change, or bad luck. It suggests that you may feel stuck or as if you're at the mercy of circumstances beyond your control.
    """.trimIndent(),
        keywordsUpright = listOf("Luck", "Change", "Cycles", "Destiny", "Opportunity"),
        keywordsReversed = listOf(
            "Setbacks",
            "Resistance",
            "Misfortune",
            "Stagnation",
            "Uncertainty"
        ),
        element = "Fire",
        planet = "Jupiter",
        associatedNumerology = 10,
        suit = "Major Arcana",
        history = """
        The Wheel of Fortune has ancient origins, symbolizing the cyclical nature of life and the universe. Medieval depictions often included the wheel turning with kings rising and falling, emphasizing the unpredictable nature of fate.
    """.trimIndent(),
        associatedSign = "Sagittarius"
    ),
    TarotCardDetail(
        id = "major_11",
        title = "Justice",
        imageResId = R.drawable.major_11, // Replace with the actual resource ID
        upDescription = """
        Justice represents truth, fairness, and the law of cause and effect. It calls for accountability, clarity, and balance in decision-making.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, Justice emphasizes fairness, integrity, and objective judgment. It suggests the need to make decisions based on logic, ethics, and truth, and it assures that actions will have fair consequences.
    """.trimIndent(),
        meaningReversed = """
        Reversed, Justice warns of dishonesty, bias, or unfairness. It can indicate being overly critical or neglecting the truth. It also suggests facing the consequences of past actions that were not just.
    """.trimIndent(),
        keywordsUpright = listOf("Fairness", "Truth", "Accountability", "Law", "Clarity"),
        keywordsReversed = listOf("Dishonesty", "Bias", "Injustice", "Imbalance", "Avoidance"),
        element = "Air",
        planet = "Venus",
        associatedNumerology = 11,
        suit = "Major Arcana",
        history = """
        Justice has been a symbol of balance and equity since ancient times, often depicted with scales and a sword. In the Tarot, Justice reminds us that truth and integrity are foundational to meaningful actions and decisions.
    """.trimIndent(),
        associatedSign = "Libra"
    ),
    TarotCardDetail(
        id = "major_12",
        title = "The Hanged Man",
        imageResId = R.drawable.major_12, // Replace with the actual resource ID
        upDescription = """
        The Hanged Man represents surrender, perspective, and the need to pause. It signifies looking at things from a different angle and embracing stillness for deeper understanding.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Hanged Man calls for letting go and seeing the world from a new perspective. It encourages surrendering control, embracing patience, and trusting the process of transformation.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Hanged Man warns of resistance to change, stagnation, or clinging to outdated perspectives. It may indicate a lack of direction or unwillingness to pause and reflect.
    """.trimIndent(),
        keywordsUpright = listOf("Surrender", "Perspective", "Pause", "Reflection", "Letting Go"),
        keywordsReversed = listOf("Stagnation", "Resistance", "Delay", "Indecision", "Frustration"),
        element = "Water",
        planet = "Neptune",
        associatedNumerology = 12,
        suit = "Major Arcana",
        history = """
        The Hanged Man's imagery often depicts a figure suspended upside down, symbolizing a shift in perception. Historically, it represents the idea of sacrifice, enlightenment, and looking at life from unconventional angles to gain deeper wisdom.
    """.trimIndent(),
        associatedSign = "Pisces"
    ),
    TarotCardDetail(
        id = "major_13",
        title = "Death",
        imageResId = R.drawable.major_13, // Replace with the actual resource ID
        upDescription = """
        Death symbolizes transformation, endings, and new beginnings. It is not about literal death but the end of one phase to make way for the next, signifying the shedding of old habits and structures.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, Death represents the end of a chapter, the letting go of old ways to make room for new growth. It calls for embracing transformation and release without fear, trusting that something better is emerging.
    """.trimIndent(),
        meaningReversed = """
        Reversed, Death signals resistance to change, clinging to the past, or the inability to let go of what no longer serves. It may indicate a fear of transformation or stagnation in life.
    """.trimIndent(),
        keywordsUpright = listOf(
            "Endings",
            "Transformation",
            "New Beginnings",
            "Release",
            "Renewal"
        ),
        keywordsReversed = listOf(
            "Resistance",
            "Stagnation",
            "Fear of Change",
            "Inability to Let Go"
        ),
        element = "Water",
        planet = "Pluto",
        associatedNumerology = 13,
        suit = "Major Arcana",
        history = """
        The Death card historically symbolizes the end of a cycle and the necessary destruction of old structures to allow for renewal and rebirth. It represents the inevitability of change and the power of transformation.
    """.trimIndent(),
        associatedSign = "Scorpio"
    ),
    TarotCardDetail(
        id = "major_14",
        title = "Temperance",
        imageResId = R.drawable.major_14, // Replace with the actual resource ID
        upDescription = """
        Temperance is a card of balance, patience, and moderation. It calls for harmony between opposing forces and suggests that through patience and careful blending, a greater sense of peace and unity can be achieved.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, Temperance represents balance, harmony, and moderation. It urges you to avoid extremes and to practice patience, creating a calm and steady approach to challenges. It signifies the art of blending different elements to create something greater than the sum of its parts.
    """.trimIndent(),
        meaningReversed = """
        Reversed, Temperance warns of imbalance, excess, or conflict. It may indicate a lack of harmony or difficulty in finding common ground. This reversal suggests the need to restore equilibrium in your life and avoid overindulgence or hasty decisions.
    """.trimIndent(),
        keywordsUpright = listOf("Balance", "Moderation", "Patience", "Harmony", "Self-Control"),
        keywordsReversed = listOf(
            "Imbalance",
            "Excess",
            "Conflict",
            "Disharmony",
            "Overindulgence"
        ),
        element = "Fire",
        planet = "Sagittarius",
        associatedNumerology = 14,
        suit = "Major Arcana",
        history = """
        Historically, Temperance represents the blending of opposites, the creation of harmony from different forces, and the importance of patience in achieving a greater balance. The card encourages self-restraint and thoughtful decision-making.
    """.trimIndent(),
        associatedSign = "Sagittarius"
    ),
    TarotCardDetail(
        id = "major_15",
        title = "The Devil",
        imageResId = R.drawable.major_15, // Replace with the actual resource ID
        upDescription = """
        The Devil represents bondage, addiction, and materialism. It warns of being trapped by illusions and the need to break free from unhealthy attachments or behaviors.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Devil signifies feelings of being trapped, addiction, or being influenced by negative behaviors. It suggests that you may be chained to unhealthy patterns and that breaking free will require conscious effort and self-awareness.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Devil indicates the potential for liberation from negative influences or destructive patterns. It suggests breaking free from addictions, unhealthy relationships, or materialism.
    """.trimIndent(),
        keywordsUpright = listOf("Bondage", "Addiction", "Materialism", "Illusion", "Fear"),
        keywordsReversed = listOf("Freedom", "Breaking Free", "Liberation", "Awakening", "Release"),
        element = "Earth",
        planet = "Capricorn",
        associatedNumerology = 15,
        suit = "Major Arcana",
        history = """
        Historically, The Devil card represents entrapment by material or superficial desires, often linked to the consequences of overindulgence and the danger of becoming enslaved by one's impulses.
    """.trimIndent(),
        associatedSign = "Capricorn"
    ),
    TarotCardDetail(
        id = "major_16",
        title = "The Tower",
        imageResId = R.drawable.major_16, // Replace with the actual resource ID
        upDescription = """
        The Tower signifies sudden upheaval, destruction, and revelation. It represents the breaking down of false structures, whether in relationships, beliefs, or circumstances.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Tower indicates sudden and unforeseen changes, often leading to chaos or destruction. While initially difficult, these events often clear the way for new opportunities by breaking down old, limiting structures.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Tower suggests resistance to necessary change or an avoidance of confronting the truth. It can also indicate delayed destruction or recovery from past upheaval.
    """.trimIndent(),
        keywordsUpright = listOf(
            "Upheaval",
            "Destruction",
            "Revelation",
            "Sudden Change",
            "Breakdown"
        ),
        keywordsReversed = listOf(
            "Avoidance",
            "Resistance",
            "Delayed Change",
            "Rebuilding",
            "Denial"
        ),
        element = "Fire",
        planet = "Mars",
        associatedNumerology = 16,
        suit = "Major Arcana",
        history = """
        The Tower symbolizes the destruction of illusions, revealing the truth and forcing change. It represents chaos and sudden events that dismantle the false structures in life.
    """.trimIndent(),
        associatedSign = "Mars"
    ),
    TarotCardDetail(
        id = "major_17",
        title = "The Star",
        imageResId = R.drawable.major_17, // Replace with the actual resource ID
        upDescription = """
        The Star represents hope, inspiration, and spiritual clarity. It is a card of renewal, offering a sense of guidance after hardship or confusion.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Star signifies a renewed sense of hope and inspiration. It brings clarity, a fresh start, and spiritual guidance. It encourages you to follow your intuition and trust in the process of healing.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Star indicates a loss of hope or a feeling of disillusionment. It can also suggest a disconnect from spiritual guidance or a lack of trust in the future.
    """.trimIndent(),
        keywordsUpright = listOf("Hope", "Inspiration", "Renewal", "Clarity", "Healing"),
        keywordsReversed = listOf(
            "Hopelessness",
            "Disillusionment",
            "Blockage",
            "Despair",
            "Confusion"
        ),
        element = "Air",
        planet = "Aquarius",
        associatedNumerology = 17,
        suit = "Major Arcana",
        history = """
        The Star card brings messages of healing, guidance, and a return to one's path. It symbolizes faith in the universe and the light after dark times.
    """.trimIndent(),
        associatedSign = "Aquarius"
    ),
    TarotCardDetail(
        id = "major_18",
        title = "The Moon",
        imageResId = R.drawable.major_18, // Replace with the actual resource ID
        upDescription = """
        The Moon card represents illusion, intuition, and the subconscious. It suggests hidden truths, deception, or the need to explore your deeper emotions and fears.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Moon indicates confusion, illusion, and the need to trust your intuition. It suggests that not everything is as it seems, and it may be time to confront subconscious fears or desires.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Moon indicates clarity emerging from confusion, the uncovering of truths, or the end of a deceptive period. It may also suggest self-deception or an unwillingness to confront the truth.
    """.trimIndent(),
        keywordsUpright = listOf("Illusion", "Deception", "Intuition", "Fear", "Uncertainty"),
        keywordsReversed = listOf(
            "Clarity",
            "Truth Revealed",
            "End of Confusion",
            "Revelation",
            "Self-Deception"
        ),
        element = "Water",
        planet = "Pisces",
        associatedNumerology = 18,
        suit = "Major Arcana",
        history = """
        The Moon represents illusions, dreams, and the unconscious mind. It is often linked to cycles, mysteries, and the unknown aspects of life.
    """.trimIndent(),
        associatedSign = "Pisces"
    ),
    TarotCardDetail(
        id = "major_19",
        title = "The Sun",
        imageResId = R.drawable.major_19, // Replace with the actual resource ID
        upDescription = """
        The Sun card represents success, vitality, and clarity. It is a card of joy, enlightenment, and positive energy, bringing light into dark areas of life.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The Sun signifies success, clarity, and happiness. It brings positive energy, vitality, and a sense of fulfillment. It is a card of enlightenment and the triumph of light over darkness.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The Sun suggests delayed success, pessimism, or lack of clarity. It may indicate feelings of isolation or underachievement, or a temporary loss of confidence.
    """.trimIndent(),
        keywordsUpright = listOf("Success", "Vitality", "Clarity", "Joy", "Enlightenment"),
        keywordsReversed = listOf(
            "Delayed Success",
            "Pessimism",
            "Lack of Clarity",
            "Isolation",
            "Underachievement"
        ),
        element = "Fire",
        planet = "Sun",
        associatedNumerology = 19,
        suit = "Major Arcana",
        history = """
        The Sun represents triumph, happiness, and vitality. It is a card that signifies overcoming obstacles and gaining clarity, often associated with success, health, and enlightenment.
    """.trimIndent(),
        associatedSign = "Leo"
    ),
    TarotCardDetail(
        id = "major_20",
        title = "Judgment",
        imageResId = R.drawable.major_20, // Replace with the actual resource ID
        upDescription = """
        Judgment represents awakening, rebirth, and the need for self-reflection. It calls for a reassessment of your life, decisions, and actions.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, Judgment signifies a time of awakening, reflection, and realization. It calls for self-evaluation and a deeper understanding of one's purpose and actions.
    """.trimIndent(),
        meaningReversed = """
        Reversed, Judgment indicates denial, avoidance of self-reflection, or being stuck in past patterns. It suggests that you are not fully embracing the need for change or growth.
    """.trimIndent(),
        keywordsUpright = listOf(
            "Awakening",
            "Rebirth",
            "Self-Reflection",
            "Realization",
            "Forgiveness"
        ),
        keywordsReversed = listOf(
            "Denial",
            "Avoidance",
            "Stagnation",
            "Self-Deception",
            "Resistance to Change"
        ),
        element = "Fire",
        planet = "Pluto",
        associatedNumerology = 20,
        suit = "Major Arcana",
        history = """
        Judgment represents the process of awakening, transformation, and accountability. It signifies a time for reassessment, clearing the past, and preparing for a new phase.
    """.trimIndent(),
        associatedSign = "Pluto"
    ),
    TarotCardDetail(
        id = "major_21",
        title = "The World",
        imageResId = R.drawable.major_21, // Replace with the actual resource ID
        upDescription = """
        The World card represents completion, wholeness, and fulfillment. It signifies the successful completion of a cycle and the achievement of a major milestone in your life.
    """.trimIndent(),
        revDescription = "to do ",

        meaningUpright = """
        Upright, The World signifies the completion of a journey or project. It is a card of fulfillment, success, and the harmonious integration of all aspects of life.
    """.trimIndent(),
        meaningReversed = """
        Reversed, The World may indicate incompletion, lack of closure, or the need for final adjustments before moving forward. It may suggest delays or unfinished business.
    """.trimIndent(),
        keywordsUpright = listOf(
            "Completion",
            "Fulfillment",
            "Wholeness",
            "Success",
            "Achievement"
        ),
        keywordsReversed = listOf(
            "Incompletion",
            "Delays",
            "Unfinished Business",
            "Lack of Closure",
            "Resistance"
        ),
        element = "Earth",
        planet = "Saturn",
        associatedNumerology = 21,
        suit = "Major Arcana",
        history = """
        The World card symbolizes the successful culmination of a cycle. It represents the integration of all the lessons learned along the way and the rewards of your hard work.
    """.trimIndent(),
        associatedSign = "Saturn"
    )
)


