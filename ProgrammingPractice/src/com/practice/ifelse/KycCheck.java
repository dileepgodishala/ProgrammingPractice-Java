package com.practice.ifelse;

public class KycCheck {

	public static void main(String[] args) {
		KycCheck kc = new KycCheck();
		kc.digiWallet("Yes", "No", true, false);
	}
	public void digiWallet(String pUploaded, String aUpload, boolean fMatch, boolean isNRI) {
		if(isNRI==true && (pUploaded.equals("Yes")) && fMatch == true) {
			System.out.println("Aadhar is Optional");
		}
		else if(isNRI==false && (pUploaded.equals("Yes")) && fMatch == true)
		{
			System.out.println("Aadhar is mandatory for Indians");
		}
		else {
			System.out.println("KYC Completed");
		}
	}
}
