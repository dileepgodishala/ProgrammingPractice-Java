package com.practice.ifelse;

public class MobileRecharge {

	public static void main(String[] args) {
		MobileRecharge mr = new MobileRecharge();
		mr.rechargeCal(400);

	}
	public int rechargeCal(int amount) {
		
		if(amount<100){
			System.out.println("Talktime Only");
		}
		else if(amount>=100 && amount <=199) {
			System.out.println("Talktime + 1GB");
		}
		else if(amount>=200 && amount <=299) {
			System.out.println("Talktime + 2GB + 28days Validity");
		}
		else if(amount>=300) {
			if(amount==301) {
				System.out.println("Special Offer:Unlimited calls 28 days");
			}
			else {
				System.out.println("Unlimited Calls + 2GB/day");
			}
		}
			
		return amount;
	}

}
