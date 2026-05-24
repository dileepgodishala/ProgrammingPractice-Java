package com.practice.ifelse;

public class WaterBilling {

	public static void main(String[] args) {
		WaterBilling wb = new WaterBilling();
		wb.waterBill(1700);
		
	}
	public void waterBill(int liter) {
		if(liter <=500) {
			System.out.println("charge is " + 100);
		}
		else if(liter>500 && liter<1500) {
			int charge = 100 +(liter - 500)*2;
			System.out.println("charge is " + charge);
		}
		else {
			int charge = (100 + (1000*2))+(liter-1500)*5;
			System.out.println("charge is " + charge);
		}
	}

}
