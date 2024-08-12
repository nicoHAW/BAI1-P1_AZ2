// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simplifiedBlackJack;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Simplified Black Jack Agent - see task
 * 
 * @author  Nico Pätzel 
 * @version 2024/08/12 Version 1
 */
public class SimplifiedBlackJackAgent {
    Deck cardDeck;
    int handVal;


    /**
     * "Play" Black Jack
     */
    public void playBlackJack(){
        cardDeck = new Deck();
        Card curCard;

        while ( handVal < 17 ) {

            curCard = cardDeck.deal();
            Suit curCardSuite = curCard.getSuit();
            Rank curCardRank = curCard.getRank();
            int curCardVal;
            
            switch (curCard.getRank()) {
                
                case JACK, QUEEN, KING :
                curCardVal = 10; break;
                
                case ACE : 
                curCardVal = 11; break;
                
                default : curCardVal = curCardRank.value();
                
            }
            
            
            
            this.handVal += curCardVal;
            
            System.out.printf("Card: %s\n", curCard);
            printCardArray(curCard);
            System.out.printf("Points: %s\n", curCardVal);
            System.out.printf("Hand Points: %d\n\n", this.handVal);
            
            
           if ( this.handVal > 21) {
                System.out.printf("Your a fucking loser");
            } else if ( this.handVal == 21) {
                System.out.printf("YEAH! BLACK JACK!");
            } //if
            
           
           
        }//while


    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
    // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    System.out.flush();
}//method()


}//class
