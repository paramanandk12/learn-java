package com.mindtree.practice;

public class UlternateUpperCaseString {

	public static void main(String[] args) {

		String x = "We are the world";
		int size = x.length();

		for (int i = 0; i < size; i++) {
			char ch = x.charAt(i);

			if (i % 2 == 0) {
				System.out.print(Character.toLowerCase(ch));
			} else {
				System.out.print(Character.toUpperCase(ch));
			}

		}

		System.out.println();

	}
}