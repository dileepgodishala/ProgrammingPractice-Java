package com.practice.forloop;

public class SumOfNPrimeNumbers {

	public static void main(String[] args) {
		SumOfNPrimeNumbers sp = new SumOfNPrimeNumbers();
		sp.sumOfPrime(20);
		
	
	}
	
	public void sumOfPrime(int num) {
		int sum =0;
		for(int i = 2;i<=num;i++) {
				boolean isPrime = true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				sum=sum+i;
				
		}
		System.out.println(sum);
	}
}
