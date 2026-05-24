package com.practice.forloop;

public class StarRightTriangle {

	public static void main(String[] args) {
		
		StarRightTriangle st = new StarRightTriangle();
		st.rightTrianle(5);
		st.invertedRightStars(5);

	}
	
	
	public void rightTrianle(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//  *
//  **
//  ***
//  ****	
	
	public void invertedRightStars(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//       *	  rows  --- 1-5
//      **    spaces  ---- 5-1
//     ***    stars  ---- 1-5
//    ****
//   ***** 	
}

