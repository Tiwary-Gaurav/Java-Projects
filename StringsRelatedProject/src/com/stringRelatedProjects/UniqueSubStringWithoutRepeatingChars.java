package com.stringRelatedProjects;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSubStringWithoutRepeatingChars {

	public String getUniqueSubString(String str) {
		String output = "";
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			int j = i;
			for (; j < str.length(); j++) {
				if (set.contains(str.charAt(j))) {
					break;
				} else {
					set.add(str.charAt(j));
				}
			}
			if (output.length() < j - i + 1) {
				output = str.substring(i, j);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		UniqueSubStringWithoutRepeatingChars chr = new UniqueSubStringWithoutRepeatingChars();
		String uniqueSubString = chr.getUniqueSubString(str);
		System.out.println(uniqueSubString); // to print the unique sub string
		System.out.println(uniqueSubString.length()); // to print length of unique sub string
		sc.close();
	}

}
