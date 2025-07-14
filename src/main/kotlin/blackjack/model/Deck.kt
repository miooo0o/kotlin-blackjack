package blackjack.model

data class Deck(private val hold: Hold) {
    constructor() : this(initPokerCards())

    fun getCards(): List<Card> = hold.cards.toList()

    fun countCards(): Int = hold.cards.size

    fun drawCards(count: Int): List<Card> = hold.drawCards(count)

    companion object {
        private fun initPokerCards() = Hold(list().shuffled().toSet())

        private fun list(): List<Card> {
            return Suit.entries.flatMap { suit -> Rank.entries.map { rank -> Card(suit, rank) } }
        }
    }
}
