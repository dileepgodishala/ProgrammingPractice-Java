package com.practice.forloop;

public class StarsPyramid {
	public static void main(String[] args) {
		StarsPyramid sp = new StarsPyramid();
		sp.pyramidDisplay(5);
	}
	
	
	
	public void pyramidDisplay(int num) {
		for(int i=0;i<num;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}


//     *     
//    ***    
//   *****
//  *******
// *********



// No of rows   -> 1-5
// No of 1st spaces -> 4-0
// stars  --> 1,3,5,7,9   2*i+1
//No of 2nd spaces -> 4-0