package com.practice.ifelse;

public class ParkingLot {

	public static void main(String[] args) {
		int hr = 20;
		if(hr<=1) {
			System.out.println("Parking charge is 0");
		}
		else if(hr>=2 && hr<5) {
			System.out.println("Parking Charge is 20");
		}
		else if(hr==5){
			System.out.println("Parking Charge is 100");
		}
		else {
			int charge = 100 + (hr-5)*30;
			System.out.println("Parking Charge is " + charge);
		}

	}

}
