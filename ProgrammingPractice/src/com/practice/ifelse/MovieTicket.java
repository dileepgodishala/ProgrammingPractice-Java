package com.practice.ifelse;

public class MovieTicket {

	public static void main(String[] args) {
		MovieTicket mov = new MovieTicket();
		mov.ticketLogic(30, "Evening", "No");
	}
	public void ticketLogic(int age, String timeSlot, String isHoliday) {
		int fare;
		MovieTicket mt = new MovieTicket();
		if(age<0) {
			System.out.println("Invalid");
		}
		else {
			if(age<12) {
				if(timeSlot.equals("Matine")) {
					fare=100;
					mt.holidayCheck(isHoliday, fare);
				}
				else if(timeSlot.equals("Evening")) {
					fare=150;
					mt.holidayCheck(isHoliday, fare);
				}
			}
			else if(age>=12 && age<=59) {
				if(timeSlot.equals("Matine")) {
					fare =150;
					mt.holidayCheck(isHoliday, fare);
				}
				else if(timeSlot.equals("Evening")) {
					fare=200;
					mt.holidayCheck(isHoliday, fare);
				}
			}
			else if(age>60) {
				if(timeSlot.equals("Matine")) {
					fare=120;
					System.out.println(fare);
					mt.holidayCheck(isHoliday, fare);
				}
				else if(timeSlot.equals("Evening")) {
					fare=150;
					System.out.println(fare);
					mt.holidayCheck(isHoliday, fare);
				}
			}
		}
	}
	public void holidayCheck(String isHoliday, int fare) {
		if(isHoliday.equals("Yes")) {
			 int finalFare = fare + 50;
			 System.out.println("Final fare is " + finalFare);
		}
		else {
			System.out.println("Final fare is " + fare);
		}
	}


}
