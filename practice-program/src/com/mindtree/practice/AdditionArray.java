package com.mindtree.practice;

public class AdditionArray {

	public static void main(String[] args) {
	
		int arr[] = {4,3,1,2,4,5,8,7};
		int target =9;
		
		for(int i=0;i<arr.length;i++) {
			for (int j = i+1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if(sum == target) {
					System.out.println(arr[i]+" + "+arr[j]+" = "+target);
				}
			}
		}

	}

}
