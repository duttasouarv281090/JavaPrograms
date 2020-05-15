package com.practice.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class Sqrroot {

	public static void main(String aq[]) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int returnedSquareroot = squareroot(number);

		System.out.println("Square root of a number is " + returnedSquareroot);
	}

	private static int squareroot(int Sqrnumber) {

		int temp, res;
		res = Sqrnumber / 2;

		do {
			temp = res;
			res = (temp + (Sqrnumber / temp)) / 2;
		} while ((temp - res) != 0);
		return res;

	}

}
