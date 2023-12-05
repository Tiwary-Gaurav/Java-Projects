package com.stringRelatedProjects;

public class StringToInteger {
	
	public static int parseInteger(String str) {
		int sum = 0;
		int num = Integer.parseInt(str);
		int temp = num;
		while(temp!=0) {
			int digit = temp%10;
			sum = sum+digit;
			temp = temp/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(parseInteger("12345"));
		

	}

}
