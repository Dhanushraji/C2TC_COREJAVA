package com.tns.ifet.day5.array;

public class Driver {
	public static void main(String args[]) {
		int n = 10;
		int a[]; 
		a = new int[n]; 
		ArrayOperations.printArray(a);
		for (int i = 0; i < a.length; i++)
			a[i] = 5 * i;
		ArrayOperations.printArray(a);
		int b[] = { 10, 20, 30, 40, 50 }; 
		ArrayOperations.printArray(b);
		System.out.println("sum of array elements is : " + ArrayOperations.getSum(b));
		System.out.println("sum of array elements is : " + ArrayOperations.getSum(10, 20));
		b[2] = 999;
		ArrayOperations.printArray(b);
		System.out.println("Odd numbers : " + ArrayOperations.getOddCount(b) + "\tEven numbers : "+ ArrayOperations.getEvenCount(b));
		System.out.println();
		System.out.println("---------------------------------------");
		int c[];
	}
}