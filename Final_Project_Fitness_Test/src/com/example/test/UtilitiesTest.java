package com.example.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.example.utils.Utilities;


	// A JUnit Test class to test 
	// Utilities Class 
	class UtilitiesTest { 
	    
	    // test 1 for checking the static isPrime method 
	    // from Utilities class 
	    // Test annotations are being used to create JUnit tests 
	    @Test
	    void testIsPrime1(){ 
	        assertTrue(Utilities.isPrime(13)); 
	    } 
	    
	    // test 2 to check the isprime method 
	    @Test
	    void testIsPrime2(){ 
	        assertFalse(Utilities.isPrime(18)); 
	    } 
	    
	    // test 1 to check the static isEven method 
	    // from Utilities class 
	    @Test
	    void testIsEven1(){ 
	        assertFalse(Utilities.isEven(19)); 
	    } 
	    
	    // test 2 to check the isEven method 
	    @Test
	    void testIsEven2(){ 
	        assertTrue(Utilities.isEven(80)); 
	    } 
	}
