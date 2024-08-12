// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package primeFactorPrinter;


import java.util.Scanner;
import stuffBeginnersDontHaveToUnderstand.Beautician;
import stuffBeginnersDontHaveToUnderstand.Herald;


/**
 * {@link TestFrameAndStarter} for {@link PrimeFactorPrinter}.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value 2023_03_15}
 */
public class TestFrameAndStarter {
    
    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        /*----------------------------------------------------------------------
         * Achtung!
         * ========
         * Sogenannte "Microbenchmarks", wie hier z.B.
         *     ...
         *     final long startTime = System.nanoTime();
         *     // "do computation"
         *     final long stopTime = System.nanoTime();
         *     final long elapsedTime = stopTime-startTime;
         *     ...
         * haben unter Java nur eine sehr bedingte Aussagekraft!
         * Siehe hierzu z.B.:
         *      "Java Performance - The Definitive Guide"(1.ed); Scott Oaks; O'Reily 2014
         * Es gibt unter Java bzw. bei der JVM  viele Faktoren (zum Teil von der konkreten Implementierung/Programm/Code UNabhängig!),
         * wie z.B. die Konfiguratin der JVM:
         *    welcher GarbageCollector (mit welcher Konfiguration),
         *    Heap-, Stack-, "usw."- Size,
         *    JIT/JustInTime-Compiler-Konfiguration,
         *    usw.
         * die Einfluss auf die Laufzeit haben.
         * Kurz: Die Ergebnisse (bzgl. elapsedTime) nicht überbewerten!
         *----------------------------------------------------------------------
         */
        // start actual testing
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe ein, welche Zahl in ihre Primfaktoren zerlegt werden soll\n" );
            System.out.printf( "und tippe danach Return um die Eingabe abzuschliessen.\n" );
            System.out.printf( "=> " );
            //
            final long theNumber = workAroundForSeriousUserInterface.nextLong();
            final PrimeFactorPrinter pfp = new PrimeFactorPrinter();
            System.out.printf( "\n" );
            System.out.printf(                                                  // print computation start time
                "Computation starts at :      %s\n",
                Beautician.getPimpedTime()
            );
            System.out.printf( "\n" );
            final long startTime = System.nanoTime();                           // start time of actual computation
            //
            pfp.printFactorization( theNumber );
            //
            final long stopTime = System.nanoTime();                            // computation stopped
            final long deltaTime = stopTime-startTime;                          // computation time
            System.out.printf( "\n\n" );                                        // you never know ;-)
            System.out.printf(                                                  // print computation time
                "Consumed computation time :  %s\n",
                Beautician.nanoSecondBasedTimeToString( deltaTime )
            );
            System.out.printf( "\n" );
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
