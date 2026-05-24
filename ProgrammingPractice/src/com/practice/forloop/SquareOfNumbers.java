package com.practice.forloop;

public class SquareOfNumbers {

	public static void main(String[] args) {
		SquareOfNumbers sn = new SquareOfNumbers();
		sn.squareNum(3);

	}
	
	public void squareNum(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
