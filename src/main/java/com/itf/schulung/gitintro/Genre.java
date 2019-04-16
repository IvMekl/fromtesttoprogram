package com.itf.schulung.gitintro;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Genre {
	ROCK("Rock"), POP("Pop"), TECHNO("Techno"), CLASSICAL("Classical"), HIPHOP("Hip Hop");

	private String name;

	private Genre(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private static final List<Genre> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Genre getRandomGenre() {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

}
