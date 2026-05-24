package com.practice.ifelse;

public class RailwayTicketFare{
	public static void main(String args[]) {
		int age1 = 30;
		int baseFare1 = 1000;
		int ageCh = 10;
		int baseFareCh = 1000;
		int ageSn = 60;
		int baseFareSn = 1000;
		calFare(age1, baseFare1);
		calFare(ageCh, baseFareCh);
		calFare(ageSn, baseFareSn);
	}
	public static void calFare(int age, int baseFare) {
		if(age<=12) {
			finalFare(age, baseFare, 50);
		}
		else if(age>12 && age<=35) {
			finalFare(age, baseFare, 10);
		}
		else if(age>35 && age <=85){
			finalFare(age, baseFare, 30);
		}
	}
	public static void finalFare(int age, int baseFare, int per) {
		int discount = (baseFare*per)/100;
		int finalPrice = baseFare-discount;
		System.out.println(finalPrice + " is the fare for " + age);
	}

//	public static void child(int age, int baseFare) {
//		int chFare = (baseFare*50)/100;
//		System.out.println((baseFare-chFare) + " is the fare for " + age);
//	}
//	public static void adult(int age, int baseFare)	{
//		int adFare = (baseFare*10)/100;
//		System.out.println((baseFare-adFare) + " is the fare for " + age);	
//	}
//	public static void senior(int age, int baseFare) {
//		int snFare = (baseFare*30)/100;
//		System.out.println((baseFare-snFare) + " is the fare for " + age);
//	}
}
