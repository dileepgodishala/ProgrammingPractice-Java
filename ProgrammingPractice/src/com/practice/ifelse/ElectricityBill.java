package com.practice.ifelse;

public class ElectricityBill {
	public static void main(String args[]) {
		int unit = 400;
		if(unit<=100) {
			int amount = (unit*1)/100;
			System.out.println(amount + " consumed per " + unit);
		}
		else if(unit>100 && unit<300) {
			int amount = (unit*2)/100;
			System.out.println(amount + " consumed per " + unit);
		}
		else if(unit>=300) {
			int amount = (unit*5)/100;
			System.out.println(amount + " consumed per " + unit);
		}
	} 
}
