package com.mindtree.practice;

public class MaxStringLength {

	public static void main(String[] args) {
		String s = "hello i am paramanand";
		String str[] = s.split(" ");
	   int maxSize =0;
	   String st =null;
		for(int i = 0; i<str.length;i++) {
			
				if(str[i].length() > maxSize) {
					
					maxSize = str[i].length();
					
					st = str[i];
				}
			}
			System.out.println(st+" ==== "+st.length());
		}
		
	
}
