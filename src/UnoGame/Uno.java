package UnoGame;

/**
 * Starter code for the Card class. To be used in Week 4.
 *
 * @author Henil Patel, 2023
 * @modified Henil Patel jan 2023
 */

/*Answer 4 :
    The loose coupling is the reason that describe one oo principle which allowd me 
    make changes in uno and it's generator. moreover due to this principle i was able to
    use the same come and i didn't have to create a whole new code.
*/
/*
Answer 5 :
    The feature that allowed me to reuse or extend the code is Cohesion because due 
    to which I written my code for UnoGame. After makeing changes the program got no effects
    which also by the cohesion feture.
*/

public class Uno {

    public enum Suit {
        RED,YELLOW,GREEN,BLUE
    }

    public enum Value {
        ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAW2,DRAW4,WILDCARD
    }
    
    private final Suit suit;
    private final Value value;

    public Uno(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
