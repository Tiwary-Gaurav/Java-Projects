package com.stringRelatedProjects;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacters {
	//Count Number of Characters in a String
	private static void countCharacters(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println("Given String is : "+s+"\n"+map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countCharacters("Gaurav");
		countCharacters("I will be great always");

	}

}
