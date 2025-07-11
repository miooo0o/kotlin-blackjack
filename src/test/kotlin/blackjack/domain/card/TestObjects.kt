package blackjack.domain.card

import backup.model.Rank
import backup.model.Suit.*

object TestObjects {
    object CreatedCardsForTest {
        val JACK_HEART = Card(HEARTS, Rank.JACK)
        val JACK_DIAMOND = Card(DIAMONDS, Rank.JACK)
        val ACE_HEART = Card(HEARTS, Rank.ACE)
        val ACE_DIAMOND = Card(DIAMONDS, Rank.ACE)
        val SEVEN_DIAMOND = Card(DIAMONDS, Rank.SEVEN)
        val TWO_CLUBS = Card(CLUBS, Rank.TWO)
    }
}