package com.practice.ifelse;

public class ElectricityTariff {

	public static void main(String[] args) {
		int units =550;
		int finalFare;
		int amount = 0;
		if(units>=0 && units<=100) {
			amount = units*2;
			System.out.println(amount);
		}
		else if(units>=101 && units<=200) {
			amount = units*3;
			System.out.println(amount);
		}
		else if(units>=201 && units<300) {
			amount = units*4;
			System.out.println(amount);
		}
		else if(units==300) {	// units between 300 to 500
			amount= units*5;
			System.out.println(amount);
		}
		else if(units>=500) {
			finalFare = amount+100;
			System.out.println("Final fare is " + finalFare);
		}
	}

}
