package blackjack.model

class Player(name: String) {
    private val person = Person(name)
    private val hand = Hand()

    val name = person.name

    val cards: List<Card>
        get() = hand.cards

    val isBlackJack: Boolean
        get() = cardsCount() == 2 && calculatePoints() == 21

    val isBust: Boolean
        get() = calculatePoints() > 21

    fun receiveCards(cards: List<Card>): Boolean = hand.receiveCards(cards)

    fun cardsCount(): Int = hand.cardsCount()

    fun calculatePoints(): Int = hand.calculatePoints()

    fun cardsToString(): String = cards.joinToString(", ")
}
