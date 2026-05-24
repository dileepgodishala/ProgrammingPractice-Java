package com.practice.ifelse;

public class DiscountLogic {

	public static void main(String[] args) {
		DiscountLogic dl = new DiscountLogic();
		dl.discountCalculation(100000, "Gold", "No");

	}
	public void discountCalculation(int amount, String mship, String fesDay){
		DiscountLogic dl1 = new DiscountLogic();
		if(fesDay.equals("Yes")) {
			if(mship.equals("Gold")) {
				dl1.calDiscount(amount, 25);
			}
			else if(mship.equals("Silver")) {
				dl1.calDiscount(amount, 15);
			}
			else if(mship.equals("Normal")) {
				dl1.calDiscount(amount, 10);
			}
		}
		else {
			if(mship.equals("Gold")) {
				dl1.calDiscount(amount, 15);
			}
			else if(mship.equals("Silver")) {
				dl1.calDiscount(amount, 10);
			}
			else if(mship.equals("Normal")) {
				System.out.println("Final Amount is " + amount);
			}
		}			
	}
	public void calDiscount( int amount, int disValue) {		
		int finalAmount = amount - (amount*disValue)/100;
		if(finalAmount>=10000) {
			int lastAmount = finalAmount - (amount*5)/100;
			System.out.println("Last Amount is " + lastAmount);
		}
		else {
			System.out.println("Final Amount is " + finalAmount);
		}
	}
}



