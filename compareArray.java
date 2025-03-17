package com.java.practice;

import java.util.Arrays;

public class compareArray {

	public void arrayCompare(int arr1[], int arr2[]) {
		boolean flag = true;
		if (arr1.length == arr2.length) {

			for (int i = 0; i < arr1.length; i++) {
				if (!(arr1[i] == arr2[i])) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println("Arrays are equal");
			} else {
				System.out.println("Arrays are not equal");
			}

		} else {
			System.out.println("Array length are not equal");
		}

	}
	
	public void compareArrayUsingLib(int arr1[], int arr2[]) {
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareArray cmp = new compareArray();

		int inputArray1[] = { 1, 2, 3 };
		int inputArray2[] = { 1, 3, 3 };
		cmp.arrayCompare(inputArray1, inputArray2);
		cmp.compareArrayUsingLib(inputArray1, inputArray2);

	}

}
