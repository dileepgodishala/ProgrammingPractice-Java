package com.practice.seismic;

import java.util.Arrays;

public class SortCharactersInAString {

	public static void main(String[] args) {
		
		String unSorted = "dbcaegfhji";
		
		char[] sorted = unSorted.toCharArray();
		
		Arrays.sort(sorted);
		
		System.out.println(new String(sorted));
		
	}

}
