package edu.cnm.deepdive;

public class Card {

  private final Suit suit;
  private final Rank rank;

  /**
   * Create an instance of {@code Card} with the specified {@link Suit} and {@link Rank}.
   *
   * @param suit Selected suit
   * @param rank Selected Rank
   */
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public Rank getRank() {
    return rank;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

}
