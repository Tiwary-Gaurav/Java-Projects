package com.gaurav;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long randomNumber =  Math.round(Math.random()*100);
//		System.out.println(randomNumber);
		
		System.out.println("Are you ready to a play game? yes or no");
		String str = sc.nextLine().toLowerCase();
		if (str.equals("yes") || str.equals("y")) {
			System.out.println("Guess the number between 1 to 100");
			System.out.println("You got 10 changes");
		} else {
			System.out.println("Still you will play this game...");
			System.out.println("Guess the number between 1 to 100");
			System.out.println("You got 10 changes");
		}
		int count = 10;
		do {
			System.out.println("Enter a number");
			int num = sc.nextInt();
			if (num > randomNumber) {
				System.out.println(
						"Wrong Number...\n You entered greater number.\n Enter number smaller than what you entered");
			} else if (num < randomNumber) {
				System.out.println(
						"Wrong Number...\n You entered smaller number.\n Enter number greater than what you entered");
			} else {
				System.out.println("Yeah!!! You Win");
				break;
			}
			count--;
			System.out.println("Chances left : " + count);

		} while (count != 1);
		sc.close();

	}

}
