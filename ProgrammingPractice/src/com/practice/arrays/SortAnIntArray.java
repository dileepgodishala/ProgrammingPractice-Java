package com.practice.arrays;

public class SortAnIntArray {
	public static void main(String args[]) {
		int ary[] = {1,9,2,6,3,6,8,1,5};
		for(int i=0;i<ary.length;i++) {
			for(int j=i+1;j<ary.length;j++) {
				if(ary[i]>ary[j]) {
					int temp =ary[i];
					ary[i]=ary[j];
					ary[j]=temp;
				}
			}
		}
		for(int arr : ary) {
			System.out.print(arr+" ");
		}
	}
}
