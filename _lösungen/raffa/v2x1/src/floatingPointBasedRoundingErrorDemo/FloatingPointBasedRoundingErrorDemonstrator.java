package floatingPointBasedRoundingErrorDemo;


import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link FloatingPointBasedRoundingErrorDemonstrator} soll beispielhaft
 * den Umgang mit den "Dingen" aus dem cards-Package demonstrieren.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class FloatingPointBasedRoundingErrorDemonstrator {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00003_001___2024_04_28__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    public void demonstrate(){
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        //###
        //###
        //###
        //###           HIER beginnt die Demo
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
        
        
        
        //
        //
        // Experiment#1
        // Von long nach double wandeln und dann den double zurück nach long wandlen
        //
        
        System.out.printf( "long -> double -> long\n" );
        System.out.printf( "======================\n" );
        System.out.printf( "\n\n" );
        
        final long[] exampleValues = {
            9223372036854774272L,
            9223372036854773248L,
            9223372036854772224L,
            9223372036854770176L,
            9223372036854769152L,
            9223372036854768128L,
            9223372036854767104L,
            9223372036854766080L,
            9223372036854765056L
        };
        
        // Für jeden Wert aus exampleValues
        for( final long example : exampleValues ){
            // Zunächst erst mal den Startwert ausgeben
            System.out.printf( "long value :   %d      ->  ",  example );
            // Wert von long nach double wandeln bzw. long Wert einem double zuweisen
            final double valueAsDouble = example;
            System.out.printf( "double value : %23.3f\n",  valueAsDouble );
            //
            System.out.printf( "double value : %23.3f  ->  ",  valueAsDouble );
            // Wert von double nach long (zurück) wandeln bzw. double Wert einem long (mittels cast)  zuweisen
            final long valueAsLongAgain = (long)( valueAsDouble );
            System.out.printf( "long value :   %d\n",  valueAsLongAgain, valueAsLongAgain );
            System.out.printf( "- - - - - - - - - - - - - - - - - - - - - - - -\n" );
            //
            // Rundungsfehler untersuchen
            System.out.printf( "before : %d = %x [in Hexadezimal]    start long\n",  example, example );
            System.out.printf( "after :  %d = %x [in Hexadezimal]    after long->double->long\n",  valueAsLongAgain, valueAsLongAgain );
            System.out.printf( "- - - - - - - - - - - - - - - - - - - - - - - -\n" );
            long delta = example - valueAsLongAgain;
            System.out.printf( "rounding error resp. delta :  %d\n",  delta );
            System.out.printf( "\n\n" );
        }//for
        System.out.printf( "\n\n\n\n" );
        
        
        
        
        
        //
        //
        // Experiment#2
        // Addieren bis Unterschied bemerkbar
        //
        
        System.out.printf( "Wann gibt es einen Unterschied und wie groß ist er?\n" );
        System.out.printf( "===================================================\n" );
        System.out.printf( "\n" );
        
        final long startValue = 9223372036854774272L;
        final double valueAsDouble = startValue;
        double newDoubleValue;
        double addOn = 0.0;
        do {
            addOn += 1.0;                                                       // add-on systematisch erhoehen
            newDoubleValue = valueAsDouble + addOn;
        }while( newDoubleValue == valueAsDouble );                              // solange KEIN Unterschied weitermachen
        System.out.printf( "%23.3f   + %.3f   ->   %23.3f\n",  valueAsDouble, addOn, newDoubleValue );
        System.out.printf( "Differenz bzw. Delta ist:  %.3f\n",  newDoubleValue-valueAsDouble );
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Hier endet die Demo
        
    }//method()
    
}//class
