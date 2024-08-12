// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package theLastThree;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Sprachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" für Erklärungen und Ausführungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 *     Löschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung müssen Sie GUTEN Kommentar schreiben.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * The {@link LastThree} - see task
 * 
 * @author  Nico Pätzel 
 * @version 2023/08/12 Version 1
 */
public class LastThree {

    int lastNumber;
    int secondNumber;
    int thirdNumber;
    int processCounter;


    /**
     * in the beginning there isn't any number known
     */
    public LastThree(){

        int lastNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int processCounter = 0;


    }//method()



    /**
     * print the last three numbers/values
     */
    public void printLastThree(){

        if (processCounter >= 3) {
            System.out.printf(" %d %d %d ", thirdNumber, secondNumber, lastNumber );
        } else if (processCounter == 2) {
            System.out.printf(" %d %d ", secondNumber, lastNumber );
        } else if (processCounter == 1){
            System.out.printf(" %d ", lastNumber );
        } else {
            System.out.printf("nix");
        }



    }//method()

    /**
     * process new value
     * 
     * @param value  current value
     */
    public void processNewValue( int value ){
        
        thirdNumber = secondNumber;
        secondNumber = lastNumber;
        lastNumber = value;
        
        processCounter++;
        
    }//method()

}
