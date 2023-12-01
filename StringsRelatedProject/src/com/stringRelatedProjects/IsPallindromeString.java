package com.stringRelatedProjects;

import java.util.Scanner;

public class IsPallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String givenString = sc.nextLine();
		char[] ch = givenString.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = temp;
		}
		System.out.println(ch);
		String reversedString = "";
		for (char c : ch) {
			reversedString = reversedString + c;
		}
		if (givenString.equals(reversedString)) {
			System.out.println("String is pallindrome");
		} else
			System.out.println("String is not palindrome");
		sc.close();

	}

}
