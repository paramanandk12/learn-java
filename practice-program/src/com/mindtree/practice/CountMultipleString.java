package com.mindtree.practice;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountMultipleString {

	public static void main(String[] args) {

		String str = "ABCEFGXYZABCCDABCAXYZABC";
		int count = 0;
		/*String strArray[] = str.split("ABC");
		 count = strArray.length;
		System.out.println(Arrays.toString(strArray));
		System.out.println("ABC = "+ count);*/

		Pattern p =Pattern.compile("ABC");
		Matcher m =p.matcher(str);
	    while (m.find()) {
	    	count++;
		}
		System.out.println(count);
	}

}
