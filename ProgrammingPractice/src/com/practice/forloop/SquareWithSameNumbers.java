package com.practice.forloop;

public class SquareWithSameNumbers {

	public static void main(String[] args) {
		SquareWithSameNumbers ss = new SquareWithSameNumbers();
		ss.sameNumSquare(4);
		
	}
	public void sameNumSquare(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}


//  1111
//  2222
//  3333
//  4444