package com.practice.ifelse;

import java.util.Scanner;

public class SumOfTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a+b+c;
		if(sum==180) {
			System.out.println("Valid Triangle");
		}
		else {
			System.out.println("Invalid Triangle");
		}
	}
}
