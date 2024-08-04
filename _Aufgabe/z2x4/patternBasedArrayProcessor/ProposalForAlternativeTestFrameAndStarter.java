// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package patternBasedArrayProcessor;


/**
 * Your alternative TestFrame for {@link ArrayProcessorSolutionWrapper}.
 * 
 * @author  (your name(s))  based on template from Michael Schaefers
 * @version (a version number or a date)
 */
public class ProposalForAlternativeTestFrameAndStarter  {
    
    /**
     * Method to start test.
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie (bis auf eine mögliche Änderung des Klassennamens)
        // KEINE Änderungen oberhalb dieser Zeilen durch
        //###
        //###
        //###
        //###   HIER kommt Ihr Code zum Testen hin ;-)
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
        
        // Nur ein einfacher Vorschlag:
        // ============================
        
        // Ein Array als TestCase:
        final long[][] theArray = {
            {   2,   3,   5,   7,  11,  13,  17,  19,  23,  29 },
            {  31,  37,  41,  43,  47,  53,  59,  61,  67,  71 },
            {  73,  79,  83,  89,  97, 101, 103, 107, 109, 113 },
            { 127, 131, 137, 139, 149, 151, 157, 163, 167, 173 },
            { 179, 181, 191, 193, 197, 199, 211, 223, 227, 229 },
            { 233, 239, 241, 251, 257, 263, 269, 271, 277, 281 },
            { 283, 293, 307, 311, 313, 317, 331, 337, 347, 349 },
            { 353, 359, 367, 373, 379, 383, 389, 397, 401, 409 },
            { 419, 421, 431, 433, 439, 443, 449, 457, 461, 463 },
            { 467, 479, 487, 491, 499, 503, 509, 521, 523, 541 }
        };
        
        // Obiges Array auswerten
        final ArrayProcessor arrayProcessor = new ArrayProcessor();             // ArrayProcessor erzeugen
        final long result = arrayProcessor.process( theArray );                 // ArrayProcessor mit Analyse des Arrays beauftragen
        System.out.printf( "result = %d\n",  result );                          // Ergebnis ausgeben
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }//method()
    
}//class
