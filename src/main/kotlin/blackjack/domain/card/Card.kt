package blackjack.domain.card

import backup.model.Rank
import backup.model.Suit

data class Card(val suit: Suit, val rank: Rank) {
    override fun toString(): String {
        return "${rank.face}${suit.symbol}"
    }
}
