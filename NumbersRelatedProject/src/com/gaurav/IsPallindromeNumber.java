package com.gaurav;

public class IsPallindromeNumber {
	public static boolean isPallindrome(int num) {
		int digit = 0;
		int temp = num;
		int reverse = 0;
		while(temp !=0) {
			digit = temp%10;
			reverse = reverse*10+digit;
			temp /= 10;
		}
		if(reverse == num) {
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = IsPallindromeNumber.isPallindrome(121);
		if(bool)
			System.out.println("Given number is Pallindrome");
		else
			System.out.println("Given number is not Pallindrome");
	}

}
