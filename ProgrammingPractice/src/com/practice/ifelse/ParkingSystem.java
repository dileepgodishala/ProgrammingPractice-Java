package com.practice.ifelse;

public class ParkingSystem {
	public static void main(String[] args) {
		
		ParkingSystem ps = new ParkingSystem();
		ps.bikeCharge(3);
		ps.carCharge(3);
		ps.truckCharge(1);
		
	}
	public int carCharge(int hrs) {
		int charge;
		if(hrs<=2) {
			charge = 30;
			System.out.println("Charge is " + charge);
		}
		else if(hrs>=3 && hrs<=5) {
			charge = 30 + (20*hrs);
			System.out.println("Charge is " + charge);
		}
		else if(hrs<5) {
			charge = 100 + (30*hrs);
			System.out.println("Charge is " + charge);
		}
		return hrs;	
	}
	public int bikeCharge(int hrs) {
		int charge;
		if(hrs<=2) {
			charge = 10;
			System.out.println("Charge is " + charge);
		}
		else if(hrs>2) {
			charge = 10 + (10*hrs);
			System.out.println("Charge is " + charge);
		}
		return hrs;	
	}
	public int truckCharge(int hrs) {
		int charge;
		if(hrs!=0) {
			charge = 200;
			System.out.println("Charge is " + charge);
		}
		else if(hrs<=0) {
			System.out.println("Invalid Hours");
		}
		return hrs;
	}
	
	
}
