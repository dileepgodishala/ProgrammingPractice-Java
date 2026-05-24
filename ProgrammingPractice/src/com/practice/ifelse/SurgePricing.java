package com.practice.ifelse;

public class SurgePricing {

	public static void main(String[] args) {
		SurgePricing sp = new SurgePricing();
		sp.surgeFare("Night", 1, 10);
		
	}
	public void surgeFare(String timeOfDay, float demandFactor,int distance) {
		double finalFare;
		int fare = distance*10;
		if(timeOfDay.equals("Night")) {

			if(demandFactor>=1.5) {
				finalFare = fare*2;
				System.out.println("Final fare is " + finalFare);
			}
			else {
				finalFare = fare*1.5;
				System.out.println("Final fare is " + finalFare);
			}
		}
		else if(timeOfDay.equals("Day")) {
			if(demandFactor>=1.5){
				finalFare = fare*1.25;
				System.out.println("Final fare is " + finalFare);
			}
		}
		else {
			System.out.println("No surge");
		}

	}
}
