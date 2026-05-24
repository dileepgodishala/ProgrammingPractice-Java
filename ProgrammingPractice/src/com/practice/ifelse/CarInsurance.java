package com.practice.ifelse;

public class CarInsurance {

	public static void main(String[] args) {
		CarInsurance ci = new CarInsurance();
		ci.carInsurance(18, 3, 1000000);

	}
	public void carInsurance(int Age, int accidCount, int carValue) {
		int premium;
		if(Age<18) {
			System.out.println("Not Eligible");
		}
		else {
			if(accidCount == 0) {
				premium = (carValue*5)/100;
				System.out.println("Premium is " + premium);
			}
			else if(accidCount == 1) {
				premium = (carValue*10)/100;
				System.out.println("Premium is " + premium);
			}
			else if(accidCount == 2 ) {
				premium = (carValue*20)/100;
				System.out.println("Premium is " + premium);
			}
			else if(accidCount>2) {
				System.out.println("Manual Review");
			}
		}
	}

}
