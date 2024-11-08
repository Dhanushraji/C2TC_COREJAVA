package com.tns.ifet.day5.array;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		int intArr[] = { 10, 20, 15, 22, 35, 18 , 14 };
		System.out.println("Array is : "+Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println("-----------------After Sorting---------------");
		System.out.println("Array is : "+Arrays.toString(intArr));
		int intKey = 22;
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));
		System.out.println("First Array : " + Arrays.toString(intArr));
		int intArr1[] = { 10, 15, 22 };
		System.out.println("Second Array : " + Arrays.toString(intArr1));
		if (Arrays.equals(intArr, intArr1))
			System.out.println("Both arrays are equal");
		else
			System.out.println("Arrays are not equal"); 
		System.out.println("\nNew Arrays by copyOf:\n");
		int intArr2[]=Arrays.copyOf(intArr, 10);
		System.out.println("Integer Array: " + Arrays.toString(intArr2));
		System.out.println("\nNew Arrays by copyOfRange:");
		int intArr3[]=Arrays.copyOfRange(intArr, 1, 3);
		System.out.println("Integer Array: " + Arrays.toString(intArr3));
		Arrays.fill(intArr, intKey);
		System.out.println("Integer Array on filling 22: " + Arrays.toString(intArr));
	}
}