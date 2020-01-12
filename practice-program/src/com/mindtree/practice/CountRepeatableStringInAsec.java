package com.mindtree.practice;

public class CountRepeatableStringInAsec {

	public static void main(String[] args) {
		String str[] = {"a","b","b","d","a","c","a","d","e"};
		
		int len = str.length;
		for(int i=0;i<len;i++) {
			
			int j;
			for(j=0;j<i;j++) {
				
				if(str[i]==str[j]) {
					break;
				}
			}
			if(i == j) {
				System.out.println(str[j]);
			}
		}
		
		

	}

}
