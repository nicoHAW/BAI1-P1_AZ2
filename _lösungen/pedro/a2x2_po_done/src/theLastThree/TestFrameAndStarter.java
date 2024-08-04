// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package theLastThree;


/**
 * {@link TestFrameAndStarter} for "the Last Three" - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value 2023_02_28}
 */
public class TestFrameAndStarter {
    
    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        LastThree lastThree;
        
        System.out.printf( "Start simple tests:\n" );
        System.out.printf( "===================\n" );
        System.out.printf( "\n" );
        //
        lastThree = new LastThree();
        lastThree.processNewValue( 11 );
        lastThree.processNewValue( 12 );
        lastThree.processNewValue( 13 );
        lastThree.processNewValue( 14 );
        System.out.printf( "11 [12  13  14]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        System.out.printf( "11  12 [13  14  15]\n" );
        lastThree.processNewValue( 15 );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        System.out.printf( "################################################################################\n" );
        System.out.printf( "\n\n\n" );
        
        
        
        System.out.printf( "Start a little bit more serious tests:\n" );
        System.out.printf( "======================================\n" );
        System.out.printf( "\n" );
        //
        lastThree = new LastThree();
        System.out.printf( "\"nix\"\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 13 );
        System.out.printf( "[13]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 59 );
        System.out.printf( "[13  59]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 11 );
        System.out.printf( "[13  59  11]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 23 );
        System.out.printf( " 13 [59  11  23]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 43 );
        System.out.printf( " 13  59 [11  23  43]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 47 );
        System.out.printf( " 13  59  11 [23  43  47]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 37 );
        System.out.printf( " 13  59  11  23 [43  47  37]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 97 );
        System.out.printf( " 13  59  11  23  43 [47  37  97]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 37 );
        System.out.printf( " 13  59  11  23  43  47 [37  97  37]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        System.out.printf( "################################################################################\n" );
        System.out.printf( "\n" );
        //
        lastThree = new LastThree();
        lastThree.processNewValue( 0 );
        System.out.printf( "[0]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        lastThree.processNewValue( 0 );
        System.out.printf( "[0  0]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        lastThree.processNewValue( 0 );
        System.out.printf( "[0  0  0]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        lastThree.processNewValue( 0 );
        System.out.printf( " 0 [0  0  0]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        System.out.printf( "THE END" );
     }//method()

}//class
