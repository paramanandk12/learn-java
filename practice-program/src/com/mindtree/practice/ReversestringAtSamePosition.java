package com.mindtree.practice;

public class ReversestringAtSamePosition {

	public static void main(String[] args) {

		String input = "Hello mindtree minds";
		String str[] = input.split(" ");
		String revString = "";
		
		for(int i=0; i<str.length;i++) {
			String word ="";
			word = word + str[i];
			String revWord = "";
			
			for(int j=word.length()-1;j>=0; j--) {
				revWord = revWord+word.charAt(j);
			}
			revString = revString+revWord+" ";
			}
		
		System.out.println(revString);
		
		
		/*int size = input.length();
		String[] st=null;
		st = input.split(" ");

		for (int i = 0; i < size - 1; i++) {

			int word=st[i].length();

				if (word!=0) {
					for (int k = word-1; k <= 0; k--) {
						System.out.println(st[k]);
					}

				}

			}*/
		}

	}