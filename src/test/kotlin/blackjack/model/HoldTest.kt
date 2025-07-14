package blackjack.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HoldTest {
    @Test
    fun `should be able to move a card`() {
        val hold =
            Hold(
                setOf(
                    Card(Suit.HEART, Rank.ACE),
                    Card(Suit.HEART, Rank.TWO),
                    Card(Suit.HEART, Rank.THREE),
                    Card(Suit.HEART, Rank.FOUR),
                ),
            )
        val player = Player("Mina")
        player.receiveCards(hold.drawCards(1))

        assertThat(player.cardsCount()).isEqualTo(1)
    }

    @Test
    fun `should be able to move a card and remove that card from the cardDesk`() {
        val hold =
            Hold(
                setOf(
                    Card(Suit.HEART, Rank.ACE),
                    Card(Suit.HEART, Rank.TWO),
                    Card(Suit.HEART, Rank.THREE),
                    Card(Suit.HEART, Rank.FOUR),
                ),
            )
        val player = Player("Mina")
        player.receiveCards(hold.drawCards(1))
        assertThat(hold.cards).hasSize(3)
    }

    @Test
    fun `order of cards in two cardDesks is different`() {
        val cardDesk1 = Deck().getCards()
        val cardDesk2 = Deck().getCards()

        assertThat(cardDesk1).isNotSameAs(cardDesk2)
    }
}
