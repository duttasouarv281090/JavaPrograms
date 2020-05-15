package com.practice.java;


import java.util.HashMap;
import java.util.Set;

public class SecondProgram {

	public static void main(String aq[]) {
		SecondProgram obj = new SecondProgram();
		System.out.println("..............Total number of repeated characters..............");
		System.out.println(".................");
		obj.getValue("Teste");
	}

	public void getValue(String name)

	{

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] returnCharacter = name.toCharArray();

		for (Character ch : returnCharacter) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
			{
				map.put(ch, 1);
			}
		}

		Set<Character> keys = map.keySet();

		for (Character ch1 : keys) {
			if(map.get(ch1)>1)
			{
			System.out.println("Char " + ch1 + " is repeated " + map.get(ch1));
			
			}
		}
	}
}
