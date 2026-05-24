package com.practice.ifelse;

//import java.util.Scanner;

public class ExactlyTwoEqual {
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the 3 numbers");
		int a = 70;
		int b = 90;
		int c = 10;
		if(a==b && b==c) {
			System.out.println("All are equal");
		}
		else if(a==b || b==c || a==c) {
			System.out.println("Exactly Two are equal");
		}
		else{
			System.out.println("Three are different");
		}
	}
}
