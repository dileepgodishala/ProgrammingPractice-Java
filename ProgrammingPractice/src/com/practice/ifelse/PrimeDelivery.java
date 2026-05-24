package com.practice.ifelse;

public class PrimeDelivery {

	public static void main(String[] args) {
		int amount = 400;
		String userType = "Normal";
		deliveryFee(amount, userType);

	}
	public static void deliveryFee(int amount, String userType) {
		if(userType.equals("Prime")) {
			System.out.println("Free Delivery");
		}
		else {
			if(amount>=500) {
				System.out.println("Free Delivery");
			}
			else if(amount>200 && amount<=499){
				int totalAmount = amount + 40;
				System.out.println(totalAmount);

			}
			else if(amount<=200) {
				int totalAmount = amount + 60;
				System.out.println(totalAmount);
			}

		}
	}

}
