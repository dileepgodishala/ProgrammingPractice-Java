package com.practice.ifelse;

import java.util.Scanner;

public class PositiveNegativeZero{
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num value");
		int num = sc.nextInt();
		PositiveNegativeZero pnz = new PositiveNegativeZero();
		pnz.posnegzero(num);
		
	} 
public String posnegzero(int num) {
	if(num>0) {
		//System.out.println(num + " is Positive");
		return "Positive";
	}
	else if(num<0) {
		//System.out.println(num + " is Negative");
		return "Negative";
	}
	else{
		//System.out.println(num + " is Zero");	
		return "Zero";
	}
}
}
