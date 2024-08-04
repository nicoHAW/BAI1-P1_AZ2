// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
//"Home"-VCS:  git@git.HAW-Hamburg.de:shf/Px/LabExercise/CXZ_CardsLeanVersion[.git]
package cardDemo;


import cards.Card;
import cards.Deck;

import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;


/* Bemerkung zu unterschiedlichen Sprachen in einer Datei/Klasse und eigentlich
 * sogar in einem Projekt!
 * Es gilt später im Berufsleben (und eigentlich schon vorher/"jetzt"):
 *    Es dürfen niemals unterschiedliche Sprachen gemixt werden!!!
 * 
 * Eigentlich ist Englisch "Die Sprache".
 * 
 * Jedoch diese Klasse taucht früh auf und viele Anfänger schätzen es, die für Sie
 * wichtigen Dinge in deutsch zu lesen. Alles was für Anfänger als Anwender/Klient
 * dieser Klasse wichtig ist, ist in deutsch. Wichtige Kommentare (, die für Anfänger
 * nicht interessant sind, ) sind in englisch.
 */
/**
 * Die Klasse {@link TestFrameAndStarterForCardDemo} startet die CardDemo.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarterForCardDemo {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_001___2024_04_28__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * Die Methode {@link #main()} startet die Demo.
     * Es werden zunächst allgemeine Informationen zu unterschiedlichen "Dingen" ausgegeben.
     * Danach erfolgt die eigentliche Demo.
     * 
     * @param unused wird nicht genutzt, aber "von Java eingefordert".
     */
    public static void main( final String... unused ){
        
        // print some information at start
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "    Demo version:           %s\n",  CardDemo.getDecodedVersion() );
        System.out.printf( "    Card version:           %s\n",  Card.getDecodedVersion() );
        System.out.printf( "    Deck version:           %s\n",  Deck.getDecodedVersion() );
        System.out.printf( "\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "    UTF-8 configured?:      %s      <- check output\n",  "[ÄËÏÖÜẞäëïöüß🙂😉🙁😟😓😎]" );
        System.out.printf( "\n\n\n\n" );
        //
        System.out.printf( "Start of actual demo\n" );
        System.out.printf( "vvvvvvvvvvvvvvvvvvvv\n" );
        System.out.printf( "\n\n" );
        
        
        
        
        
        // Anfang der eigentlichen Demo
        //=============================
        final CardDemo cardDemo = new CardDemo();
        cardDemo.demonstrate();
        //
        System.out.flush();
    }//method()
    
}//class
