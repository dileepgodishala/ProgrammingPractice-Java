package com.practice.ifelse;

public class ExactlyOneTrue {

	public static void main(String[] args) {
		ExactlyOneTrue et = new ExactlyOneTrue();
		et.booleanTest(false, false, true);

	}
	public void booleanTest(boolean a, boolean b, boolean c) {
		if(a==true && b==false && c ==false) {
			System.out.println("True");
		}
		else if(a==false && b == true && c == false) {
			System.out.println("True");
		}
		else if(a==false && b==false && c==true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
