package theLastFourCards;


//Mit den folgenden 4 import-Statements kommt man immer an alles Noetige.
import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * "the Last Four Cards" - see task
 * 
 * @author  Nico Pätzel 
 * @version 2024/08/12 Version 2
 */
public class LastFourCards {

    Card cardOne;
    Card cardTwo;
    Card cardThree;
    Card cardFour;
    int cardCounter;

    /**
     * in the beginning there isn't any card known
     */
    public LastFourCards(){
        Card cardOne = null;
        Card cardTwo = null;
        Card cardThree = null;
        Card cardFour = null;
        cardCounter = 0; 

    }//method()




    /**
     * print the last four cards
     */
    public void printLastFourCards(){


        if (cardCounter >= 4) {
            System.out.printf(" %s %s %s %s \n", cardFour, cardThree, cardTwo, cardOne );
        } else if (cardCounter == 3) {
            System.out.printf(" %s %s %s \n", cardThree, cardTwo, cardOne );
        } else if (cardCounter == 2){
            System.out.printf(" %s %s \n", cardTwo, cardOne );
        } else if (cardCounter == 1){
            System.out.printf(" %s \n", cardOne );
        } else {
            System.out.printf("nix\n");
        }

        }//method()

        /**
         * process new card
         * 
         * @param card current card
         */
        public void processNewCard( Card card ){
            assert ( card != null ) : "Card cant be null";
            cardCounter++;

            cardFour = cardThree;
            cardThree = cardTwo;
            cardTwo = cardOne;
            cardOne = card;

        }//method()

    }//class
