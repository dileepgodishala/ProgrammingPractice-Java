package com.practice.forloop;

public class TableOf5 {

	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			System.out.println("5 * " + i + " = " + 5*i);
//		}
		TableOf5 tb = new TableOf5();
		//tb.forTable(5);
		tb.whileTable(5);
		tb.dowhileTable(5);
				
	}
	public void forTable(int num) {
		for(int i =10;i>=1;i--) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}
	
	public void whileTable(int num) {
		int i=10;
		while(i>=1) {
			System.out.println(num + " * " + i + " = " + num*i);
			i--;
		}
	}
	public void dowhileTable(int num) {
		int i=1;
		do {
			System.out.println(num + " * " + i + " = " + num*i);
			i++;
		}while(i<10);
		System.out.println(num + " * " + i + " = " + num*i);
	}
}


// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
//
//..
//..
//5 * 10 = 50