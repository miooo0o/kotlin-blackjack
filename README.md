# kotlin-blackjack

## Requirements

- Card values follow standard Blackjack rules:
- Number cards are counted by their face value.
- Face cards (King, Queen, Jack) are each worth 10.
- Aces can be worth either 1 or 11.
- Each player starts with two cards.
- Players may draw additional cards as long as their total remains 21 or less.
- The dealer must draw a card if their total is 16 or less, and must stand on 17 or more.
- If the dealer busts (goes over 21), all remaining players automatically win.
- After the game ends, display the result (win/loss) for each player.
- 
## Features

### apply review
- [ ] controller/BlackJackController.kt → combined
```kotlin
OutputView.printFinalResults(listOf(dealer) + players)
OutputView.printStatistics(statistics)
```
- 
- [ ] model/Hand.kt → use emptySet() instead set()
- [ ] model/Player.kt → improve readability
- [ ] model/PlayerFactory.kt → improve readability, method names
- [ ] model/CardDeck.kt → if card is empty
- [ ] model/Hold.kt / in GameManager -> improve readability
```kotlin
    players.forEach { player ->
        player.addCards(cardDeck.drawCards(2))
    }
```

- [ ] controller/GameManager → ABLE_TO_RECEIVE → DEALER_MUST_HIT_LIMIT