package com.practice.forloop;

public class InvertedLeftTriangle {
	public static void main(String[] args) {
		InvertedLeftTriangle it = new InvertedLeftTriangle();
		it.invertedLeftStars(5);
		it.invertedStars(5);

	}



	public void invertedLeftStars(int num) {
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k =5;k>=i;k--) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

//  *****
//   ****
//    ***
//     **
//      *

//					i, j, k
//Rows from 1-5     i   1 ,0, 5
//space from 0-4    j   2, 1,  4
//			     	3, 2,  3
//					4, 3,  2
//					5, 4,  1
//starts from 5-1   k	
	public void invertedStars(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


//  *****     stars -->  5-1
//  ****      space -->  Not there
//  ***		  rows  -->  1-5
//  **
//  *




