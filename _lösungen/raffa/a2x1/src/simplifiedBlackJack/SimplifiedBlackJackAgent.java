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



    /**
     * "Play" Black Jack
     */
    public void playBlackJack(){
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###
        //###
        //###
        //###           HIER kommt Ihr Code hin
        //###
        //###                    VVVV
        //###                    VVVV
        //###                    VVVV
        //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
        //###            VVVVVVVVVVVVVVVVVVVV
        //###               VVVVVVVVVVVVVV
        //###                  VVVVVVVV
        //###                     VV

        System.out.println("Welcome to the simplified Black Jack agent, let's start.");

        Deck deck = new Deck();
        int currentPoints = 0;

        do {
            //we draw a new card from our deck
            Card card = deck.deal();
            Rank rank = card.getRank();

            //depending on the rank of the card, we increase our points each turn
            switch (rank){
            case JACK, QUEEN, KING:
                currentPoints += 10;
                break;
            case ACE:
                currentPoints += 11;
                break;
            default:
                currentPoints += rank.value();
            }

            System.out.printf("You drew %s. Your current points are: %d.\n", card.getFullName(), currentPoints);

        } while(currentPoints < 17);
        //draw more cards until we reach atleast 17 points

        if (currentPoints > 21) {
            //if we scored more than 21 points, we lose
            System.out.println("LOST");
        }

        System.out.println("That't it, thank you for playing!");



        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        System.out.flush();
    }//method()

}//class
