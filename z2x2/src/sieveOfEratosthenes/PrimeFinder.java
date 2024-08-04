// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package sieveOfEratosthenes;


/**
 * prime finder using sieve of Eratosthenes algorithm<br />
 * Eine Erklärung des "Sieb des Eratosthenes" findest sich z.B. auf Wikipedia
 * -> https://de.wikipedia.org/wiki/Sieb_des_Eratosthenes
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class PrimeFinder {

    /**
     * find primes using sieve of Eratosthenes
     * 
     * @param sieveEnd  the last number of the sieve resp. last number to be checked if prime
     */
    public void printPrimes( int sieveEnd ){
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        //###
        //###
        //###
        //###           HIER kommt Ihr Code hin
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

        int numberOfPrimes = 100;
        int [] primes;
        primes = new int[numberOfPrimes];
        int divider;
        int result;
        int modulo;

        for (int i; i < numberOfPrimes; i++) {
            primes[i]=i;
            result=primes[i]%modulo;

            if (result == 0) {
                primes[i]=0;
            } else {
                modulo++;
            } //ifelse

        } //for



        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        System.out.flush();
    }//method()

}//class
