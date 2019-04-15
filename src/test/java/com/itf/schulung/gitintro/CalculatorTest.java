package com.itf.schulung.gitintro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	    @Test
	    @DisplayName("Tests if multiplication return zero")
	    public void multiplicationOfZeroIntegersShouldReturnZero() {
	    	Calculator tester = new Calculator(); // MyClass is tested

	        // assert statements
	        assertEquals(0.0, tester.multiply(10, 0), "10 x 0 must be 0");
	        assertEquals(0.0, tester.multiply(0, 10), "0 x 10 must be 0");
	        assertEquals(0.0, tester.multiply(0, 0), "0 x 0 must be 0");
	    }
}
