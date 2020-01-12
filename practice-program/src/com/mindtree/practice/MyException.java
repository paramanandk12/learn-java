package com.mindtree.practice;

public class MyException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);
	}
	
	public static void main(String[] args) {
		try {
			throw new MyException("hello MyException!!");
		} catch (MyException me) {
			System.out.println("hi..");
			System.out.println(me.getMessage());
		
		}
	}

}
