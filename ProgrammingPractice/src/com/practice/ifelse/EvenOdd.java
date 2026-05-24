package com.practice.ifelse;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 17;
		//IfElse ifElse = new IfElse();
		//ifElse.evenorodd(num);
		
		System.out.println(evenorodd(num));
	}

	public static String evenorodd(int num){
		if(num%2 == 0) {
			System.out.println(num + " is even");
			return "Even";
		}
		else {
			System.out.println(num + " is odd");
			return "Odd";
		}

	}

}





