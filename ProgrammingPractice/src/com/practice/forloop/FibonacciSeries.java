package com.practice.forloop;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f=0,s=1,n=7;
		if(n>1) {
			System.out.print(f);
		}
		if(n>=2) {
			System.out.print(s);
		}
		for(int i=3;i<=n;i++) {
			int next = f+s;
			System.out.print(next);
			f=s;
			s=next;
		}

	}

}
