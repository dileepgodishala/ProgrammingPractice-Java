package com.practice.ifelse;

public class ParkingLogic {

	public static void main(String[] args) {
		ParkingLogic pl = new ParkingLogic();
		pl.parkLogic("Truck", false, true, "Big");
	}
	public void parkLogic(String vehicleType,boolean soltAvailable, boolean isVIP, String soltSize) {
		if(soltAvailable==true) {
			if(isVIP==true) {
				System.out.println("Always allowed");
			}
			else {
				System.out.println("Full");
			}
		}
		else if(vehicleType.equals("Truck")) {
			if(soltSize=="Large") {
				System.out.println("Truck Allowed");
			}
		}
		else if(vehicleType.equals("Car")) {
			if((soltSize=="Medium") || soltSize=="Large") {
				System.out.println("Car Allowed");
			}
		}
		else if(vehicleType.equals("Bike")) {
			System.out.println("Bike Allowed");
		}
	}
}
