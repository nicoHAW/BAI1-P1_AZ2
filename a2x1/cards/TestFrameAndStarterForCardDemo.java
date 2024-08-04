// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
//"Home"-VCS:  git@git.HAW-Hamburg.de:shf/Px/LabExercise/CXZ_CardsLeanVersion[.git]
package cards;


// Mit den folgenden 4 import-Statements kommt man "immer" an alles Nötige.
import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;
// Die obigen 4 imports sind wichtig und sollten vor jede Ihrer Klassen, die die
// (Spiel-)Karten nutzen bis das "import" in der Vorlesung thematisiert wurde.
//
//Andere Imports, die dieser "Starter" benötigt
import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;


/* Bemerkung
 * zu unterschiedlichen Sprachen in einer Datei/Klasse und eigentlich sogar in
 * einem Projekt!
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
 * Die Klasse {@link TestFrameAndStarterForCardDemo} soll beispielhaft den Umgang
 * mit den "Dingen" aus dem cards-Package demonstrieren.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarterForCardDemo {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_002___2023_03_28__01L;
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
        System.out.printf( "    Demo version:           %s\n",  version.getDecodedVersion() );
        System.out.printf( "    Deck version:           %s\n",  Deck.getDecodedVersion() );
        System.out.printf( "    Card version:           %s\n",  Card.getDecodedVersion() );
        System.out.printf( "\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.getJavaVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "    UTF-8 configured?:      %s      <- check output\n",  "[ÄÖÜẞäöüß🙂😉🙁😟😓😎]" );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Start of actual demo\n" );
        System.out.printf( "vvvvvvvvvvvvvvvvvvvv\n" );
        System.out.printf( "\n\n\n\n" );
        //
        System.out.flush();
        
        
        
        
        
        // Anfang der eigentlichen Demo
        //=============================
        
        
        // Deklarationen
        
        Card   c;
        Card[] ca;
        Deck   d = new Deck();
        
        int    i;
        
        
        
        // Beispiele für einfache "Dinge"
        c = d.deal();                                                           // eine Karte vom Kartenstapel geben lassen
        
        System.out.println( "Wird eine Ausgabe kommen?" );
        if ( c.equals( CJ ) ){             System.out.print( c ); }             // ist die Karte eine Kreuzbube ?
        if ( c.getSuit().equals( CLUB ) ){ System.out.print( c ); }             // ist die Karte ein Kreuz ?
        if ( c.getRank().equals( JACK ) ){ System.out.print( c ); }             // ist die Karte ein Bube ?
        System.out.println( "#########################" );
        
        do {                                                                    // nimm solange
            c = d.deal();                                                       // ..eine Karte vom Stapel
            System.out.printf( "%s, ", c );                                     // ..bis es
        }while ( ! c.equals( CJ ) );                                            // ..ein Kreuzbube ist
        
        System.out.printf( "\n Jetzt ist es aber ein Kreuz Bube\n\n\n\n" );
        
        
        
        //----------------------------------------------------------------------
        
        // Ausgabe eines "Karten"-Arrays, das Lücken enthält
        
        ca = new Card[7];                                                       // Array hat Platz für 7 Karten
        for (i=0; i<5; i++){ ca[i] = d.deal(); }                                // Es werden nur(!) 5 Karten in das Array getan
        System.out.printf( "Das ARRAY kann bis zu %d Karten aufnehmen\n", ca.length );
        System.out.print(  "Das ARRAY enthält die Karten: " );
        //
        // alle Karten (soweit vorhanden einzeln) ausgeben
        i=0;
        while( i<ca.length && ca[i]!=null ){
            System.out.printf( "%s, ", ca[i] );
            i++;
        }//while
        System.out.printf( "\n" );
        //
        // alle Karten des Array (geschlossen) ausgeben
        printCardArray( ca );
        System.out.printf( "\n\n\n" );
        
        
        
        //----------------------------------------------------------------------
        
        // Informationen über einzelne Spielkarten abfragen bzw. ausgeben
        
        c = d.deal();
        System.out.printf( "Die Karte %s hat:\n", c );
        System.out.printf( "    Die Position:    %2d   (2 hat Position 0  und Ass hat Position 12\n",               c.getRank().ordinal() );
        System.out.printf( "    Den Rang: %s bzw. %2d   (2 hat Rang 2      und Ass hat Rang 14\n",     c.getRank(), c.getRank().value() );
        System.out.printf( "    Die Farbe:        %s\n",                                                            c.getSuit() );
        System.out.printf( "\n\n\n" );
        
        
        
        // Beispiel für Zusammenhang : Rang <-> value <-> ordinal
        System.out.printf( "Zusammenspiel: Rang <-> value/Wert <-> ordinal/Position\n" );
        for (i=0; i<=12; i++){
            Rank r = Rank.values()[i];
            System.out.printf( "Die Position: %2d entspricht dem Rang: %s ", i, r );
            System.out.printf( "und der Rang: %s entspricht der Position: %2d bzw. dem Wert %2d\n", r, r.ordinal(), r.value() );
        }//for
        System.out.println();
        
        // Beispiel für Zusammenhang : Farbe <-> ordinal
        System.out.printf( "Zusammenspiel: Farbe <-> ordinal/Position\n" );
        for (i=0; i<=3; i++){
            Suit s = Suit.values()[i];
            System.out.printf( "Die Position: %2d entspricht der Farbe: %s ", i, s );
            System.out.printf( "und die Farbe: %s entspricht der Position: %2d\n", s, s.ordinal() );
        }//for
        System.out.println();
        
        
        
        // alle Spielkartenränge von TWO bis ACE und zurück ausgeben
        //
        // Demo für increment
        Rank r = TWO;
        do{
            System.out.printf( "%s ", r );
            r = r.incremented();                                                // <<<==== hier Beispiel-Aufruf
        }while( ! r.equals( ACE ));
        //\=> r ist ACE
        System.out.println();
        //
        // Demo für decrement
        do{
            System.out.printf( "%s ", r );
            r = r.decremented();                                                // <<<==== hier Beispiel-Aufruf
        }while( ! r.equals( TWO ));
        //\=> r ist TWO
        System.out.println();
        System.out.printf( "\n\n\n" );
        
        
        
        //----------------------------------------------------------------------
        
        // Zwei Karten nehmen und deren Rang vergleichen
        
        Card c1 = d.deal();
        Card c2 = d.deal();
        
        // Rang zweier Karten vergleichen - Variante 1
        if ( c1.getRank().value() < c2.getRank().value() ){
            System.out.printf( "Variante1: Die Karte %s hat einen \"kleineren\" Rang als die Karte %s\n",  c1, c2 );
        }else if ( c1.getRank().value() > c2.getRank().value() ){
            System.out.printf( "Variante1: Die Karte %s hat einen \"größeren\" Rang als die Karte %s\n",  c1, c2 );
        }else{
            System.out.printf( "Variante1: Die Karte %s hat den gleichen Rang wie die Karte %s\n",  c1, c2 );
        }//if
        
        // Rang zweier Karten vergleichen - Variante 2 (Verständnis erfordert zusätzliches Wissen)
        if ( c1.getRank().compareTo( c2.getRank() ) < 0 ){
            System.out.printf( "Variante2: Die Karte %s hat einen \"kleineren\" Rang als die Karte %s\n",  c1, c2 );
        }else if ( c1.getRank().compareTo( c2.getRank() ) > 0 ){
            System.out.printf( "Variante2: Die Karte %s hat einen \"größeren\" Rang als die Karte %s\n",  c1, c2 );
        }else{
            System.out.printf( "Variante2: Die Karte %s hat den gleichen Rang wie die Karte %s\n",  c1, c2 );
        }//if
        
        // Rang zweier Karten vergleichen - Variante 3 (Verständnis erfordert zusätzliches Wissen)
        if ( c1.compareTo( c2 ) < 0 ){
            System.out.printf( "Variante3: Die Karte %s hat einen \"kleineren\" Rang als die Karte %s\n",  c1, c2 );
        }else if ( c1.compareTo( c2 ) > 0 ){
            System.out.printf( "Variante3: Die Karte %s hat einen \"größeren\" Rang als die Karte %s\n",  c1, c2 );
        }else{
            System.out.printf( "Variante3: Die Karte %s hat den gleichen Rang wie die Karte %s\n",  c1, c2 );
        }//if
        
        
        
        //----------------------------------------------------------------------
        
        System.out.printf( "\n\n\n" );
        System.out.println( "THE END" );
    }//method()
    
}//class
