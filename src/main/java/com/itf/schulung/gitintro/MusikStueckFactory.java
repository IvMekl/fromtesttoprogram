package com.itf.schulung.gitintro;

public class MusikStueckFactory {
	
	public static MusikStueck getMusikstueck() {
		String name = RandomName.getName();
		int dauer = RandomDauer.getDauer();
		Genre genre = Genre.getRandomGenre();
		return new MusikStueck(name, dauer, genre);
	}
}
