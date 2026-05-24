package com.practice.forloop;

public class TableOf7StopAt50 {

	public static void main(String[] args) {
		for(int i=1;i<=70;i++) {
			if(i%7==0) {
				int result = i;
				if(result>50) {
					break;
				}
				System.out.println(result);
			}
			
		}

	}

}
