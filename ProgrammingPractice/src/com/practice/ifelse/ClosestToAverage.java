package com.practice.ifelse;

public class ClosestToAverage {

	public static void main(String[] args) {
		int a =5;
		int b = 20;
		int c = 3;
		int closest;
		int avg = (a+b+c)/3;
		
		//AVG = 7
		//a>AVG	->	a-AVG=3
		//b>AVG -> AVG-b = 2
		//c == AVG -> AVG-c = 0
		if(a>avg) {
			closest = a-avg;
			System.out.println("Closest Number is " + closest);
		}
		else if(b>avg) {
			closest = b-avg;
			System.out.println("Closest Number is " + closest);
		}
		else if(c>avg) {
			closest = c-avg;
			System.out.println("Closest Number is " + closest);
		}
		

	}
}
