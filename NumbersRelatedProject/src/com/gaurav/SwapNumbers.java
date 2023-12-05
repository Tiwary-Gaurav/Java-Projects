package com.gaurav;

public class SwapNumbers {
	public static void swapWithThirdVariable(int x, int y) {
		System.out.println("Before Swapping: "+x + "," + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping: "+x + "," + y);
	}

	public static void swapWithoutThirdVariable(int x, int y) {
		System.out.println("Before Swapping: "+x + "," + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping: "+x + "," + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbers.swapWithoutThirdVariable(10, 20);
		swapWithThirdVariable(10, 20);

	}

}
