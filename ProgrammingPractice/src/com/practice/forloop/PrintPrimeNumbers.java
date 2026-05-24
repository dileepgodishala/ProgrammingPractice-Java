package com.practice.forloop;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i<=1)
				continue;
			boolean isPrime = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;				
					break;
				}
			} 
			if(isPrime) {
				System.out.println(i);
			}
		}


	}

}

