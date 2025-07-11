package blackjack.domain.card

import org.junit.jupiter.api.Test

class HoldTest {

    @Test
    fun `init Hold`() {
        val cardDeckHold = Hold()
        val playerHold = Hold()

        cardDeckHold.dealTo(playerHold)
    }
}