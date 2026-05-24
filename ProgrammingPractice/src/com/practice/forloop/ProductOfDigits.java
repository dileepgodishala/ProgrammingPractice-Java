package com.practice.forloop;

public class ProductOfDigits {

	public static void main(String[] args) {
		int num=234, rem, prod=1;
		while(num>0) {
			rem=num%10;    //234, 23  --- 4,3
			prod = prod* rem;  //---4
			num = num/10;   //234  ---23
		}
		System.out.println(prod);

	}

}
