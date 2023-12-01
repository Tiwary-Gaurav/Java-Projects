package patterns;

import java.util.Scanner;

public class PascalTringle {

	public static void main(String[] args) {
		System.out.println("Enter number of lines");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int spaces = num;
		int number = 1;
		for (int i = 0; i < num; i++) {
			for (int s = 0; s < spaces; s++) {
				System.out.print("-");
			}
			number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number = number * (i-j)/(j+1);
			}
			spaces--;
			System.out.println();
		}
		sc.close();
	}

}
