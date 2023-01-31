package UnoGame;

/**
 * A class to handle the user interaction for the Card project. Contains a main method that generates a card hand and
 * then iterates over it to print its contents to the console.
 *
 *  @author Henil Patel, 2023
 * @modified Henil Patel jan 2023
 */
public class GamePlayer {

    public static void main(String[] args) {
        
        int length = 60;
        Uno[] cardHand = UnoHandGenerator.generateHand(60);
        for (Uno card : cardHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
        // System.out.println(ch.cards); show what happens when there is no toString()
    }

}
