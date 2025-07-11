package blackjack.domain.card

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class CardsTest {

    @Test
    fun `initialize cards`() {
        val cards = Cards(JACK_DIAMOND)
        assertThat(cards.value.first()).isEqualTo(JACK_DIAMOND)
    }
}