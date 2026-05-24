package com.practice.forloop;

public class Reverse10to1 {

	public static void main(String[] args) {
		Reverse10to1 rn = new Reverse10to1();
		//rn.forReverse(10);
		//rn.whileReverse(10);
		rn.dowhileReverse(10);

	}
	public void forReverse(int num) {
		for(int i=num;i>=1;i--) {
			System.out.println(i);
		}
	}
	
	public void whileReverse(int num) {
		int i=num;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	public void dowhileReverse(int num) {
		int i=num;
		do {
			System.out.println(i);
			i--;
		}while(i>=1);
	}
}

