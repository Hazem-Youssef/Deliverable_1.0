/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package src.deliverable.pkg1;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card, etc.
     */
    @Override
    public abstract String toString();
}

/* BlackjackCard Implementation
*
* Authors: Group 1 (Monika Skiba, Hazem Youssef, Aarushi Sharma)
* Date: October 9, 2023
*
*/

public class BlackjackCard extends Card {
    private final String rank;
    private final String suit;
    private final int value;

    public BlackjackCard(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public int getValue() {
        return value;
    }
}

