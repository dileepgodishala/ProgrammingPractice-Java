package com.practice.arrays;

public class AsendingOfArray {

	public static void main(String[] args) {
		int ary[] = {6, 1, 3, 7, 5};
		
		// 1, 2, 3, 5, 7
		// 2>1  ---> 1 , 2, 3, 7, 5
		// 3>
		
		int lengthOfArray = ary.length;
		
//		int ary1[] = new int[5];
		
//		int arr[] = new int[] {};
		
		int temp = 0;
		for(int i = 0;i<lengthOfArray;i++) {        //[i] =2,
			
			for(int j=i+1;j<lengthOfArray;j++) {	// [j]=1,3,7,5
				
				if(ary[i]>ary[j]) {		//2>1, 2>3,2>7,2>5
					
					temp=ary[i];
					ary[i]=ary[j];
					ary[j]=temp;
					
					System.out.println(ary[i] + " - " + ary[j] );
				}   
				
			}
			
		}
		for(int k=0;k<lengthOfArray;k++) {
			System.out.println(ary[k]);
		}

	}

}
