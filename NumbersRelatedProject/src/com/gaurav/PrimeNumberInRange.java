package com.gaurav;

public class PrimeNumberInRange {
	public static boolean isPrime(int num) {
		if(num <= 1)
			return false;
		for(int i = 2; i<=Math.sqrt(num); i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void printPrimeNumber(int start, int end) {
		for(int i = start; i<=end; i++) {
			if(isPrime(i))
				System.out.print(i+",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberInRange.printPrimeNumber(1, 10000);
	}
}
