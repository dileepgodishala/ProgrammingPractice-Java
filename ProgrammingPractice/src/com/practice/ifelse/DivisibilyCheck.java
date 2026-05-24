package com.practice.ifelse;

import java.util.Scanner;

public class DivisibilyCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num%3 == 0 && num%5==0 && num%7==0) {
			System.out.println("Divisible by all");
		}
		else if((num%3==0 && num%5==0) || (num%3==0 && num%7==0) || (num%5==0 && num%7==0)) {
			System.out.println("Divisible by any 2");
		}
		else if(num%3==0 || num%5==0 || num%7==0) {
			System.out.println("Divisible by 1");
		}
		
		else {
			System.out.println("Not Divisible");
		}
	}
}
