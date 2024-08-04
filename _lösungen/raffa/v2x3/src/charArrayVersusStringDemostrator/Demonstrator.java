package charArrayVersusStringDemostrator;


import java.util.Arrays;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * char[] versus String demonstrator
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class Demonstrator {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_002___2023_04_01__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    final char[] textAsCharArray;
    final String textAsString;
    
    
    
    public Demonstrator( final char[] textAsCharArray,  final String textAsString ){
        assert null!=textAsCharArray && null!=textAsString : "Illegal Arguement : null is NOT supported";
        assert Arrays.equals( textAsCharArray, textAsString.toCharArray() ) : "Uuuupppss : text differs - internal programming error in TestFrame ???";
        
        this.textAsCharArray = textAsCharArray;
        this.textAsString = textAsString;
    }//constructor()
    
    
    
    public void demonstrate(){
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        //###
        //###
        //###
        //###  HIER beginnt der Bereich, den Sie sich anschauen sollen.
        //###  ========================================================
        //###  Das Thema "Arrays" sollte in der Vorlesung bereits abgeschlossen
        //###  sein  bevor(!) Sie sich diesen Code anschauen.
        //###  Gern dürfen Sie sich auch den anderen Code anschauen,
        //###  aber u.U. verfügen Sie noch nicht über das nötige Wissen
        //###  um alles zu verstehen.
        //###
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
        
        
        
        
        
        // Den kompletten Text ausgeben
        System.out.printf(
            "Der kompletter Text als\n"
          + "char[]: %-60s    <<-- \"direkt\" - macht NICHT glücklich ;-)\n"
          + "char[]: %-60s    <<-- mit Arrays.toString()\n"
          + "String: %-60s    <<-- \"direkt\"\n",
            textAsCharArray,
            Arrays.toString( textAsCharArray ),
            textAsString
        );
        System.out.printf( "\n\n\n" );
        
        
        
        // Anzahl Zeichen bestimmen
        // ========================
        // Hierbei wichtig:
        //    array.length      bestimmt Länge des Array(s)
        //    string.length()   bestimmt Länge des String(s)
        final int length1 = textAsCharArray.length;                             // <<== Länge des Array(s)
        final int length2 = textAsString.length();                              // <<== Länge des String(s)
        // Werte ausgeben
        System.out.printf(
            "%-30s %10s %10s\n",                                                // <<== Formatierung der Ausgabe
            "",
            "char[]",
            "String"
        );
        System.out.printf(
            "%-30s %10d %10d\n",                                                // <<== Formatierung der Ausgabe
            "Länge des Texts : ",
            length1,
            length2
        );
        // Kontrolle und merken
        assert length1==length2 : "Error: \"equal\" text differs in length";
        final int textLength = length1;
        
        
        
        // Zeichen einzeln ausgeben
        // ========================
        // Hierbei wichtig:
        //    array[ index ]            erlaubt Zugriff auf gewünschte Position im Array
        //    string.charAt( index )    erlaubt Zugriff auf gewünschte Position im String
        for( int position=0; position<textLength; position++ ){
            final char zeichenImCharArray = textAsCharArray[position];          // <<== Zugriff auf gewünschten Buchstaben mit array[ index ]
            final char zeichenImString    = textAsString.charAt(position);      // <<== Zugriff auf gewünschten Buchstaben mit string.charAt( index )
            System.out.printf(
                "%-30s %10c %10c\n",                                            // <<== Formatierung der Ausgabe
                String.format( "Buchstabe an Position: %d", position ),
                zeichenImCharArray,
                zeichenImString
            );
        }//for
        System.out.printf( "\n\n\n" );
        
        
        
        // Zeichen in Kleinbuchstaben wandeln
        // ==================================
        // Hierbei wichtig:
        //    Character.toLowerCase( char )     wandelt ein Zeichen in den entsprechenden Kleinbuchtstaben
        //    string.toLowerCase()              wandelt den String in einen String aus Kleinbuchstaben
        System.out.printf( "Nur Kleinbuchstaben\n" );
        final String smallLetterText = textAsString.toLowerCase();              // <<== kompletten Text in Kleinbuchstaben wandeln
        for( int position=0; position<textLength; position++ ){
            System.out.printf(
                "%-30s %10c %10c\n",                                            // <<== Formatierung der Ausgabe
                String.format( "Buchstabe an Position: %d", position ),
                Character.toLowerCase( textAsCharArray[position] ),             // <<== Zugriff auf gewünschten Buchstaben mit array[ index ] und einzelnen Buchstaben in Kleinbuchstaben wandeln
                smallLetterText.charAt( position )                              // <<== Zugriff auf gewünschten Buchstaben mit string.charAt( index )
            );
        }//for
        System.out.printf( "\n\n\n" );
        
        
        
        // Zeichen in Grossbuchstaben wandeln
        // ==================================
        // Hierbei wichtig:
        //    Character.toUpperCase( char )     wandelt ein Zeichen in den entsprechenden Grossbuchtstaben
        //    string.toUpperCase()              wandelt den String in einen String aus Grossbuchstaben
        System.out.printf( "Nur Großbuchstaben\n" );
        final String capitolLetterText = textAsString.toUpperCase();            // <<== kompletten Text in Grossbuchstaben wandeln
        for( int position=0; position<textLength; position++ ){
            System.out.printf(
                "%-30s %10c %10c\n",                                            // <<== Formatierung der Ausgabe
                String.format( "Buchstabe an Position: %d", position ),
                Character.toUpperCase( textAsCharArray[position] ),             // <<== Zugriff auf gewünschten Buchstaben mit array[ index ] und einzelnen Buchstaben in Grossbuchstaben wandeln
                capitolLetterText.charAt( position )                            // <<== Zugriff auf gewünschten Buchstaben mit string.charAt( index )
            );
        }//for
        
        
        
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //###  HIER endet der Bereich, den Sie sich anschauen sollen.
        //###  ======================================================
        //###  Gern dürfen Sie sich auch den anderen Code anschauen,
        //###  aber u.U. verfügen Sie noch nicht über das nötige Wissen
        //###  um alles zu verstehen.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }//method()
    
}//class
