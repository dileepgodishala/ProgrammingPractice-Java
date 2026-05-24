package com.practice.forloop;

public class UpperAndLowerCases {

	public static void main(String[] args) {
		int cnt1=0, cnt2=0;
		String name = "PoOrojgffNiMa";
		for(int i =0;i<=name.length()-1;i++) {
			if(name.charAt(i)>='A' && name.charAt(i)<='Z' ) {
				cnt1++;
			}
			else if(name.charAt(i)>='a' && name.charAt(i)<='z') {
				cnt2++;
			}
		}
		System.out.println("Uppercase " + cnt1 + " Lowercase " + cnt2 );
	}

}
