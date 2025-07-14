package blackjack.model

object PlayerFactory {
    fun createPlayers(names: List<String>): List<Player> {
        return names.map { Player(it) }
    }

    fun createDealer() = Player(DEALER)

    const val DEALER = "Dealer"
}
