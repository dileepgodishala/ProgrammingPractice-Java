package com.practice.ifelse;

public class AtmWithdrawal {

	public static void main(String[] args) {
		AtmWithdrawal aw = new AtmWithdrawal();
		aw.withdrawal(10000, 9000, "Savings");

	}
	public void withdrawal(int total, int withdrawAmount, String accType) {
		AtmWithdrawal aw1 = new AtmWithdrawal();
		int min;
		if(withdrawAmount%100 == 0) {
			if(accType.equals("Savings")) {
				min = 1000;
				aw1.totalCheck(withdrawAmount, total, min);
			}
			else if(accType.equals("Current")) {
				min = 5000;
				aw1.totalCheck(withdrawAmount, total, min);
			}
			else {
				System.out.println("All Declined");
			}
		}

	}
	public void totalCheck(int withdrawAmount, int total, int min) {
		int bal = total - withdrawAmount;
		if(bal>=min) {
			System.out.println("Success withdrawn, Balance is: " + bal);
		}
		else {
			System.out.println("Declined");
		}
	}
}
