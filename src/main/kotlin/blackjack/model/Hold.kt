package blackjack.model

class Hold(hold: Set<Card>) {
    private val _cards: MutableSet<Card> = hold.toMutableSet()
    val cards: Set<Card>
        get() = _cards.toSet()

    fun drawCards(count: Int): List<Card> {
        return _cards.take(count).toList()
            .also { repeat(count) { _cards.remove(_cards.first()) } }
    }

    fun receiveCards(cards: List<Card>): Boolean = _cards.addAll(cards)
}
