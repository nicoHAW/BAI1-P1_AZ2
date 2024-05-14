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

        //DECLARATION
        Card   c;

        //INITIALISATION
        int points = 0;
        int rank = 0;
        int hand = 0;
        
        //Create new deck
        Deck   d = new Deck();

        //CARD DEAL LOOP
        do {    //Loop start
        c = d.deal();
        
        System.out.printf("Gezogene Karte %s %n", c); //print drawn card

        //Convert card rank to points
        rank = c.getRank().value();
        
        switch( rank ){
            case 2: points=2; break;
            case 3: points=3; break;
            case 4: points=4; break;
            case 5: points=5; break;
            case 6: points=6; break;
            case 7: points=7; break;
            case 8: points=8; break;
            case 9: points=9; break;
            case 10, 11, 12, 13:
                    points=10; break;
            case 14: points=11; break;
            default:
                assert false: "invalid rank";
                points=0; break; }
        
        hand += points; //add points to hand
        

        System.out.printf("Die Karte hat %d Punkte %n%n",points); // print points of drawn card.
        System.out.printf("Punkte auf der Hand %d: %n%n", hand); // print total points of hand.

        } while (hand < 17); //Loop end
        
        //Print if Lost
         if (hand > 21) {
             System.out.print("LOST");
         } 



        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        System.out.flush();
    }//method()

}//class
