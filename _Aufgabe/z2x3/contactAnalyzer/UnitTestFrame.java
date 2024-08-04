package contactAnalyzer;


import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
import java.util.concurrent.TimeUnit;
//
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


/**
 * (J)UnitTestFrame for Contact Analyzer / Rectangle - see task
 * 
 * @author   Michael Schaefers ; P1@Hamburg-UAS.eu 
 * @version  2021/04/19
 */
public class UnitTestFrame {
    
    // VORBEMERKUNG:
    // =============
    // o) Guter Code ist gut kommentiert!
    // o) Es ist die Aufgabe des Programmierers/SW-Produzenten zu testen und nicht die des Kunden.
    // Dieser Code ist bewusst kaum kommentiert, damit es moeglichst schwer ist, die TestCases zu entnehmen.
    // Dieser UnitTestFrame soll Ihnen im Sinne eines Akzeptanztests nur die Sicherheit geben, dass Ihr Code ok ist.
    
    final static private int commonLimit = 4_000;                               // timeout resp. max. number of ms for test
    
    static private int singleTestCount;
    static private int successCount;
    
    
    
    
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testAlignedSystematic(){
        final int[][][][] rectangle = {
            { { {   0,   0 }, {   2,   2 } },   { {   2,   4 }, {   4,   1 } } },
            { { {  -7,  -5 }, {   3,  -2 } },   { {   3,  -1 }, {   9,  -7 } } },
            { { { -40, -40 }, {  -3, -13 } },   { {  -5, -13 }, {   1,  -7 } } },
            { { {  -7,  -5 }, {   3,   2 } },   { {   3,  -7 }, {   9,  -1 } } },
            //------------------------------------------------------------------
            { { {   0,   0 }, {   3,   5 } },   { {   3,   2 }, {   7,  11 } } },
            { { {   0,   0 }, {   3,  11 } },   { {   3,   2 }, {   5,   7 } } },
            { { {  -1,   0 }, {   2,   5 } },   { {   2,   2 }, {   6,  11 } } },
            { { {  -1,   0 }, {   2,  11 } },   { {   2,   2 }, {   4,   7 } } },
            { { {   0,  -1 }, {   3,   4 } },   { {   3,   1 }, {   7,  10 } } },
            { { {   0,  -1 }, {   3,  10 } },   { {   3,   1 }, {   5,   6 } } },
            { { {  -1,  -1 }, {   2,   4 } },   { {   2,   1 }, {   6,  10 } } },
            { { {  -1,  -1 }, {   2,  10 } },   { {   2,   1 }, {   4,   6 } } },
            { { {  -5,  -5 }, {  -2,   0 } },   { {  -2,  -3 }, {   2,   6 } } },
            { { {  -5,  -5 }, {  -2,   6 } },   { {  -2,  -3 }, {   0,   2 } } }
            
        };
        doTest( rectangle, "aligned" );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testContainedSystematic(){
        final int[][][][] rectangle = {
            { { {   1,   1 }, {   4,   4 } },   { {   2,   2 }, {   3,   3 } } },
            { { {  -9,  -9 }, {   9,   9 } },   { {  -5,  -3 }, {   7,   8 } } },
            //------------------------------------------------------------------
            { { {   0,   0 }, {   5,   5 } },   { {   2,   2 }, {   3,   3 } } },
            { { { -19, -17 }, {  11,  13 } },   { {   2,   5 }, {   3,   7 } } },
            { { { -19, -17 }, {  11,  13 } },   { {  -2,   5 }, {   3,   7 } } },
            { { { -19, -17 }, {  11,  13 } },   { {  -2,   5 }, {  -3,   7 } } },
            { { {  -5,  -7 }, {  13,  11 } },   { {   7,   5 }, {  13,  11 } } },
            { { {  -5,  -7 }, {  17,  19 } },   { {   7,   5 }, {  13,  19 } } },
            { { {  -5,  -7 }, {   3,   2 } },   { { -13, -11 }, {  17,  19 } } }
        };
        doTest( rectangle, "contained" );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testDisjointSystematic(){
        final int[][][][] rectangle = {
            { { {  -9,  -9 }, {   1,   1 } },   { {   2,   3 }, {   4,   5 } } },
            { { {  -9,  -9 }, {  -8,  -8 } },   { {  -5,  -5 }, {   3,   7 } } },
            //------------------------------------------------------------------
            { { {   2,   3 }, {   7,   5 } },   { {  11,  13 }, {  17,  19 } } },
            { { {  -3,   3 }, {   2,   5 } },   { {   6,  13 }, {  12,  19 } } },
            { { {  -3,  -2 }, {   2,  -1 } },   { {   6,   8 }, {   7,  12 } } },
            { { {  -3,  -5 }, {  -2,  -1 } },   { {   2,   1 }, {   3,   5 } } }
        };
        doTest( rectangle, "disjoint" );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testIntersectingSystematic(){
        final int[][][][] rectangle = {
            { { {   1,   2 }, {   7,   5 } },   { {   4,   3 }, {   6,   9 } } },
            { { {   0,   0 }, {   4,   5 } },   { {   3,   4 }, {   4,   7 } } },
            { { {  -7,  -5 }, {  -2,   2 } },   { {  -6,  -9 }, {  -4,  -3 } } },
            { { {  -7,  -5 }, {  -2,   2 } },   { {  -8,   1 }, {  -1,   4 } } },
            { { {  -7,  -5 }, {  -2,   2 } },   { {  -5,  -3 }, {   1,   3 } } },
            //------------------------------------------------------------------
            { { {   2,   3 }, {  11,  13 } },   { {   5,   7 }, { -13, -11 } } },
            { { {   2,   3 }, {  11,  13 } },   { {   5,   7 }, {  13, -11 } } },
            { { {   5,   5 }, {  19,   7 } },   { {   5, -11 }, {   7,  13 } } },
            { { { -17,   5 }, {  19,   7 } },   { {   5, -11 }, {   7,  13 } } },
            { { {  -7,  11 }, {  17,  19 } },   { {   7, -11 }, {  17,  19 } } }
        }; 
        doTest( rectangle, "intersecting" );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testSameSystematic(){
        final int[][][][] rectangle = {
            { { {  -1,  -1 }, {   1,   1 } },   { {  -1,  -1 }, {   1,   1 } } },
            { { {   0,   0 }, {   1,   1 } },   { {   0,   0 }, {   1,   1 } } },
            { { {   2,   2 }, {   5,   5 } },   { {   2,   2 }, {   5,   5 } } },
            { { {  -1,  -1 }, {   2,   2 } },   { {  -1,  -1 }, {   2,   2 } } },
            { { { -10,   2 }, {  13,   4 } },   { { -10,   2 }, {  13,   4 } } }
            //------------------------------------------------------------------
        };
        doTest( rectangle, "same" );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testTouchingSystematic(){
        final int[][][][] rectangle = {
            { { {  -1,  -1 }, {   0,   0 } },   { {   0,   0 }, {   1,   1 } } },
            { { {  -9,  -7 }, {  -4,  -5 } },   { {  -4,  -5 }, {   3,   3 } } },
            //------------------------------------------------------------------
            { { {  -7,  -5 }, {   2,   3 } },   { {   2,   3 }, {   5,   7 } } }
        };
        doTest( rectangle, "touching" );
    }//method()
    
    
    
    
    
    private void doTest(
        final int[][][][] rectangle,
        final String expectedRelation
    ){
        for( final int[][][] array3D : rectangle ){
            assert array3D.length==2 : "internal error";
            for( final int[][] array2D : array3D ){
                assert array2D.length==2 : "internal error";
                for( final int[] array1D : array2D ){
                    assert array1D.length==2 : "internal error";
                }//for
            }//for
        }//for
        //\=> "meta rectangle" array is ok ;-)
        
        
        for( int testNo=0; testNo<rectangle.length; testNo++ ){
            final int[][] rectangle1st = rectangle[testNo][0];
            final int[][] rectangle2nd = rectangle[testNo][1];
            doFullTestForTwoSingleRectangle( rectangle1st, rectangle2nd, expectedRelation );
        }//for
    }//method()
    //
    private void doFullTestForTwoSingleRectangle(
        int[][] r1,
        int[][] r2,
        final String expectedRelation
    ){
        final ContactAnalyzer ca = new ContactAnalyzer();
        String computedRelation;
        
        // exchange rectangles (r1<->r2) loop
        for( int ier=0; ier<2; ier++ ){
            //
            // rotate rectangles loop
            for( int irr=0; irr<4; irr++ ){
                //
                // mirror rectangles loop
                for( int imr=0; imr<4; imr++ ){
                    //
                    // exchange coordinates (X<->Y) loop
                    for( int iec=0; iec<2; iec++ ){
                        //
                        // exchange points/coordinates inside each rectangle
                        // exchange points/coordinates inside 1st rectangle loop
                        for( int ir1=0; ir1<4; ir1++ ){ 
                            // exchange points/coordinates inside 2nd rectangle loop
                            for( int ir2=0; ir2<4; ir2++ ){
                                singleTestCount++;
                                computedRelation = ca.computeRelation( r1, r2 );
                                assertEquals( expectedRelation, computedRelation );
                                successCount++;
                                //
                                // exchange points/coordinates inside 2nd rectangle   for this very run
                                int tmp;
                                switch( ir2 ){
                                    case 0:
                                        // exchange X-coordinates
                                        tmp = r2[0][0];  r2[0][0] = r2[1][0];  r2[1][0] = tmp;
                                      break;
                                    case 1:
                                        // exchange Y-coordinates
                                        tmp = r2[0][1];  r2[0][1] = r2[1][1];  r2[1][1] = tmp;
                                      break;
                                    case 2:
                                        // exchange X-coordinates
                                        tmp = r2[0][0];  r2[0][0] = r2[1][0];  r2[1][0] = tmp;
                                      break;
                                    case 3:
                                        // exchange Y-coordinates
                                        tmp = r2[0][1];  r2[0][1] = r2[1][1];  r2[1][1] = tmp;
                                      break;
                                    default:
                                        assert false : "internal error - this \"point\" shall NEVER be reached";
                                      break;
                                }//switch
                            }//for
                            //
                            // exchange points/coordinates inside 1st rectangle   for this very run
                            int tmp;
                            switch( ir1 ){
                                case 0:
                                    // exchange X-coordinates
                                    tmp = r1[0][0];  r1[0][0] = r1[1][0];  r1[1][0] = tmp;
                                  break;
                                case 1:
                                    // exchange Y-coordinates
                                    tmp = r1[0][1];  r1[0][1] = r1[1][1];  r1[1][1] = tmp;
                                  break;
                                case 2:
                                    // exchange X-coordinates
                                    tmp = r1[0][0];  r1[0][0] = r1[1][0];  r1[1][0] = tmp;
                                  break;
                                case 3:
                                    // exchange Y-coordinates
                                    tmp = r1[0][1];  r1[0][1] = r1[1][1];  r1[1][1] = tmp;
                                  break;
                                default:
                                    assert false : "internal error - this \"point\" shall NEVER be reached";
                                  break;
                            }//switch
                        }//for
                        //
                        // exchange coordinates: X <-> Y  for this very run
                        int tmp;
                        tmp = r1[0][0];  r1[0][0] = r1[0][1];  r1[0][1] = tmp;
                        tmp = r1[1][0];  r1[1][0] = r1[1][1];  r1[1][1] = tmp;
                        tmp = r2[0][0];  r2[0][0] = r2[0][1];  r2[0][1] = tmp;
                        tmp = r2[1][0];  r2[1][0] = r2[1][1];  r2[1][1] = tmp;
                    }//for
                    //
                    // mirror rectangles  for this very run
                    switch( imr ){
                        case 0:     // -X
                            r1[0][0] = -r1[0][0]; r1[1][0] = -r1[1][0];
                            r2[0][0] = -r2[0][0]; r2[1][0] = -r2[1][0];
                          break;
                        case 1:     // -Y
                            r1[0][1] = -r1[0][1]; r1[1][1] = -r1[1][1];
                            r2[0][1] = -r2[0][1]; r2[1][1] = -r2[1][1];
                          break;
                        case 2:     // -X
                            r1[0][0] = -r1[0][0]; r1[1][0] = -r1[1][0];
                            r2[0][0] = -r2[0][0]; r2[1][0] = -r2[1][0];
                          break;
                        case 3:    // -Y
                            r1[0][1] = -r1[0][1]; r1[1][1] = -r1[1][1];
                            r2[0][1] = -r2[0][1]; r2[1][1] = -r2[1][1];
                          break;
                        default:
                            assert false : "internal error - this \"point\" shall NEVER be reached";
                          break;
                    }//switch
                }//for
                //
                // rotate arrangement (X'=-Y & Y'=X) 
                int tmp;
                tmp = r1[0][1]; r1[0][1]=r1[0][0]; r1[0][0] = -tmp;
                tmp = r1[1][1]; r1[1][1]=r1[1][0]; r1[1][0] = -tmp;
                tmp = r2[0][1]; r2[0][1]=r2[0][0]; r2[0][0] = -tmp;
                tmp = r2[1][1]; r2[1][1]=r2[1][0]; r2[1][0] = -tmp;
            }//for
            //
            // exchange rectangles  for this very run
            final int[][] tmp = r1;
            r1 = r2;
            r2 = tmp;
        }//for
    }//method()
    
    
    
    @BeforeAll
    public static void runSetupBeforeAnyUnitTestStarts(){
        singleTestCount = 0;
        successCount = 0;
    }//method()
    
    @AfterAll
    public static void runTearDownAfterAllUnitTestsHaveFinished(){
        final int numberOfTests = 48128;
        assert singleTestCount<=numberOfTests : "internal error - has this test been manipulated?";
        System.out.printf( "\n\n" );
        System.out.printf(
            "%7.3f%% of tests successfully passed\n"
          + "-------------------------------------\n"
          + "%5d tests have been successfully executed and\n"
          + "%5d tests have been executed\n",
            100.0*successCount / numberOfTests,
            successCount,
            singleTestCount
        );
        System.out.printf( "\n" );
        System.out.printf( "THE END" );
        System.out.flush();
    }//method()
    
}//class
