package com.gaurav;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		if (n<0) {
			System.out.println("Number cannot be less than zero(0)");
		} else {
			for(Long i = fact; i<=n; i++) {
				fact=fact*i;
				System.err.print(fact+" ");
			}

		}

	}

}
