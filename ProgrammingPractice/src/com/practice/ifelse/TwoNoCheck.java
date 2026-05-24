package com.practice.ifelse;

public class TwoNoCheck {

	public static void main(String[] args) {
		TwoNoCheck tc = new TwoNoCheck();
		tc.numberCheck(4, 3);

	}
	public void numberCheck(int a, int b) {
		if(a<0 && b<0) {
			System.out.println("Invalid");
		}
		else if(a%2!=0 && b%2!=0) {
			System.out.println("Both are Odd");
		}
		else if(a%2!=0 || b%2!=0) {
			System.out.println("One is Odd");
		}
		else if(a%2==0 && b%2==0) {
			System.out.println("Both are not Odd");
		}
	}
}
