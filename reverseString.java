package com.java.practice;

public class reverseString {

	public void reverseStringStringBuilder(String sourceString) {
		StringBuilder str = new StringBuilder(sourceString);
		String reverse = str.reverse().toString();
		System.out.println(reverse);
	}
	
	public void reverseStringStringBuffer(String sourceString) {
		StringBuffer str = new StringBuffer(sourceString);
		String reverse = str.reverse().toString();
		System.out.println(reverse);
	}
	
	public void reverseStringNoInBuiltFunction(String sourceString) {
		String reverse = "";
		for(int i = sourceString.length() - 1; i>=0;i--) {
			reverse = reverse + sourceString.charAt(i);
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString rev = new reverseString();
		rev.reverseStringStringBuilder("Jerwin");
		rev.reverseStringStringBuffer("Jerwin");
		rev.reverseStringNoInBuiltFunction("Jerwin");

	}

}
