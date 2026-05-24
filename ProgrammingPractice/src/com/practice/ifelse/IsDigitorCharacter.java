package com.practice.ifelse;

public class IsDigitorCharacter{
	public static void main(String args[]) {
		char ch = '*';
//		-if("1234567890".contains(String.valueOf(ch))) {
		if(ch>='0' && ch<='9'){
			System.out.println(ch + " is digit");
		}
		else if("!@#$%^&*".contains(String.valueOf(ch))){
			System.out.println(ch + " is Special Character");
		}
		else {
			System.out.println(ch + " is Character");
		}
	}
	

}
