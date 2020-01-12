package com.mindtree.practice;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<Integer> ls = new ArrayList<Integer>();
		System.out.println(ls.size());
		ls.add(10);
		ls.add(20);
		System.out.println(ls.get(1));
		System.out.println(ls.size());
	}

}
