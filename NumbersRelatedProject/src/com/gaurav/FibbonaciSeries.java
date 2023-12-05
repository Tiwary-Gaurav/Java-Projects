package com.gaurav;

import java.util.Scanner;

public class FibbonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 1, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number upto series required: ");
		int n = scanner.nextInt();
		scanner.close();
		for(int i = 1; i<=n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(b+", ");
		}

	}

}
