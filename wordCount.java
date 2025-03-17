package com.java.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wordCount {
	FileReader file;
	BufferedReader buffRead;
	public void totalWordCount(String filepath) {
		try {
			file = new FileReader(filepath);
			buffRead = new BufferedReader(file);
			
			String wordPerLine = buffRead.readLine();
			String a[];
			int wordCount = 0;
			while(wordPerLine != null) {
				a = wordPerLine.split("\\s+");
				wordCount += a.length;
				wordPerLine = buffRead.readLine();
			}
			
			System.out.println("Total Number of words: " + wordCount);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error message: " + e.getMessage());
		} finally {
			try {
				file.close();
				buffRead.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		wordCount count = new wordCount();
		String filePath = System.getProperty("user.dir") + "\\src\\Samplewords.txt";
		count.totalWordCount(filePath);
	}

}
