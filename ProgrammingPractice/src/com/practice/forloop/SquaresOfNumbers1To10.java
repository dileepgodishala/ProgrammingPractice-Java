package com.practice.forloop;

public class SquaresOfNumbers1To10 {
	public static void main(String[] args) {
		SquaresOfNumbers1To10 sn = new SquaresOfNumbers1To10();
		sn.forSquare(10);
		//sn.whileSquare(10);
		//sn.dowhileSquare(10);
	}
	
	
	public void forSquare(int num) {
		for(int i=1;i<=num;i++) {
			int square = i * i;
			System.out.println(square + " is square of " + i);
		}
	}
	
	public void whileSquare(int num) {
		int i=1;
		while(i<=num) {
			int square = i*i;
			System.out.println(square + " is square of " + i);
			i++;
		}
	}
	public void dowhileSquare(int num) {
		int i=1,square=1;
		do {
			square = i*i;
			System.out.println(square);
			i++;
		}while(i<=num);
		
	}
}
