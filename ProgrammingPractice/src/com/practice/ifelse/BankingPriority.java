package com.practice.ifelse;

public class BankingPriority {

	public static void main(String[] args) {
		BankingPriority bp = new BankingPriority();
		bp.bankingQueue("Elderly", 2);
	}
	public void bankingQueue(String uType, int toAhead) {
		if((uType.equals("Elderly")) || (uType.equals("Pregnant")) || (uType.equals("Disabled"))){
			System.out.println("Priority Queue");
			if(toAhead>=3) {
				System.out.println("Priority processed");
			}
			else {
				System.out.println("Wait Few Minutes");
			}
		}
		else if(uType.equals("Normal")) {
			if(toAhead>=10) {
				System.out.println("Long Wait");
			}
			else {
				System.out.println("Wait");
			}
		}
		
	}
}
