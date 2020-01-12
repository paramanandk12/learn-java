package com.mindtree.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountLineWordFromFile {

	public static void main(String[] arr) throws IOException {

		File file = new File("C:\\Users\\M1048697\\Desktop\\application-cloud.properties");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(isr);

		String line;
		int countWord = 0;
		int sentenceCount = 0;
		int characterCount = 0;
		int paragraphCount = 1;
		int whitespaceCount = 0;

		while ((line = reader.readLine())!= null) {
			if (line.equals("")) {
				paragraphCount++;
			}
			if (!(line.equals(""))) {

				characterCount += line.length();

				String[] wordList = line.split("\\s+");

				countWord += wordList.length;
				whitespaceCount += countWord - 1;

				String[] sentenceList = line.split("[!?.:]+");
				sentenceCount += sentenceList.length; 
				
			}
		}
		
		System.out.println("Total no.of word count ======="+countWord);
		System.out.println("Total no. of sentence ========"+sentenceCount);
		System.out.println("Total no. of character ========"+characterCount);
		System.out.println("Total no. of paragraph ========"+paragraphCount);
		System.out.println("Total no. of white space ========"+whitespaceCount);
	}

}
