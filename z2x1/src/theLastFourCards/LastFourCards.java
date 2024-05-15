package theLastFourCards;


//Mit den folgenden 4 import-Statements kommt man immer an alles Noetige.
import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * "the Last Four Cards" - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class LastFourCards {

    Card firstCard;
    Card secondCard;
    Card thirdCard;
    Card fourthCard;
    int cardsDrawn;


    /**
     * in the beginning there isn't any card known
     */
    public LastFourCards(){
        // U.U. könnte hier Code ergänzt werden.
    }//method()




    /**
     * print the last four cards
     */
    public void printLastFourCards(){
        if (cardsDrawn >= 4) {
            System.out.printf("%s %s %s %s %n%n", fourthCard, thirdCard, secondCard, firstCard);
        
        } else if (cardsDrawn == 3) {
            System.out.printf("%s %s %s %n%n",  thirdCard, secondCard, firstCard);

        } else if (cardsDrawn == 2) {
            System.out.printf("%s %s %n%n", secondCard, firstCard);

        } else if (cardsDrawn == 1)  {
            System.out.printf("%s %n%n", firstCard);

        } //else if
        

        
    }//method()

    /**
     * process new card
     * 
     * @param card current card
     */
    public void processNewCard( Card card ){
        fourthCard = thirdCard;
        thirdCard = secondCard;
        secondCard = firstCard;
        firstCard = card;
        cardsDrawn++;
        
        
    }//method()

}//class
