package com.itf.schulung.gitintro;

import java.util.ArrayList;
import java.util.List;

public class StringBuilder {
	List<String> stringList;

	public StringBuilder() {
		this.stringList = new ArrayList<String>();
	}

	public StringBuilder(List<String> stringList) {
		this.stringList = stringList;
	}

	public String buildString() {
		String result = "";
		for (String x : stringList) {
			result += x;
		}
		return result;
	}

	public void addString(String string) {
		this.stringList.add(string);
	}

	public void addAll(List<String> stringList) {
		this.stringList.addAll(stringList);
	}

}
