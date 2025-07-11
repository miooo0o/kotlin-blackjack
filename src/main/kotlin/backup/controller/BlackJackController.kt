package backup.controller

import backup.model.PlayerFactory
import backup.model.Statistics
import backup.view.InputView
import backup.view.OutputView

object BlackJackController {
    fun play() {
        try {
            val names = InputView.getPlayersName()
            val players = PlayerFactory.with(names)
            val dealer = PlayerFactory.createDealer()

            val gameManager = GameManager(dealer, players)
            gameManager.setUp()
            OutputView.printAllPlayers(listOf(dealer) + players)
            gameManager.playGame(dealer, players) { InputView.askForCard() }

            val statistics = Statistics(dealer, players)
            OutputView.printFinalResults(listOf(dealer) + players)
            OutputView.printStatistics(statistics)
        } catch (e: Exception) {
            println(e.message)
        }
    }
}
