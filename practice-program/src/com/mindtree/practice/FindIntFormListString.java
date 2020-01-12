package com.mindtree.practice;

import java.util.ArrayList;
import java.util.List;

public class FindIntFormListString {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		strList.add("hello1");
		strList.add("hi12");
		strList.add("sanam4");

		List<Integer> intList = new ArrayList<Integer>();

		for (String str : strList) {

			char ch[] = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {

				if (ch[i] > 0 && ch[i] < 9) {
					intList.add((int) ch[i]);
				}
			}

		}

		System.out.println("new integer list==" + intList);

	}

}
