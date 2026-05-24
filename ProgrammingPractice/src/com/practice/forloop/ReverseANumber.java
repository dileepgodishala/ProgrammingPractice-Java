package com.practice.forloop;

public class ReverseANumber {
	public static void main(String[] args) {
		int rem, revNum = 0, num = 12345;   // 54321
		while(num>0) {//12345, 1234, 123, 12, 1
			rem = num%10;   // 5, 4, 3, 2, 1
			revNum = (revNum*10) + rem;  //5, 54, 543, 5432, 54321
			num = num/10;   //12345/10 - 1234 , 123, 12, 1, 0.1
		}
		System.out.println(revNum);
	}
}
