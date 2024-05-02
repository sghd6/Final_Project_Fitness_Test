package program.main;

public class Main {
	// function to check whether a number is prime 
    public static boolean isPrime(long n) 
    { 
        // optimised loop for sqrt(n) 
        for (long val = 2; val * val <= n; val++) { 
             // checking the divisibility of n with val 
            if (n % val == 0) { 
                return false; 
            } 
        } 
        return n > 1; 
    } 
    // function to check the given number is even 
    public static boolean isEven(long n) 
    { 
        return !((n & 1) == 1); 
    } 

}
