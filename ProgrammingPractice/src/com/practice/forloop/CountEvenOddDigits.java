


package com.practice.forloop;

public class CountEvenOddDigits {
	public static void main(String[] args) {
		int cnt1=0,cnt2=0,rem,num=35678;
		while(num>0) {
			rem = num%10;
			if(rem%2==0) {
				cnt1++;
			}
			else {
				cnt2++;
			}
			num=num/10;
		}
		System.out.println(cnt1 + " Even" + cnt2 + " Odd");
	}
}
