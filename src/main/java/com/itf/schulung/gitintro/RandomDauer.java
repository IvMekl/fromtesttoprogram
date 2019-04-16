package com.itf.schulung.gitintro;

import java.util.concurrent.ThreadLocalRandom;

public class RandomDauer {
	public static int getDauer() {
		return ThreadLocalRandom.current().nextInt(120, 600 + 1);	
	}
}
