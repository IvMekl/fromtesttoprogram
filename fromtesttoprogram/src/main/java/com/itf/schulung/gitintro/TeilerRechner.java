package com.itf.schulung.gitintro;

import java.util.ArrayList;
import java.util.List;

public class TeilerRechner {
	
	public static List<Integer> getAlleTeiler(int zahl) {
		List<Integer> alle = new ArrayList<Integer>();
		for(int i=1; i<=zahl; i++) {
			if(zahl%i==0) {
				alle.add(i);
			}
		}
		return alle;
	}
	
	public static int groessterGemeinsamer(List<Integer> first, List<Integer> second) {
		int result = 1;
		for(int x : first) {
			if(second.contains(x)) {
				result = x;
			}
		}
		return result;
	}
}
