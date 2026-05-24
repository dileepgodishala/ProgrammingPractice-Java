package com.practice.forloop;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		FactorialOfNumber fn=new FactorialOfNumber();
		//fn.forFact(5);
		//fn.whileFact(5);
		fn.dowhileFact(5);
	}
	public void forFact(int num) {
		int fact=1;
		for(int i =1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	
	public void whileFact(int num) {
		int i =1, fact = 1;
		while(i<=num) {
			fact = fact*i;
			i++;
		}
		System.out.println(fact);
	}
	
	public void dowhileFact(int num) {
		int i = num, fact = 1;
		do {
			fact = fact*i;
			i--;
		}while(i>=1);
		System.out.println(fact);
	}
}










//1*2*3*4*5
//i=1 fact 1*1 = 1
//i=2 fact 1*2 = 2



// 5*4*3*2*1=120
//i	5 fact 1 =5
//i 4 fact 5 = 20
//i 3 fact 20 = 60
//i 2 fact 60 = 120
//i 1 fact 120= 120