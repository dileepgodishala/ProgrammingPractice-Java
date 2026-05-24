package com.practice.forloop;

public class DontPrint10And15 {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i==10 || i==15) {
				continue;
			}
			System.out.println(i);
		}

	}

}
