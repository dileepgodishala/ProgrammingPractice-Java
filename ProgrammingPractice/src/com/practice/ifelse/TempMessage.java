package com.practice.ifelse;

public class TempMessage {
	public static void main(String args[]) {
		int temp = 2;
		tempCal(temp);
	}
	public static void tempCal(int temp) {
		if(temp>=40) {
			System.out.println("It's very hot");
		}
		else if(temp<=40 && temp>30) {
			System.out.println("It's hot");
		}
		else if(temp<=30 && temp>20){
			System.out.println("It's Warm");
		}
		else if(temp<=20 && temp>10) {
			System.out.println("It's Cold");
		}
		else if(temp<=10) {
			System.out.println("It's Very Cold");
		}
		
	}
}
