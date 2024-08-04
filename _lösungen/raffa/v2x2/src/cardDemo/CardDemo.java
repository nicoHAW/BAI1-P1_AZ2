package cardDemo;


//Mit den folgenden 4 import-Statements kommt man "immer an alles Nötige".
import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;
//Die obigen 4 imports sind wichtig und sollten vor jeder Ihrer Klassen, die die
//(Spiel-)Karten nutzen, stehen  bis das "import" in der Vorlesung thematisiert wurde.

import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link CardDemo} soll beispielhaft den Umgang mit den "Dingen" aus dem
 * cards-Package demonstrieren.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class CardDemo {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_002___2024_04_28__02L;
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
        
        
        
        
        
        
        /* Nach Vorlesungsstand sind beim ersten Kontakt mit dieser Demo
         * vermutlich die "Scope-Regeln" noch nicht bekannt,
         * daher kommen hier die Deklarationen am Anfang.
         * Sobald die "Scope-Regeln" bekannt sind, sollte die Deklaration
         * (von "lokalen Variablen") möglichst dicht am "Ort der Nutzung" erfolgen. 
         */
        // Deklarationen
        
        Card   card;
        Card[] cardVector;
        Deck   deck = new Deck();
        
        int    i;
        
        
        
        
        
        // 1) Beispiele für einfache "Dinge"
        // Für das Verständnis dieses Abschitt muss/nüssen bekannt sein:
        // o) "Nichts"- alles Nötige wurde in der Vorlesung besprochen,bevor das cards-Package das erste Mal angesprochen wird.
        
        
        // 1.1)
        System.out.println( "Abschnitt: 1.1)" );
        //
        // Alle Karten liegen als Konstanten vor - HQ ist eine Konstante bzw. konkret die Karte "Herz-Dame"
        // Eine konkrete Karte nehmen ( Achtung! Diese Karte wird nicht dem Deck entnommen!)
        card = HQ;                                                              // Die konkrete Karte "Herz-Dame" nehmen.
        System.out.println( card );                                             // Die Karte ausgeben
        //
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        // 1.2)
        System.out.println( "Abschnitt: 1.2)" );
        //
        // Jetzt eine Karte vom Deck/Kartenstapel/Kartenspiel nehmen.
        card = deck.deal();                                                     // eine Karte vom Kartenstapel geben lassen
        //
        System.out.println( "Wird eine Ausgabe kommen?" );
        // Karte anschauen und prüfen ob CJ, CLUB, JACK
        if ( card.equals( CJ ) ){                                               // ist die Karte eine Kreuzbube ?
            System.out.print( "  Die Karte ist ein Kreuz-Bube bzw. CJ :        ");
            System.out.println( card );
        }//if
        if ( card.getSuit().equals( CLUB ) ){                                   // ist die Karte ein Kreuz ?
            System.out.print( "  Die Karte ist von der Farbe Kreuz bzw. CLUB : ");
            System.out.println( card );
        }//if
        if ( card.getRank().equals( JACK ) ){                                   // ist die Karte ein Bube ?
            System.out.print( "  Die Karte ist von dem Rang Bube bzw. JACK :   ");
            System.out.println( card );
        }//if
        System.out.println( "#########################" );
        System.out.println();
        // Falls die Karte ein Kreuz-Bube"war, dann kamen 3 Ausgaben mit CJ.
        
        // 1.3)
        System.out.println( "Abschnitt: 1.3)" );
        //
        // Achtung U.U. war vorhin die Karte wirklich ein "Kreuz-Bube" - dann würde er jetzt im Deck fehlen.
        // Jetzt solange eine Karte ziehen bis ein "Kreuz Bube" kommt.
        do {                                                                    // nimm solange
            card = deck.deal();                                                 // ..eine Karte vom Stapel
            System.out.print( "" + card + ", " );                                  // ..bis es
        }while ( ! card.equals( CJ ) );                                         // ..ein Kreuzbube ist
        System.out.println();
        //
        System.out.println( "Jetzt ist es aber ein Kreuz Bube (gewesen)\n\n\n\n" );
        
        // Note:
        // Bis "hierhin" wurde print/println genutzt
        // Ab "hier" kosequent printf
        
        
        
        //----------------------------------------------------------------------
        // 2)
        // Für diesen Abschitt muss/nüssen bekannt sein:
        // o) "Array"
        System.out.printf( "Abschnitt: 2)\n" );
        
        // Ausgabe eines "Karten"-Arrays, das Lücken enthält
        
        // U.U. wurden (bei der Suche nach dem Kreuzbuben) bereits zu viele Karten dem Deck entnommen.
        // Daher vorsichtshalber ein NEUes Deck bzw. neues Kartenstiel nehmen.
        deck = new Deck();                                                      // Neues Deck.
        
        cardVector = new Card[7];                                               // Array hat Platz für 7 Karten
        for( i=0;  i<5;  i++ ){ cardVector[i] = deck.deal(); }                  // Es werden nur(!) 5 Karten in das Array getan
        System.out.printf( "Das ARRAY kann bis zu %d Karten aufnehmen\n", cardVector.length );
        System.out.printf( "Das ARRAY enthält die Karten: " );
        //
        // Alle Karten (soweit vorhanden einzeln) ausgeben
        i=0;
        while( i<cardVector.length && cardVector[i]!=null ){
            System.out.printf( "%s, ", cardVector[i] );
            i++;
        }//while
        System.out.printf( "\n" );
        //
        // alle Karten des Array (geschlossen) ausgeben
        printCardArray( cardVector );
        //
        System.out.printf( "\n\n\n" );
        
        
        
        //----------------------------------------------------------------------
        // 3)
        // Für diesen Abschitt muss/nüssen bekannt sein:
        // o) "Array"
        //
        // ~) Für das inhaltliche Verständnis von:
        //        ….ordinal()
        //    Sollte "enum" bekannt sein.
        //    Für die Anwendung ist das Wissen jedoch nicht nötig (Client/Anwender-Sicht)
        
        // 3.1)
        System.out.printf( "Abschnitt: 3.1)\n" );
        //
        // Informationen über einzelne Spielkarten abfragen bzw. ausgeben
        
        card = deck.deal();
        System.out.printf( "Die Karte %s hat:\n", card );
        System.out.printf( "    Die (Rang-Aufzähl-)Position: %2d    (2 hat (Rang-Aufzähl-)Position 0  und Ass hat (Rang-Aufzähl-)Position 12)\n",  card.getRank().ordinal() );
        System.out.printf( "    Den Rang:  %s / (Rang-)Wert:  %2d    (2 hat Rang 2 / (Rang-)Wert 2     und Ass hat Rang A / (Rang-)Wert 14)\n",    card.getRank(),  card.getRank().value() );
        System.out.printf( "    Die Farbe:                    %s\n",                                                                               card.getSuit() );
        //
        System.out.printf( "\n" );
        
        // 3.2)
        System.out.printf( "Abschnitt: 3.2)\n" );
        //
        // Beispiel für Zusammenhang : Rang <-> value <-> ordinal
        System.out.printf( "Zusammenspiel: Rang <-> ordinal/(Rang-Aufzähl-)Position <-> value/(Rang-)Wert\n" );
        for( i=0;  i<=12;  i++ ){
            Rank r = Rank.values()[i];
            System.out.printf( "Die Position: %2d entspricht dem Rang: %s ",  i, r );
            System.out.printf( "und der Rang: %s entspricht der Position: %2d bzw. dem Wert %2d\n",  r, r.ordinal(), r.value() );
        }//for
        //
        System.out.printf( "\n" );
        
        // 3.3)
        System.out.printf( "Abschnitt: 3.3)\n" );
        //
        // Beispiel für Zusammenhang : Farbe <-> ordinal
        System.out.printf( "Zusammenspiel: Farbe <-> ordinal/(Farb-Aufzähl-)Position\n" );
        for( i=0;  i<=3;  i++ ){
            Suit s = Suit.values()[i];
            System.out.printf( "Die Position: %1d entspricht der Farbe: %s ",  i, s );
            System.out.printf( "und die Farbe: %s entspricht der Position: %1d\n",  s, s.ordinal() );
        }//for
        //
        System.out.printf( "\n" );
        
        
        // 3.4)
        System.out.printf( "Abschnitt: 3.4)\n" );
        //
        // Alle Spielkartenränge von TWO bis ACE und zurück ausgeben
        //
        // Demo für increment
        Rank r = TWO;
        do{
            System.out.printf( "%s ", r );
            r = r.increment();                                                  // <<<==== hier Beispiel-Aufruf
        }while( ! r.equals( ACE ));
        //\=> r ist ACE
        System.out.printf( "\n" );
        //
        // Demo für decrement
        do{
            System.out.printf( "%s ", r );
            r = r.decrement();                                                  // <<<==== hier Beispiel-Aufruf
        }while( ! r.equals( TWO ));
        //\=> r ist TWO
        System.out.printf( "\n" );
        //
        System.out.printf( "\n\n\n" );
        
        
        
        //----------------------------------------------------------------------
        // 4)
        // Für diesen Abschitt muss/nüssen bekannt sein:
        // o) "Nichts"- alles Nötige wurde in der Vorlesung besprochen,bevor das cards-Package das erste Mal angesprochen wird.
        //
        // ~) Für das inhaltliche Verständnis von:
        //         ….compareTo()
        //    Sollte "Comparable" bekannt sein..
        //    Für die Anwendung ist das Wissen jedoch nicht nötig (Client/Anwender-Sicht)
        
        // Zwei Karten nehmen und deren Rang vergleichen
        
        final Card card1st = deck.deal();
        final Card card2nd = deck.deal();
        
        // 4.1)
        System.out.printf( "Abschnitt: 4.1)\n" );
        //
        // Rang zweier Karten vergleichen - Variante 1
        if ( card1st.getRank().value() < card2nd.getRank().value() ){
            System.out.printf( "Variante1: Die Karte %s hat einen \"kleineren\" Rang als die Karte %s\n",  card1st, card2nd );
        }else if ( card1st.getRank().value() > card2nd.getRank().value() ){
            System.out.printf( "Variante1: Die Karte %s hat einen \"größeren\" Rang als die Karte %s\n",  card1st, card2nd );
        }else{
            System.out.printf( "Variante1: Die Karte %s hat den gleichen Rang wie die Karte %s\n",  card1st, card2nd );
        }//if
        //
        System.out.printf( "\n" );
        
        // 4.2)
        System.out.printf( "Abschnitt: 4.2)\n" );
        //
        // Rang zweier Karten vergleichen - Variante 2 (Verständnis erfordert (vermutlich noch) zusätzliches Wissen)
        if ( card1st.getRank().compareTo( card2nd.getRank() ) < 0 ){
            System.out.printf( "Variante2: Die Karte %s hat einen \"kleineren\" Rang als die Karte %s\n",  card1st, card2nd );
        }else if ( card1st.getRank().compareTo( card2nd.getRank() ) > 0 ){
            System.out.printf( "Variante2: Die Karte %s hat einen \"größeren\" Rang als die Karte %s\n",  card1st, card2nd );
        }else{
            System.out.printf( "Variante2: Die Karte %s hat den gleichen Rang wie die Karte %s\n",  card1st, card2nd );
        }//if
        //
        System.out.printf( "\n" );
        
        // 4.3)
        System.out.printf( "Abschnitt: 4.3)\n" );
        //
        // Rang zweier Karten vergleichen - Variante 3 (Verständnis erfordert (vermutlich noch) zusätzliches Wissen)
        if ( card1st.compareTo( card2nd ) < 0 ){
            System.out.printf( "Variante3: Die Karte %s hat einen \"kleineren\" Rang als die Karte %s\n",  card1st, card2nd );
        }else if ( card1st.compareTo( card2nd ) > 0 ){
            System.out.printf( "Variante3: Die Karte %s hat einen \"größeren\" Rang als die Karte %s\n",  card1st, card2nd );
        }else{
            System.out.printf( "Variante3: Die Karte %s hat den gleichen Rang wie die Karte %s\n",  card1st, card2nd );
        }//if
        //
        System.out.printf( "\n\n\n" );
        
        
        
        //----------------------------------------------------------------------
        // 5)
        // Für diesen Abschitt muss/müssen bekannt sein:
        // o) "Array" sowie
        // o) "foreach" bzw. for-Loop in Iterator-Form
        //
        // ~) Für das inhaltliche Verständnis von (den hier verwendeten):
        //        ….name(), ….ordinal(), ….values()
        //    sollte "enum" bekannt sein.
        //    Für die Anwendung ist das Wissen jedoch nicht nötig (Client/Anwender-Sicht)
        
        // Ausgabe-Varianten
        
        // 5.1)
        System.out.printf( "Abschnitt: 5.1)\n" );
        //
        // Eine Karte ausgeben
        final Card sampleCard = deck.deal();
        System.out.printf( "Beispielsweise die Karte %s hat\n", sampleCard );
        System.out.printf( "den zugehörigen Rang (kurz&knapp)  %9s   <- so ist es gewünscht 😉\n",  sampleCard.getRank() );         // Ergebnis von getRank() ist vom Typ Rank (und wird bei der Ausgabe automatisch in einen String gewandelt)
        System.out.printf( "der zugehörigen Rang (ausführlich) %9s   <- so bitte NICHT!\n",         sampleCard.getRank().name() );  // Ergebnis von getRank().name() ist vom Typ String
        System.out.printf( "die zugehörige Farbe (kurz&knapp)  %9s   <- so ist es gewünscht 😉\n",  sampleCard.getSuit() );         // Ergebnis von getSuit() ist vom Typ Suit (und wird bei der Ausgabe automatisch in einen String gewandelt)
        System.out.printf( "die zugehörige Farbe (ausführlich) %9s   <- so bitte NICHT!\n",         sampleCard.getSuit().name() );  // Ergebnis von getSuit().name() ist vom Typ String
        //
        System.out.printf( "\n" );
        
        // 5.2)
        System.out.printf( "Abschnitt: 5.2)\n" );
        //
        // Alle Karten (kurz zusammenstellen und) ausgeben
        final Card[] allCards = {
            C2, C3, C4, C5, C6, C7, C8, C9, CT, CJ, CQ, CK, CA,
            D2, D3, D4, D5, D6, D7, D8, D9, DT, DJ, DQ, DK, DA,
            H2, H3, H4, H5, H6, H7, H8, H9, HT, HJ, HQ, HK, HA,
            S2, S3, S4, S5, S6, S7, S8, S9, ST, SJ, SQ, SK, SA
        };
        for( final Card currentCard : allCards ){
            System.out.printf( "%s",  currentCard );
        }//for
        System.out.printf( "\n" );
        //
        System.out.printf( "\n" );
        
        // 5.3)
        System.out.printf( "Abschnitt: 5.3)\n" );
        //
        // Alle Kartenränge ausgeben (Verständnis erfordert (vermutlich noch) zusätzliches Wissen)
        // Siehe auch 3.4: Alle Spielkartenränge von TWO bis ACE und zurück ausgeben
        for( final Rank currentRank : Rank.values() ) {
            System.out.printf( "%s",  currentRank );
        }//for
        System.out.printf( "\n" );
        //
        System.out.printf( "\n" );
        
        // 5.4)
        System.out.printf( "Abschnitt: 5.4)\n" );
        //
        // Alle Kartenfarben ausgeben (Verständnis erfordert (vermutlich noch) zusätzliches Wissen)
        for( final Suit currentSuit : Suit.values() ) {
            System.out.printf( "%s",  currentSuit );
        }//for
        System.out.printf( "\n" );
        //
        System.out.printf( "\n\n\n" );
        
        
        
        //----------------------------------------------------------------------
        
        System.out.printf( "THE END" );
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()
    
}//class
