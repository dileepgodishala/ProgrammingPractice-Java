package com.infosys.interview;

import java.util.HashSet;
import java.util.Iterator;

public class OccurenceOfWord {

	public static void main(String[] args) {
		//input = "This is cow. cow is red.";
		//output -> This = 1
		//       -> is = 2
		//       -> cow = 2
		//       -> red = 1

		// remove -".";
		//convert string to array of string
		//remove duplicates by adding it to Set of String  --- This, is, cow, red
		//count = 0
		//Set of string should be compared with array of strings  - increase count if matches
		//Print count in loop

		String input = "This is cow. This cow is red.";
		String inp = input.replace(".", "");
		String ary[] = inp.split(" ");
		//ary = This, is, cow, This, cow, is, red
		
		HashSet<String> dcf = new HashSet<String>();
		for(String s : ary) {
			dcf.add(s);
		}
		
		//dcf = This, is, cow, red
		
		Iterator<String> it = dcf.iterator();
		while(it.hasNext()) {
			int count=0;
			String str = it.next();
			
			for(String n : ary) {
				
				if(n.equals(str)) {
					count++;
				}
			}
			
			System.out.println(str +" "+ count);
			
		}			



	}

}
