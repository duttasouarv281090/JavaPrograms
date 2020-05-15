package com.practice.java;

import java.util.Scanner;

public class FirstProg {

	public static void main(String aq[]) {

		// Check the Inserted year is Leap Year or Not
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		year = sc.nextInt();
		boolean LYear = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					LYear = true;
				} else
					LYear = false;
			}
			LYear = true;
		}

		else {
			LYear = false;
		}

		if (LYear == true) {
			System.out.println("Year Entered is a Leap Year" + year);
		} else {
			System.out.println("Year Entered is not a Leap Year" + year);
		}
	}
}

//test=test+num;
//test+=num;