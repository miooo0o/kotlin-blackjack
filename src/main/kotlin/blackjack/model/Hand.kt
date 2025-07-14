package blackjack.model

class Hand() {
    private val hold: Hold = Hold(emptySet())

    val cards
        get() = hold.cards

    fun cardsCount(): Int = hold.cards.size

    fun receiveCards(cards: List<Card>): Boolean = this.hold.receiveCards(cards)

    fun calculatePoints(): Int {
        val countOfAce = hold.cards.filter { it.rank.value == 1 }.size
        var sum = hold.cards.sumOf { it.rank.value }

        repeat(countOfAce) {
            if (sum + 10 <= 21) sum += 10
        }
        return sum
    }
}
