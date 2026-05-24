package com.practice.forloop;

public class Print1to10{
	public static void main(String[] args) {
		Print1to10 pn = new Print1to10();
		//pn.forPrint1to10(10);
		//pn.whilePrint1to10(10);
		pn.dowhilePrint(10);
		
	}
	
	public void forPrint1to10(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
	}
	
	public void whilePrint1to10(int num) {
		int i=1;
		while(i<=num) {
			System.out.println(i);
			i++;
		}
	}
	
	public void dowhilePrint(int num) {
		int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=num);
	}
	
}


