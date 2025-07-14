package blackjack.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DeckTest {
    @Test
    fun `CardDeck has 52 cards`() {
        val deck = Deck()
        assertThat(deck.countCards()).isEqualTo(52)
    }

    @Test
    fun `hit a card to a player`() {
        val deck = Deck()
        val player = Player("Mina")
        player.receiveCards(deck.drawCards(1))
        assertThat(player.cardsCount()).isEqualTo(1)
    }
}
