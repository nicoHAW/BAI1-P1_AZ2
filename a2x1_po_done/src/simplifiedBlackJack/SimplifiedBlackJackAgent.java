// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simplifiedBlackJack;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Simplified Black Jack Agent - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class SimplifiedBlackJackAgent {

    // Ersetzen Sie diesen Kommentar durch Ihren Code
    // oder falls kein Code noetig ist, loeschen diesen Kommentar einfach.
    // Hier waere die Stelle fuer moegliche Zustandsvariablen, Exemplarvariablen
    // bzw. Objekt-spezifische Variablen oder einen Konstruktor,
    // sofern derartiges benoetigt wird.
    // Es ist Ihre Entscheidung und sie sollte Sinn machen.

    private int playerScore = 0; // Total score of the player's hand
    private int playerCardsQuantity = 0; // Number of cards in the player's hand

    public int convertRank(Card card) 
    /**
     * Converts the rank of a card into its numerical value according to Blackjack rules.
     * 
     * @param card The Card object to be converted.
     * @return The numerical value of the card.
     */
    { Rank rank = card.getRank(); //proceeded with getRank instead of value to switch the points based on the card type.
        switch (rank) {
            case ACE:
                return 11;
            case KING:
            case QUEEN:
            case JACK:
                return 10;
            case TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN:
                return (int)rank.value();

            default:
                assert false : "Rank ist fehlerhaft";
                return 0;
        } // end switch
    } // end method Rank


    public void updatePlayerHandTotal(Card[] arr) {
        /**
         * Calculates and updates the total score for the player's hand.
         * 
         * @param arr Array of Card objects representing the player's hand.
         */
        playerScore = 0;
        for (Card card : arr) {
            if (card != null) {  // Check if the card is not null since the array has 11 positions
                playerScore += convertRank(card);
            }
        }
    }

    public void showPlayerHand(Card[] arr) 
    /**
     * Displays the player's hand.
     * Each card is printed on the same line.
     * 
     * @param arr Array of Card objects representing the player's hand.
     */
    {
        System.out.println("This is your current hand:");
        for(Card card : arr ) {
            if (card != null) {
                System.out.print(card);
            }
        }
        System.out.println();
    } 
    /**
     * "Play" Black Jack
     */
    public void playBlackJack(){

        Card[] playerHand; // declare the player hand
        playerHand = new Card[11]; //initialize the array with the max length (11 cards is the min quantity of cards to achieve 21)
        Deck newDeck = new Deck(); // create a deck with new cards
        //...
        System.out.println("----------------------");
        System.out.println(" Blackjack game start");
        System.out.println("----------------------");
        System.out.println();

        //TODO do - while - done 
        do {

            playerHand[playerCardsQuantity] = newDeck.deal(); //changing the element in the array based on the current index (index based on playerCardsQty)
            playerCardsQuantity++; // increase the variable so the index position is now +1 
            updatePlayerHandTotal(playerHand);

            //TODO 21 und >21 soll hinter die Schleife - done

            System.out.printf("Your hand's total is now... %d\n",playerScore);
            showPlayerHand(playerHand);

        } while (playerScore<=17);

        if(playerScore >21) {
            System.out.printf("Your hand's total is... %d\n",playerScore);
            showPlayerHand(playerHand);
            System.out.println("This means that you are over 21...");
            System.out.println("Unfortunately you LOST");
            
        } else if (playerScore==21) {
            System.out.printf("Your hand's total is... %d\n",playerScore);
            showPlayerHand(playerHand);
            System.out.printf("I feel something magical.,.\n");
            System.out.printf("Your hand's total is... %d... this can't be!\n",playerScore);
            System.out.println("THIS IS A BLACK JACK!!");
            System.out.println("Congratulations! You won!!");
        }






        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        System.out.flush();
    }//method()

}//class
