package com.practice.ifelse;

public class ClosestToZero {

	public static void main(String[] args) {
		ClosestToZero cz = new ClosestToZero();
		cz.closestNumber(2, 7, 1);
	}
	public int closestNumber(int a, int b, int c) {
		int closest = a;
		if(b<closest) {
			closest=b;	
		}
		if(c<closest){
			closest=c;
		}
		System.out.println(closest);
		return a;
		
	}
}
