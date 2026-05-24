package com.practice.ifelse;

public class PhoneNumberCheck {

	public static void main(String[] args) {
		PhoneNumberCheck pc = new PhoneNumberCheck();
		String phoneNo = "8407869081";
		pc.phoneNoValidation(phoneNo);
	}
	public String phoneNoValidation(String phoneNo) {
		
		if(phoneNo.length() != 10) {
			System.out.println("Invalid Phone Number");
		}
		else {
			char first = phoneNo.charAt(0);
			if(first =='9') {
				System.out.println("Old Series");
			}
			else if((first=='7') || (first=='8')) {
				System.out.println("New Series");
			}
			else {
				System.out.println("Invalid Number");
			}
		}
		return phoneNo;
		
	}

}
