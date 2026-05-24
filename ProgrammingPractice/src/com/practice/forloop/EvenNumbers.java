package com.practice.forloop;

public class EvenNumbers{
	public static void main(String[] args) {
		EvenNumbers en = new EvenNumbers();
		//en.forEven(20);
		//en.whileEven(20);
		en.dowhileEven(20);
	}
	public void forEven(int num) {
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public void whileEven(int num) {
		int i=1;
		while(i<=num) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public void dowhileEven(int num) {
		int i=1;
		do {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}while(i<=num);
	}

}
