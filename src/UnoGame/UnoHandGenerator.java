package UnoGame;


import UnoGame.Uno.Suit;
import UnoGame.Uno.Value;
import java.util.Random;

/**
 * A class that models the Card Hand. A Card hand has an array of cards. 
 * How can you change the size of the hand?
 *
 *  @author Henil Patel, 2023
 * @modified Henil Patel jan 2023
 */

public class UnoHandGenerator {

    /**
     * Generates a hand of a given size
     */
    public static Uno[] generateHand(int handSize) {
        
        // we'll use this to generate random numbers
        Random random = new Random();
        
        // let's get these lengths once
        int numValues = Uno.Value.values().length;
        int numSuits = Uno.Suit.values().length;
        
        // declare and initialize a hand of cards
        Uno[] hand = new Uno[handSize];
        
        for (int i = 0; i < handSize; i++) {
            
            // get a random suit and value. Note we're not concerned about uniqueness
            // at this point
            Suit randomSuit = Uno.Suit.values()[random.nextInt(numSuits)];
            Value randomValue = Uno.Value.values()[random.nextInt(numValues)];
            
            // create a card and add it to the hand
            Uno card = new Uno(randomSuit, randomValue);        
            hand[i] = card;
            
        }
        
        return hand;
    }
}
