package blackjack.domain.card

@JvmInline
value class Cards(val value: List<Card> = emptyList()) {
    constructor(vararg cards: Card) : this(cards.toList())
}
