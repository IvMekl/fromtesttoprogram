package com.itf.schulung.gitintro;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomName {
	public static String getName() {
		List<String> silben = new ArrayList<String>(); // diese Liste wird mit [ba, be, bi, bo, bu, ca, ce,...] befuellt

		for (char c = 'a'; c <= 'z'; c++) {
			if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c!= 'q' && c!='z' && c!= 'x') {
				silben.add(c + "a");
				silben.add(c + "e");
				silben.add(c + "i");
				silben.add(c + "o");
				silben.add(c + "u");
			} else if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				silben.add(c+"");
			}
		}
		
		String vorname = (silben.get(ThreadLocalRandom.current().nextInt(0, silben.size()))).substring(0, 1).toUpperCase()
				+ (silben.get(ThreadLocalRandom.current().nextInt(0, silben.size()))).substring(1);
		
		
		int random = ThreadLocalRandom.current().nextInt(1, 4);
		for(int i = 0; i<random; i++) {
			vorname += silben.get(ThreadLocalRandom.current().nextInt(0, silben.size()));
		}
		
		
		
		return vorname;
	}
}
