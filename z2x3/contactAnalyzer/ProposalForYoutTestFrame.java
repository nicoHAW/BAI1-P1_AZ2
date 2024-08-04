package contactAnalyzer;


/**
 * TestFrame for (Rectangle) Contact Analyzer
 * 
 * @author   Michael Schaefers ;  P1@Hamburg-UAS.eu 
 * @version  2017/10/09
 */
public class ProposalForYoutTestFrame {
    
    public static void main( final String... unused ){
        
        // Idee (bis wir es besser koennen):
        // Im auskommentierten Bereich die TestCases "sammeln"
        // und den jeweils gewollten TestCase dann als/zur "Eingabe" kopieren
        /*
        ###
        ### TestCases
        ###
        
        aligned
        =======
        ...
        
        
        contained
        =========
        ...
        
        
        disjoint
        ========
        ...
        
        
        intersecting
        ============
        ...
        
        
        same
        ====
        final int[][] inputFor1stRectangle = {
            { 0, 0 }, { 1, 1 }
        };
        final int[][] inputFor2ndRectangle = {
            { 0, 0 }, { 1, 1 }
        };
        ...
        
        
        touching
        ========
        ...
        
        */
        
        
        // "Eingabe"
        final int[][] inputFor1stRectangle = {
            { 0, 0 }, { 1, 1 }
        };
        final int[][] inputFor2ndRectangle = {
            { 0, 0 }, { 1, 1 }
        };
        
        
        // request actual computation
        final int[][] rectangle1st = inputFor1stRectangle;
        final int[][] rectangle2nd = inputFor2ndRectangle;
        final ContactAnalyzer ca = new ContactAnalyzer();
        final String result = ca.computeRelation( rectangle1st, rectangle2nd );
        System.out.printf(
            "[(%d,%d),(%d,%d)] <-?-> [(%d,%d),(%d,%d)]   =>   %s\n",
            rectangle1st[0][0],
            rectangle1st[0][1],
            rectangle1st[1][0],
            rectangle1st[1][1],
            rectangle2nd[0][0],
            rectangle2nd[0][1],
            rectangle2nd[1][0],
            rectangle2nd[1][1],
            result
        );
    }//method()
    
}//class
