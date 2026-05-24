package com.practice.ifelse;

public class DaysOfMonths {

	public static void main(String[] args) {
		DaysOfMonths dm = new DaysOfMonths();
		int numofdays= dm.daysOfMonth(2, 2000);
		System.out.println(numofdays);

	}
	public int daysOfMonth(int month, int year){
		DaysOfMonths dm1 = new DaysOfMonths();
		int days;
		if(month%2==0) {
			 days = 30;	 
		}
			if(month==8) {
				days=31;
			}
			if(month==2) {
				boolean leap = dm1.isLeapYear(year);
				if(leap== true) {
					days = 29;
				}
				else {
					days = 28;
				}
			}
		else {
			days = 31;
		}
		return days;		
	}
	public boolean isLeapYear(int year) {
		if(year%4==0 && year%400==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
