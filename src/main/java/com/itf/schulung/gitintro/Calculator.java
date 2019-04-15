package com.itf.schulung.gitintro;

public class Calculator {

	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static double substract(double a, double b) {
		return a - b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static boolean isUneven(int number) {
		return !isEven(number);
	}
	
}
