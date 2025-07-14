package blackjack.model

class Hold(hold: Set<Card>) {
    private val _cards: MutableList<Card> = hold.toMutableList()
    val cards: List<Card>
        get() = _cards.toList()

    fun drawCards(count: Int): List<Card> {
        return _cards.take(count).toList()
            .also { repeat(count) { _cards.remove(_cards.first()) } }
    }

    fun receiveCards(cards: List<Card>): Boolean = _cards.addAll(cards)
}
