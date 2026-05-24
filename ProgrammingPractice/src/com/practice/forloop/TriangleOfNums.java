package com.practice.forloop;

public class TriangleOfNums {

	public static void main(String[] args) {
		TriangleOfNums tn = new TriangleOfNums();
		tn.triangleOfNumbers(4);
		tn.triangleOfSameNums(4);
		

	}

	
	public void triangleOfNumbers(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void triangleOfSameNums(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}




// 1
// 12
// 123
// 1234