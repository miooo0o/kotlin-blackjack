package blackjack.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HandTest {
    @Test
    fun `cards has ace, and total points is 17 `() {
        val player = Player("doggo")
        val listOfCards =
            listOf(
                Card(Suit.DIAMONDS, Rank.ACE),
                Card(Suit.DIAMONDS, Rank.TWO),
                Card(Suit.DIAMONDS, Rank.QUEEN),
                Card(Suit.DIAMONDS, Rank.FOUR),
            )
        listOfCards.forEach { player.receiveCards(listOf(it)) }
        assertThat(player.calculatePoints()).isEqualTo(17)
    }

    @Test
    fun `cards has ace, total points is 21`() {
        val player = Player("doggo")
        val listOfCards =
            listOf(
                Card(Suit.DIAMONDS, Rank.ACE),
                Card(Suit.DIAMONDS, Rank.JACK),
            )
        listOfCards.forEach { player.receiveCards(listOf(it)) }
        assertThat(player.calculatePoints()).isEqualTo(21)
    }

    @Test
    fun`cards have triple ace, total points is 13`() {
        val player = Player("doggo")
        val listOfCards =
            listOf(
                Card(Suit.DIAMONDS, Rank.ACE),
                Card(Suit.HEART, Rank.ACE),
                Card(Suit.SPADES, Rank.ACE),
                Card(Suit.DIAMONDS, Rank.JACK),
            )
        listOfCards.forEach { player.receiveCards(listOf(it)) }

        assertThat(player.calculatePoints()).isEqualTo(13)
    }

    @Test
    fun`cards have triple ace, total points is 20`() {
        val player = Player("doggo")
        val listOfCards =
            listOf(
                Card(Suit.DIAMONDS, Rank.ACE),
                Card(Suit.HEART, Rank.ACE),
                Card(Suit.SPADES, Rank.ACE),
                Card(Suit.DIAMONDS, Rank.SEVEN),
            )
        listOfCards.forEach { player.receiveCards(listOf(it)) }

        assertThat(player.calculatePoints()).isEqualTo(20)
    }
}
