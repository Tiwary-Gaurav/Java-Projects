package com.gaurav;

import java.util.Scanner;

public class PrimeNumber {

	public static int isPrimeNumber(int number) {
		int flag = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = 1;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("Given number is not prime.");
		}else {
			int number = PrimeNumber.isPrimeNumber(num);
			if(number == 1) {
				System.out.println("Given number is not prime.");				
			}else {
				System.out.println("Given number is prime.");

			}
			
		}
		sc.close();
	}

}
