package com.itf.schulung.gitintro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MusicDBTest {
	@Test
	@DisplayName("Checking for MusicDB-construction")
	public void testEmptyMusikStueckDB() {
		MusikStueckDB m = new MusikStueckDB();
		assertNotNull(m, "MusikDB expected");
	}
	
	@Test
	@DisplayName("Checking getMusikStueck")
	public void testMusikStueck() {
		MusikStueck m = MusikStueckFactory.getMusikstueck();
		assertNotNull(m, "MusikStueck expected");
	}
	
	@Test
	@DisplayName("Checking getMusikStueck")
	public void test() {
		MusikStueck m = MusikStueckFactory.getMusikstueck();
		assertNotNull(m, "MusikStueck expected");
	}
	
	@Test
	@DisplayName("Checking getTitel")
	public void testGetTitel() {
		MusikStueck m = MusikStueckFactory.getMusikstueck();
		m.setTitel("Test");
		assertEquals("Test", m.getTitel(), "<Test> expected, got "+m.getTitel());
	}
	@Test
	@DisplayName("Checking setTitel")
	public void testSetTitel() {
		MusikStueck m = MusikStueckFactory.getMusikstueck();
		m.setTitel("Test");
		assertEquals("Test", m.getTitel(), "<Test> expected, got " +m.getTitel());
	}
	@Test
	@DisplayName("Checking getDauer")
	public void testGetDauer() {
		MusikStueck m = MusikStueckFactory.getMusikstueck();
		m.setDauer(200);
		assertEquals(200, m.getDauer(), "<200> expected, got " +m.getDauer());
	}
	@Test
	@DisplayName("Checking setDauer")
	public void testSetDauer() {
		MusikStueck m = MusikStueckFactory.getMusikstueck();
		m.setDauer(200);
		assertEquals(200, m.getDauer(), "<200> expected, got " +m.getDauer());
	}
	
	@Test
	@DisplayName("Checking setGenre")
	public void testSetGenre() {
		MusikStueck m = MusikStueckFactory.getMusikstueck();
		m.setGenre(Genre.POP);
		assertEquals(Genre.POP, m.getGenre(), "<POP> expected, got " +m.getGenre());
	}
	@Test
	@DisplayName("Checking getGenre")
	public void testGetGenre() {
		MusikStueck m = MusikStueckFactory.getMusikstueck();
		m.setGenre(Genre.POP);
		assertEquals(Genre.POP, m.getGenre(), "<POP> expected, got " +m.getGenre());
	}
	@Test
	@DisplayName("Checking toString")
	public void testToString() {
		MusikStueck m = MusikStueckFactory.getMusikstueck();
		m.setTitel("Test");
		m.setGenre(Genre.POP);
		m.setDauer(311);
		assertTrue(m.toString().contains("Test"));
		assertTrue(m.toString().contains("Pop"));
		assertTrue(m.toString().contains("5:11"));
		m.setDauer(309);
		assertTrue(m.toString().contains("5:09"));
	}
}
