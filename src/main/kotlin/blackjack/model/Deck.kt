package blackjack.model

data class Deck(private val hold: Hold) {
    constructor() : this(initPokerCards())

    fun getCards() = hold.cards.toList()

    fun countCards() = hold.cards.size

    fun hit(
        player: Player,
        repeat: Int = 1,
    ) {
        repeat(repeat) { hold.moveCard(player) }
    }

    companion object {
        private fun initPokerCards() = Hold(list().shuffled().toSet())

        private fun list(): List<Card> {
            return Suit.entries.flatMap { suit -> Rank.entries.map { rank -> Card(suit, rank) } }
        }
    }
}
