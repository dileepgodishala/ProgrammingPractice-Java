package com.practice.ifelse;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		//int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digits");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		largestofthreenumbers(num1, num2, num3);
	}	

	public static void largestofthreenumbers(int num1, int num2, int num3) {
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1 + " largest");
			}
			else {
				System.out.println(num3 + " largest");
			}
		}
		else if(num2>num3) {
			System.out.println(num2 + " largest");
		}
		
	}
}	
