package com.java.practice;

public class binarySearch {

	public int bSearch(int array[],int value) {
		int start = 0;
		int length= array.length-1;
		while(start<=length) {
			int mid = start + (length-start)/2;
			System.out.println(mid);
			if(array[mid]==value) {
				return mid;
			}else if(value < array[mid]) {
				length = mid-1;
			}else {
				start = mid+1;
			}
			
		}
		return -1;
		
		
	}
	
	public static void main(String args[]) {
		binarySearch binSearch = new binarySearch();
		int arr[] = {1,2,3,4,5,6,7};
		int index;
		int value = 5;
		index = binSearch.bSearch(arr, value);
		System.out.println("The value " + value + " is at index " + index );
		
	}
	
}
