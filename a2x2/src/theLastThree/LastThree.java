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
 * @author  Nico, Pedro 
 * @version 16Mai24
 */
public class LastThree {
    
    int inputCounter;            // Counts processNewValue
    int lastNumber;         // Remebers last Number
    int scndLastNumber;     // Remebers second last Number
    int thrdLastNumber;    // Remebers third last Number
    
    
    
    /**
     * in the beginning there isn't any number known
     */
    public LastThree(){

        inputCounter = 0;
        lastNumber = 0;
        scndLastNumber = 0;
        thrdLastNumber = 0;
        
    }//method()
    
    
    
    /**
     * print the last three numbers/values
     */
    public void printLastThree(){
       
        // prints content of variables based on counter value. 
        if(inputCounter >= 3) {
            System.out.printf("%d, %d, %d", lastNumber, scndLastNumber, thrdLastNumber);
        } else if (inputCounter == 2) {
            System.out.printf("%d, %d", scndLastNumber, thrdLastNumber);
        } else if (inputCounter == 1) {
            System.out.printf("%d", thrdLastNumber);
        } 

        
    }//method()
    
    /**
     * process new value
     * 
     * @param value  current value
     */
    public void processNewValue( int value ){
       inputCounter++; // increases counter values for every "drawn" number. 
       // takes value and passes it through variables if more than one number. 
       lastNumber = scndLastNumber;
       scndLastNumber = thrdLastNumber;
       thrdLastNumber = value;
        
    }//method()
    
}
