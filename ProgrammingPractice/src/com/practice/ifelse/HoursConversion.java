package com.practice.ifelse;

public class HoursConversion {

	public static void main(String[] args) {
		int hr = 0;
		hourConvert(hr);
	}
	public static void hourConvert(int hr) {
		if(hr>12) {
			int hour = hr-12;
			System.out.println(hour);
		}
		else if(hr==0) {
			System.out.println("12 AM");
		}
		else {
			System.out.println("PM");
		}
		
	}
}
