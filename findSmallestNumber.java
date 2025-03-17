package com.java.practice;

public class findSmallestNumber {

	public void findFirstandSecondSmallestNumber(int arr[]) {
		int first, second, length = arr.length;
		first = second = Integer.MAX_VALUE;
		for(int i=0;i<length;i++) {
			if(arr[i]<first) {
				second = first;
				first = arr[i];
			}else if(arr[i]<second && arr[i]!=first) {
				second = arr[i];
			}
		}
		
		System.out.println("The smallest number is: " + first);
		System.out.println("The second smallest number is: " + second);
	}
	
	public void findFirstandSecondLargestNumber(int arr[]) {
		int first, second, length = arr.length;
		first = second = Integer.MIN_VALUE;
		for(int i=0;i<length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}else if(arr[i]>second && arr[i]!=first) {
				second = arr[i];
			}
		}
		
		System.out.println("The largest number is: " + first);
		System.out.println("The second largest number is: " + second);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSmallestNumber find = new findSmallestNumber();
		int inputArray[] = {10,1,5,5,6,8,7,8};
		find.findFirstandSecondSmallestNumber(inputArray);
		find.findFirstandSecondLargestNumber(inputArray);
		
		

	}

}
