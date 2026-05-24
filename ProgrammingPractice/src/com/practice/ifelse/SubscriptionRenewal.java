package com.practice.ifelse;

public class SubscriptionRenewal {

	public static void main(String[] args) {
		SubscriptionRenewal sr= new SubscriptionRenewal();
		sr.renewalSystem(4, "Yes", false);

	}
	public void renewalSystem(int daysLeft, String hasAutoPay, boolean hasDueAmount) {
		if(hasDueAmount == true) {
			System.out.println("Payment Pending");
		}
		else {
			if(daysLeft<=0) {
				System.out.println("Subscription Expired");
			}
			else if(daysLeft<=3) {
				if(hasAutoPay.equals("NO")) {
					System.out.println("Auto Renewal Soon");
				}
				else {
					System.out.println("Renew Now");
				}
			}
			else {
				System.out.println("Active");
			}
		}
	}
}
