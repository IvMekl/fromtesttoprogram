package com.itf.schulung.gitintro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringBuilderTest {

	    @Test
	    @DisplayName("Tests if StringBuilder is correctly instanciated")
	    public void stringBuilderConstructorTest() {
	    	StringBuilder myStringBuilder = new StringBuilder();
	    	assertNotNull(myStringBuilder);
	    	
	    	myStringBuilder = new StringBuilder(Arrays.asList("Blue", "Green","Red","4"));
	    	assertNotNull(myStringBuilder);
	    }
	    
	    @Test
	    @DisplayName("Tests if StringBuilder is creating Strings")
	    public void stringBuilderBuildingStrings() {
	    	StringBuilder myStringBuilder = new StringBuilder();
	    	assertEquals("", myStringBuilder.buildString());
	    	
	    	myStringBuilder = new StringBuilder(Arrays.asList("Blue", "Green","Red","4"));
	    	assertEquals("BlueGreenRed4", myStringBuilder.buildString());
	    }
	    
	    @Test
	    @DisplayName("Tests if StringBuilder is adding Strings")
	    public void stringBuilderAddingElements() {
	    	StringBuilder myStringBuilder = new StringBuilder();
	    	assertEquals("", myStringBuilder.buildString());
	    	
	    	myStringBuilder.addString("orange");
	    	assertEquals("orange", myStringBuilder.buildString());
	    	
	    	myStringBuilder.addAll(Arrays.asList("Blue", "Green","Red","4"));
	    	assertEquals("orangeBlueGreenRed4", myStringBuilder.buildString());    	
	    }
	    
	    
}
