package com.mindtree.practice;

import java.util.Arrays;

public class RepeatedInteger {

	public static void main(String[] args) {
		int arr[] = {1,1,1,1,2,2,2,5,5,5,5,3,3,3,7,7,7,0,0};
		Arrays.sort(arr);
		int n = arr.length;
		
		for(int i =0;i<n;i++) {
			int j;
			for(j =0; j<n; j++) {
				
				if(arr[i]==arr[j]) {
					break;
				}
			}
			if(i==j) {
				System.out.print(arr[i]);
			}
			
		}
		

	}

}
