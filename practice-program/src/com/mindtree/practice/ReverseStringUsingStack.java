package com.mindtree.practice;

import java.util.Stack;

public class ReverseStringUsingStack {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		String input = "we are the world";
		char ch;
		@SuppressWarnings("rawtypes")
		Stack stackstr = new Stack();
		
		for(int i =0; i < input.length(); i++) {
		ch=input.charAt(i);
		stackstr.push(ch);
		System.out.print(stackstr.pop());
		}

	
	}

}
