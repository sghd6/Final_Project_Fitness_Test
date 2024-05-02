package program.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import program.main.Main;

class MainTest {

	// A JUnit Test class to test 
	// Utilities Class 
	    
	    // test 1 for checking the static isPrime method 
	    // from Utilities class 
	    // Test annotations are being used to create JUnit tests 
	    @Test
	    void testIsPrime1(){ 
	        assertTrue(Main.isPrime(13)); 
	    } 
	    
	    // test 2 to check the isprime method 
	    @Test
	    void testIsPrime2(){ 
	        assertFalse(Main.isPrime(18)); 
	    } 
	    
	    // test 1 to check the static isEven method 
	    // from Utilities class 
	    @Test
	    void testIsEven1(){ 
	        assertFalse(Main.isEven(19)); 
	    } 
	    
	    // test 2 to check the isEven method 
	    @Test
	    void testIsEven2(){ 
	        assertTrue(Main.isEven(80)); 
	    } 
	} 
