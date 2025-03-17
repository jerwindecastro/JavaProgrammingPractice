package com.java.practice;

public class findElementinRotatedandSortedArray {

	public int findElement(int arr[], int value) {
		int low = 0;
		int high = arr.length - 1;
        int mid;
		while (low <= high) {
			mid = low + ((high - low) / 2);
			if (arr[mid] == value) {
				return mid;
			}
			if(arr[mid]<=arr[high]) {
				//right part is sorted
				if(value > arr[mid]  && value <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else {
				if(arr[low] <= value && value < arr[mid] ) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;

	}

	public static void main(String args[]) {

		findElementinRotatedandSortedArray find = new findElementinRotatedandSortedArray();
		int inputArray[] = {16,19,21,25,3,5,8,10};
		int index;
		index = find.findElement(inputArray, 3);
		System.out.println("Number is present at index " + index);
	}

}
