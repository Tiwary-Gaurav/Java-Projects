package com.stringRelatedProjects;

public class ReverseString {

	public static void main(String[] args) {
		String givenString = "Nitin";
		char[] ch = givenString.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = temp;
		}
		System.out.println(ch);

	}

}
