package com.practice.forloop;

public class Skip10From1To20 {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i==10) {
				continue;
			}
			System.out.println(i);
		}

	}

}
