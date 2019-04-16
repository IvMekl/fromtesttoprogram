package com.itf.schulung.gitintro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	    @Test
	    @DisplayName("Tests if multiplication return zero")
	    public void multiplicationOfZeroIntegersShouldReturnZero() {

	        // assert statements
	    	assertEquals(0.0, Calculator.multiply(0, 10), "0 x 10 must be 0");
	        assertEquals(0.0, Calculator.multiply(0, 0), "0 x 0 must be 0");
	        assertEquals(5000, Calculator.add(3000, 2000), "3000 + 2000 must be 5000");
	        assertEquals(1000, Calculator.substract(3000, 2000), "3000 - 2000 must be 1000");
	        assertEquals(1, Calculator.divide(3000, 3000), "3000 / 3000 must be 1");
	        assertTrue(Calculator.isEven(100), "100 must be true");
	        assertTrue(Calculator.isUneven(101), "101 must be true");
	        assertFalse(Calculator.isUneven(100), "101 must be true");
	        assertEquals(8, Calculator.pow(2, 3), "must be 8");
	        assertEquals("0.0", Calculator.getString(0.0));
	        assertNotNull(new Calculator());
	        assertNotNull(new App());
	    }
}
