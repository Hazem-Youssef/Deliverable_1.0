/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package src.deliverable.pkg1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    // The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size; // the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
        cards = new ArrayList<Card>();
    }