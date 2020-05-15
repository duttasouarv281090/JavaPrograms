package com.practice.java;

import java.util.HashMap;
import java.util.Set;

public class UniqueNumber {

	public static void main(String aq[]) {
		SecondProgram obj = new SecondProgram();
		System.out.println("..............Total number of repeated characters..............");
		System.out.println(".................");
		getValue();

	}

	public static void getValue()

	{

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int a[] = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		for (int value : a) {
			if (!map.containsKey(value)) {
				map.put(value, 1);
			} else {

			}
		}

		Set<Integer> keys = map.keySet();

		for (int ch1 : keys) {

			System.out.println("Char " + ch1 + " is unique");

		}
	}
}

