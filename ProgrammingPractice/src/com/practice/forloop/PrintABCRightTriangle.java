package com.practice.forloop;

public class PrintABCRightTriangle {

	public static void main(String[] args) {
		for(char a='A';a<='D';a++) {
			for(char b='A';b<=a;b++) {
				System.out.print(b);
			}
			System.out.println();
		}

	}

}
