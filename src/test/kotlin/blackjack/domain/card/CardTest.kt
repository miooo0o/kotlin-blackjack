package blackjack.domain.card

import backup.model.Rank
import backup.model.Suit
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardTest {
    @Test
    fun `initiated card`() {
        val card = Card(Suit.DIAMONDS, Rank.JACK)
        assertThat(card.suit).isEqualTo(Suit.DIAMONDS)
        assertThat(card.rank).isEqualTo(Rank.JACK)
    }

}