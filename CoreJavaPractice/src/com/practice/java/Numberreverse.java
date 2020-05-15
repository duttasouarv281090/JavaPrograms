package com.practice.java;

public class Numberreverse {
	public static void main(String aq[]) {

		System.out.println("Reverese of the number is" + reverseNumber());
	}

	public static int reverseNumber() {
		int number = 7258;
		int digit = 0;
		int rem;
		while (number > 0) {
			rem = number % 10;
			digit = digit * 10 + rem;
			number = number / 10;

		}
		return digit;
	}

}
