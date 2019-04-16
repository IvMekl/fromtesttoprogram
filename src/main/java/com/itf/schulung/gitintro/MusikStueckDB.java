package com.itf.schulung.gitintro;

import java.util.ArrayList;
import java.util.List;

public class MusikStueckDB {
	List<MusikStueck> musikListe;

	public MusikStueckDB(int number) {
		musikListe = new ArrayList<MusikStueck>();
		for(int i = 0; i<number; i++) {
			musikListe.add(MusikStueckFactory.getMusikstueck());
		}
	}
	
	public void printMe() {
		int i = 1;
		for (MusikStueck x : this.musikListe) {
			System.out.println("#" + i);  
			i++;
			System.out.println(x); 			// Sysout Name:XX, Alter:XX, MatrikelNr:XX
			System.out.println("---------------------"); 	// Sysout --------------------
		}
	}
	
	
}
