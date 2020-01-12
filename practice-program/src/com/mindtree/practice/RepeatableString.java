package com.mindtree.practice;

import java.util.Arrays;

public class RepeatableString {

	public static void main(String[] args) {

		char arr[] = { 'a', 'a', 'c', 'd', 'd', 'd', 'b', 'a' };
		Arrays.sort(arr);
		int n = arr.length;
         //int index=0;
		for (int i = 0; i < n; i++) {

			int j;
			for (j = 0; j < i; j++) {
				
				if (arr[i] == arr[j]) {
					break;
				}
			}

			
			if (j == i) {
				System.out.print(arr[i]);
			}
			
			
		}
		
	}

}
