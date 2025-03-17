package com.java.practice;

import java.util.Arrays;

public class arrayWave {

	public void changetoWaveForm(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j<arr.length; j++)
			if (arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		for (int i = 0; i < arr.length - 1; i+=2) {
			int j = i + 1;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String args[]) {
		int sampleArray[] = {20, 10, 8, 6, 4, 2};
		arrayWave wave = new arrayWave();
		wave.changetoWaveForm(sampleArray);
	}

}
