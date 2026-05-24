package com.practice.forloop;

public class PrintAtoZ {
	public static void main(String[] args) {
		PrintAtoZ az = new PrintAtoZ();
		//az.forPrint('Z');
		//az.whilePrint('Z');
		az.dowhilePrint('z');
	}


	public void forPrint(char alpha) {
		for(char c = 'A';c<=alpha;c++) {
			System.out.println(c);
		}
	}

	public void whilePrint(char alpha) {
		char c='A';
		while(c<=alpha) {
			System.out.println(c);
			c++;
		}
	}
	public void dowhilePrint(char alpha) {
		char c = 'a';
		do {
			System.out.println(c);
			c++;
		}while(c<=alpha);
	}
}
