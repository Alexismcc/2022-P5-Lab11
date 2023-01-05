// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for(int k = 2; k < primes.length; k++) {
            primes[k] = true;
        }

        for(int k = 2 * 2; k < primes.length; k+=2) {
            primes[k] = false;
        }

        for(int k = 2 * 3; k < primes.length; k+=3) {
            primes[k] = false;
        }

        for(int k = 2 * 5; k < primes.length; k+=5) {
            primes[k] = false;
        }
        for(int k = 2 * 7; k < primes.length; k+=7) {
            primes[k] = false;
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();

        for(int k = 2; k < primes.length; k++){
            if(primes[k] == true){

                System.out.print(k + " ");
            }
        }

    }

}



