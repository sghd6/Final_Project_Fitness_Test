package program.main;

//Imports
import program.main.DailyTips.DailyTips;


import program.main.ActivityTracker.*;

public class Main {
	
	public static void main(String[] args) {
		
		//Call for and display one of the daily tips
		/// Needs to be placed at the top of main method show it is always displaying
		DailyTips dailyTips = new DailyTips();
		System.out.println();
		dailyTips.displayDailyTip();
		System.out.println();
		
		
		//Water Intake
		
		//Add an Activity
		
		// Calculate Caloriess Burned
		
		//Weekly Summary
		
	}
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
