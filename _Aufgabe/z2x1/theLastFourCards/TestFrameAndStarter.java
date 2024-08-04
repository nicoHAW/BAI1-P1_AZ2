package theLastFourCards;


import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * {@link TestFrameAndStarter} for "the Last Four Cards" - see task.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_003___2023_04_01__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        
        System.out.printf( "Start simple tests:\n" );
        System.out.printf( "===================\n" );
        System.out.printf( "\n" );
        
        doActualTest(
            new Card[]{ D7, DJ, HQ, CK, S4 },
            " D7 >DJ  HQ  CK  S4<"
        );
        doActualTest(
            new Card[]{ CT, DA, HT, SA, ST, HA, DT, CA },
            " CT  DA  HT  SA >ST  HA  DT  CA<"
        );
        
        System.out.printf( "\n" );
        System.out.printf( "################################################################################\n" );
        System.out.printf( "\n\n\n" );
        
        
        
        System.out.printf( "Start a little bit more serious tests:\n" );
        System.out.printf( "======================================\n" );
        System.out.printf( "\n" );
        
        doActualTest(
            new Card[]{ D2, H3, S4, C5 },
            ">D2  H3  S4  C5<"
        );
        doActualTest(
            new Card[]{ D6, H7, S8 },
            ">D6  H7  S8<"
        );
        doActualTest(
            new Card[]{ C9, DT },
            ">C9  DT<"
        );
        doActualTest(
            new Card[]{ SJ },
            ">SJ<"
        );
        doActualTest(
            new Card[]{},
            "\"nix\""
        );
        System.out.printf( "\n\n" );
        System.out.printf( "THE END" );
    }//method()
    
    private static void doActualTest( final Card[] testCase,  final String checkInfo ){
        System.out.printf( "TestCase:  %s\n",  checkInfo );
        final LastFourCards lfc = new LastFourCards();
        for( final Card card : testCase ){
            lfc.processNewCard( card );
        }//for
        lfc.printLastFourCards();
    }//method()
    
}//class
