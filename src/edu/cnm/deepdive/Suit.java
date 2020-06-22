package edu.cnm.deepdive;

/**
 * Encapsulates the suits of standard playing cards. Each instance can return (using the
 * {@link #symbol()} method) the Unicode symbol for that suit.
 */
public enum Suit {

  CLUBS(Color.BLACK),
  DIAMONDS(Color.RED),
  HEARTS(Color.RED),
  SPADES(Color.BLACK);

  private final Color color;

  private Suit(Color color) {
    this.color = color;
  }

  /**
   * Returns the Unicode symbol for the current instance.
   */
  public char symbol() {
    switch (this) {
      case CLUBS:
        return '\u2663';
      case DIAMONDS:
        return '\u2662';
      case HEARTS:
        return '\u2661';
      case SPADES:
        return '\u2660';
      default:
        return (char) 0;
    }

  }

  public Color getColor() {
    return color;
  }
}
