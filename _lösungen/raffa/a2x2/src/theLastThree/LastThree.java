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
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class LastThree {

    int thirdNewestValue; //the oldest entry that we save
    int secondNewestValue; //the middle child
    int newestValue; //the newest entry that we save
    int inputCounter;

    public LastThree(){}

    public void printLastThree(){
        String result = "";
        switch (inputCounter) {
        case 0:
            break;
        case 1:
            result = String.format("last value: %d", this.newestValue);
            break;
        case 2:
            result = String.format("last two values: %d, %d", this.secondNewestValue, this.newestValue);
            break;
        default:
            result = String.format("last three values: %d, %d, %d", this.thirdNewestValue, this.secondNewestValue, this.newestValue);
            break;
        }

        System.out.println(result);
    }//method()

    public void processNewValue( int value ){
        this.thirdNewestValue = this.secondNewestValue;
        this.secondNewestValue = this.newestValue;
        this.newestValue = value;
        this.inputCounter++;
    }//method()

}
