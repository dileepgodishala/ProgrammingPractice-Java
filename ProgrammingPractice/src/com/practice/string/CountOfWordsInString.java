package com.practice.string;
import java.util.HashSet;
import java.util.Set;

public class CountOfWordsInString {

	public static void main(String[] args) {
		String str = "This is me. this is Poornima Bandi";
		String newStr = str.toLowerCase().replace(".", "");
		System.out.println(newStr);
		String ary[] = newStr.split(" ");
		int count =0;
		Set<String> set = new HashSet<String>();
		for(int i = 0;i<ary.length;i++) {
			String eachWord = ary[i];
			set.add(eachWord);
		}
		
		System.out.println(set);
		for(String s: set) {
			for(int i =0;i<ary.length;i++) {
				if(s.equals(ary[i])) {
					count++;
				}
			}
			System.out.println(s +" "+ count);
			count=0;
		}


	}

}
