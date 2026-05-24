package com.practice.ifelse;

public class TollCalculation {

	public static void main(String[] args) {
		TollCalculation tc = new TollCalculation();
		tc.tollCal(17, "Truck", 10);

	}
	public void tollCal(int time, String vType, int axles) {
		TollCalculation tc1 = new TollCalculation();
		int bFare, tFare, fare;
		if(time<=0 || time>24) {
			System.out.println("Invalid time");
		}
		else {
			if(vType.equals("Car")) {
				bFare = 100;
				if((time>=8 && time<=11) || (time>=17 && time<=20)) {
					fare = bFare + (bFare*20)/100;
					System.out.println("Fare is " + fare);
				}
			}
			else if(vType.equals("Bus")) {
				tc1.aslesCal(time, axles, 150);
			}
			else if(vType.equals("Truck")){
				tc1.aslesCal(time, axles, 200);
			}
		}
	}
	public void aslesCal(int time,int axles,int bFare){
		int fare, tFare;
		if((time>=8 && time<=11) || (time>=17 && time<=20)) {
			fare = bFare + (bFare*20)/100;
			if(axles>4) {
				tFare = fare + (bFare*10)/100;
				System.out.println("Fare is " + tFare);
			}
			else {
				System.out.println("Fare is " + fare);
			}
		}
	}
}
