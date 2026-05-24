package com.practice.ifelse;

public class LargestOfFourNumbers {
	public static void main(String args[]) {
		int num1;
		int num2;
		int num3;
		int num4;
		largestOffour(10, 13, 5, 6);
	}
	public static void largestOffour(int num1, int num2, int num3, int num4){
		if(num1>num2) {
			if(num1>num3) {
				if(num1>num4) {
				System.out.println(num1 + " is Largest");
				}
				else {
					System.out.println(num4 + " is Largest");
				}
			}
			else {
				if(num3>num4) {
					System.out.println(num3 + " is Largest");
				}
				else {
					System.out.println(num4 + " is Largest");
				}
			}
		}
		else {
			if(num2>num3) {
				if(num2>num4) {
					System.out.println(num2 + " is Largest");
				}
				else {
					System.out.println(num4 + " is Largest");
				}
			}
			else {
				if(num3>num4) {
					System.out.println(num3 + " is Largest");
				}
				else {
					System.out.println(num4 + " is Largest");
				}
			}
		}
	}
}
