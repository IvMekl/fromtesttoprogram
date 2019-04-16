package com.itf.schulung.gitintro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HausratsversicherungTest {
	@Test
    @DisplayName("Test for new Hausratsversicherung")
    public void hausratNew() {
    	assertNotNull(new Hausratsversicherung());
    }
	@Test
    @DisplayName("Test for 0 people")
    public void hausratZeroPeople() {
    	assertEquals(0.0, Hausratsversicherung.getPraemie(0, 50), "Expected 0.0");
    }
	@Test
    @DisplayName("Test for 1 person")
    public void hausratOnePerson() {
    	assertEquals(35.0, Hausratsversicherung.getPraemie(1, 50), "Expected 35.0");
    }
	@Test
    @DisplayName("Test for 2 people")
    public void hausratTwoPeople() {
    	assertEquals(35.0, Hausratsversicherung.getPraemie(2, 50), "Expected 35.0");
    }
	@Test
    @DisplayName("Test for 3 people")
    public void hausratThreePeople() {
    	assertEquals(65.0, Hausratsversicherung.getPraemie(3, 50), "Expected 65.0");
    }
	@Test
    @DisplayName("Test for 4 people")
    public void hausratFourPeople() {
    	assertEquals(90.0, Hausratsversicherung.getPraemie(4, 50), "Expected 90.0");
    }
	@Test
    @DisplayName("Test for 5 people")
    public void hausratFivePeople() {
    	assertEquals(125.0, Hausratsversicherung.getPraemie(5, 50), "Expected 125.0");
    }
	@Test
    @DisplayName("Negative people input")
    public void hausratNegativePeopleInput() {
    	assertEquals(-1, Hausratsversicherung.getPraemie(-1, 50), "Expected -1");
    }
	@Test
    @DisplayName("Negative size input")
    public void hausratNegativeSizeInput() {
    	assertEquals(-1, Hausratsversicherung.getPraemie(3, -12), "Expected -1");
    }
}
