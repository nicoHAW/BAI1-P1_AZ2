// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package charArrayVersusStringDemostrator;


import java.util.Scanner;
import stuffBeginnersDontHaveToUnderstand.Herald;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * {@link TestFrameAndStarter} for :  char[] versus String demonstrator.
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
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe einen Text ein\n" );
            System.out.printf( "und tippe danach Return um die Eingabe abzuschliessen.\n" );
            System.out.printf( "=> " );
            //
            final String text = workAroundForSeriousUserInterface.nextLine();
            final Demonstrator demonstrator = new Demonstrator( text.toCharArray(), text );
            System.out.printf( "\n\n" );
            demonstrator.demonstrate();
            System.out.printf( "\n" );
            //
            System.out.printf( "THIS IS THE END" );
            System.out.flush();
            
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                final StringBuilder sb = new StringBuilder( "\n" );
                sb.append( "###\n" );
                sb.append( "### Uuuupppss, was ist denn da passiert ????\n" );
                sb.append( "###\n" );
                Herald.proclaimError( sb );
            }//if
            throw( ex );
        }//try
        
    }//method()
    
}//class
