package com.practice.forloop;

public class MultipleOf3 {
	public static void main(String[] args) {
		MultipleOf3 mn = new MultipleOf3();
		//mn.forMultiple(50);
		//mn.whileMultiple(50);
		mn.dowhileMultiple(50);
	}
	public void forMultiple(int num) {
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				System.out.println(i + " Multiple of 3");
			}
		}
	}
	
	public void whileMultiple(int num) {
		int i = 1;
		while(i<=num) {
			if(i%3==0) {
				System.out.println(i + " Multiple of 3");
			}
			i++;
		}
	}
	
	public void dowhileMultiple(int num) {
		int i=1;
		do {
			if(i%3==0) {
				System.out.println(i + " Multiple of 3");
			}
			i++;
		}while(i<=num);
	}
}
