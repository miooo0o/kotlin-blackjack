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

# step 1—refactoring...
> remove duplicated logic, make a flow to start to end (connect classes)

## Card
- [ ] implement Card

## Cards
- [ ] implement Cards
  - List<Card>

## Hold
- [ ] implement Hold / inherit Cards
  - [ ] card/s swap logic
  - [ ] notice if Cards-List is empty

## Hand
- [ ] implement Hand / inherit Hold
  - [ ] can be duplicated

## Deck
- [ ] implement Deck / inherit Hold
  - [ ] validation
    - [ ] no duplicate cards
    - [ ] return type is List
    - [ ] 52 cards
- [ ] check if empty, what it can do more
  - generate new cards? print some message?
- [ ] implement shuffle logic. inject from outside class

## Player
- [ ] implement Participant
  - [ ] has Hand
- [ ] implement Player
- [ ] implement Dealer

## state of Player
#### final state
- [ ] Bust
- [ ] BlackJack
#### action to try
- [ ] Draw
- [ ] Hit
- [ ] Stay -> somehow it can be part of result 
