package blackjack.controller

import blackjack.model.Deck
import blackjack.model.Player
import blackjack.view.OutputView

class GameManager(private val dealer: Player, private val players: List<Player>) {
    private val deck = Deck()

    fun setUp() {
        players.forEach { player -> player.receiveCards(deck.drawCards(2)) }
        dealer.receiveCards(deck.drawCards(1))
    }

    fun playGame(
        dealer: Player,
        players: List<Player>,
        askForCard: () -> Boolean = { true },
    ) {
        players.forEach { round(it, askForCard) }
        round(dealer)
    }

    internal fun round(
        player: Player,
        askForCard: () -> Boolean = { true },
    ) {
        when (player) {
            dealer -> roundForDealer(player)
            else -> roundForPlayers(player, askForCard)
        }
    }

    private fun roundForPlayers(
        player: Player,
        askForCard: () -> Boolean,
    ) {
        while (ableToReceive(player)) {
            OutputView.printAskForCard(player)
            if (askForCard()) {
                player.receiveCards(deck.drawCards(1))
                OutputView.printOnePlayer(player)
            } else {
                break
            }
        }
    }

    private fun roundForDealer(player: Player) {
        while (ableToReceive(player)) {
            player.receiveCards(deck.drawCards(1))
        }
        OutputView.printDealerDrawsCards(player)
    }

    private fun ableToReceive(player: Player): Boolean {
        val isDealer = player === dealer
        if (isDealer) return dealer.calculatePoints() <= DEALER_MUST_HIT_LIMIT
        return player.calculatePoints() < BLACKJACK
    }

    companion object {
        private const val DEALER_MUST_HIT_LIMIT = 16
        private const val BLACKJACK = 21
    }
}
