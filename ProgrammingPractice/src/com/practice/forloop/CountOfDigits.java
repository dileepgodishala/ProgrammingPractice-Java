package com.practice.forloop;

public class CountOfDigits {

	public static void main(String[] args) {
		int count =0, num = 1230;
		while(num>0) {
			//int rem = num%10;   //---3
			count++;
			num= num/10;       //---12
		}
		System.out.println(count);
	}

}


//	123/10 = 12
//	12/10 = 1
// 