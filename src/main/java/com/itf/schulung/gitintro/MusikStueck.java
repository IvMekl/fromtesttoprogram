package com.itf.schulung.gitintro;

public class MusikStueck {
	private String titel;
	private int dauer;
	private Genre genre;
	public MusikStueck(String titel, int dauer, Genre genre) {
		this.titel = titel;
		this.dauer = dauer;
		this.genre = genre;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getDauer() {
		return dauer;
	}

	public void setDauer(int dauer) {
		this.dauer = dauer;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		String sekDauer;
		if(dauer%60 < 10) {
			sekDauer = "0"+(dauer%60);
		} else {
			sekDauer = ""+(dauer%60);
		}
		
		return "Titel: " +titel + "\nDauer: " 
				+ dauer/60 +":"+ sekDauer+ "\nGenre: " 
				+ genre.getName();
	}
	
	
	
}
