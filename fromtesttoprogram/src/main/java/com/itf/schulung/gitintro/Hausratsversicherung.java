package com.itf.schulung.gitintro;

public class Hausratsversicherung {
	public static double getPraemie(int personen, double quadratmeter) {
		if(quadratmeter<0) {
			return -1;
		}
		if(personen==0) {
			return 0;
		} else if(personen == 1 || personen == 2) {
			return 10+(quadratmeter/2);
		} else if(personen == 3) {
			return 15+(quadratmeter);
		} else if(personen == 4) {
			return 15+(1.5*quadratmeter);
		} else if(personen>4) {
			return 25+(2*quadratmeter);
		} else {
			return -1;
		}
		
	}

}
