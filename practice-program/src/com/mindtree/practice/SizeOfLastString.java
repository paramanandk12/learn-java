package com.mindtree.practice;

public class SizeOfLastString {

	public static void main(String[] args) {
		String str = "i am the geniuses";
		
		String ch[] = str.split(" ");
		int i;
		
		for( i=0; i<ch.length-1; i++) {
		
			
			if(i==ch.length) {
				
				break;
		      }
			

		}
		System.out.print(ch[i].length());
		
	}
	}


