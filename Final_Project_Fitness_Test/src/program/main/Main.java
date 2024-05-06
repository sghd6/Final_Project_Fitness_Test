package program.main;

//Imports
import program.main.DailyTips.DailyTips;
import program.main.UserClasses.*;

public class Main {
	
	public static void main(String[] args) {
		//Call for and display one of the daily tips
		DailyTips dailyTips = new DailyTips();
		dailyTips.displayDailyTip();
		
		System.out.println("Total Water Intake: " + Beginner.getWaterIntake());
		System.out.println("Total Water Intake: " + Athlete.getWaterIntake());
		System.out.println("Total Water Intake: " + Intermediate.getWaterIntake());
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
